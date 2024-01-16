package cn.chriswood.type.classes.kotlin

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