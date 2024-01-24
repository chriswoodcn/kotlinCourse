package cn.chriswood.kotlincourse.type.classes.kotlin

import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent

open class SimpleClass(var x: Int, val y: String) : AbsClass(), SimpleInf {
    override var simpleProperty: Int = 0
        get() = field * 2
    val z: Long
        get() {
            return simpleProperty * 2L
        }

    override fun absMethod() {}
    override fun simpleMethod() {}
    fun y() {}

    fun zzz(string: String) {

    }

    override fun overridable() {
        println("SimpleClass override func overridable")
        super.overridable()
    }
}

class SimpleClass2(x2: Int, y2: String) : SimpleClass(x2, y2) {
    //初始化块
    init {
        x = x2

        println("x2  = $x2")
        println("y2 = $y2")
    }

    override fun absMethod() {
        super.absMethod()
    }

    override fun overridable() {
        super.overridable()
    }
}

class Dot private constructor() {}
class Dot2 constructor(a: String) {}
class Dot3(a: String) {}
class Dot4(var a: String) {}
open class Dot5(open var a: String) {}

//sampleStart
class InitOrderDemo(name: String) {
    //在实例初始化期间，初始化块按照它们出现在类体中的顺序执行，与属性初始化器交织在一起
    val firstProperty = "First property: $name".also(::println)

    init {
        //主构造的参数可以在初始化块中使用。它们也可以在类体内声明的属性初始化器中使用
        println("First initializer block that prints $name")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }
}

//sampleEnd
class Person2(val firstName: String, val lastName: String, var isEmployed: Boolean = true)
annotation class Inject

//如果构造函数有注解或可见性修饰符，这个 constructor 关键字是必需的，并且这些修饰符在它前面
class Customer @Inject constructor(name: String) {}

//次构造函数
class Person3(val pets: MutableList<Pet> = mutableListOf())
class Pet {
    constructor(owner: Person3) {
        owner.pets.add(this) // adds this pet to the list of its owner's pets
    }
}

//嵌套类
class Outer {
    private val bar: Int = 1

    class Nested {
        fun foo() = 2
    }
}

val demo = Outer.Nested().foo() // == 2

interface OuterInterface {
    class InnerClass
    interface InnerInterface
}

class OuterClass {
    class InnerClass
    interface InnerInterface
}

//内部类
class Outer2 {
    private val bar: Int = 1

    //标记为 inner 的嵌套类能够访问其外部类的成员。
    //内部类会带有一个对外部类的对象的引用：
    inner class Inner {
        fun foo() = bar
    }
}

val demo2 = Outer2().Inner().foo() // == 1

//匿名内部类
//sampleStart
val helloWorld = object {
    val hello = "Hello"
    val world = "World"

    // object expressions extend Any, so `override` is required on `toString()`
    override fun toString() = "$hello $world"
}

//sampleEnd
class DataProvider(val name: String)

//对象声明的初始化过程是线程安全的并且在首次访问时进行
object DataProviderManager {
    private val c: ArrayList<DataProvider> = ArrayList()
    fun registerDataProvider(provider: DataProvider) {
        c.add(provider)
    }

    val allDataProviders: Collection<DataProvider>
        get() = c
}

fun useDataProviderManager() {
    DataProviderManager.registerDataProvider(DataProvider("mysql"))
    DataProviderManager.registerDataProvider(DataProvider("oracle"))
    DataProviderManager.registerDataProvider(DataProvider("mongo"))
    println(DataProviderManager.allDataProviders)
}
//对象声明可以有超类型
object DefaultListener : MouseAdapter() {
    override fun mouseClicked(e: MouseEvent) {
    }

    override fun mouseEntered(e: MouseEvent) {
    }
}
//就像数据类一样，可以使用数据修饰符标记对象声明。这指示编译器为对象生成多个函数
data object MyDataObject {
    val x: Int = 3
}