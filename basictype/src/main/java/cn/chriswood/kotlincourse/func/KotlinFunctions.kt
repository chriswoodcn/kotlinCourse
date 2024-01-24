package cn.chriswood.kotlincourse.func

import kotlin.math.abs
import kotlin.math.cos

class KotlinFunctions {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(args.contentToString())

            val x: (Foo, String, Long) -> Any = Foo::bar
            val x0: Function3<Foo, String, Long, Any> = Foo::bar
            // (Foo, String, Long)->Any = Foo.(String, Long)->Any = Function3<Foo, String, Long, Any>

            val y: (Foo, String, Long) -> Any = x
            val z: Function3<Foo, String, Long, Any> = x

            yy(x)

            val f: () -> Unit = Companion::foo //函数的引用
            val g: (Int) -> String = Companion::foo //函数的引用 靠编译器去推断与上一个foo的不同
            val h: (Foo, String, Long) -> Any = Foo::bar //函数的引用

            multiParameters(1, 2, 3)
            multiParameters(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

            defaultParameter(y = "Hello")

            val (a, b, c) = multiReturnValues() //伪
            val r = a + b
            val r1 = a + c

            // 如果在默认参数之后的最后一个参数是 lambda 表达式，
            // 那么它既可以作为具名参数在括号内传入，也可以在括号外传入
            foo(1) { println("hello") }     // 使用默认值 baz = 1
            foo(qux = { println("hello") }) // 使用两个默认值 bar = 0 与 baz = 1
            foo { println("hello") }        // 使用两个默认值 bar = 0 与 baz = 1

            // 用中缀表示法调用该函数
            println(1 aaa 2)
            // 等同于这样
            println(1.aaa(2))
        }

        private fun yy(p: (Foo, String, Long) -> Any): Unit {
            val p1 = p(Foo(), "Hello", 3L)
            println(p1)
        }

        class Foo {
            fun bar(p0: String, p1: Long): Any {
                return "bar $p0 $p1"
            }
        }

        private fun foo() {}
        private fun foo(p0: Int): String {
            return "foo"
        }

        private fun defaultParameter(x: Int = 5, y: String, z: Long = 0L) {
            println("$x $y $z")
        }

        private fun multiParameters(vararg ints: Int) {
            println(ints.contentToString())
        }

        private fun multiReturnValues(): Triple<Int, Long, Double> {
            return Triple(1, 3L, 4.0)
        }

        private fun foo(
            bar: Int = 0,
            baz: Int = 1,
            qux: () -> Unit,
        ) { /*……*/
            qux()
        }

        // 单表达式函数
        fun double(x: Int): Int = x * 2

        // 可变参数 带泛型
        fun <T> asList(vararg ts: T): List<T> {
            val result = ArrayList<T>()
            for (t in ts) // ts 是一个数组
                result.add(t)
            return result
        }
    }
}

// 中缀表示法
// 标有 infix 关键字的函数也可以使用中缀表示法（忽略该调用的点与圆括号）调用。
// 中缀函数必须满足以下要求：
// 它们必须是成员函数或扩展函数。
// 它们必须只有一个参数。
// 其参数不得接受可变数量的参数且不能有默认值。
// 中缀函数调用的优先级低于算术操作符、类型转换以及 rangeTo 操作符
infix fun Int.aaa(x: Int): Int {
    return this + x
}

// 伪递归函数
//Kotlin 支持一种称为尾递归的函数式编程风格。对于某些使用循环的算法，可以使用尾递归替代而不会有堆栈溢出的风险。
//当一个函数用 tailrec 修饰符标记并满足所需的形式条件时，编译器会优化该递归， 留下一个快速而高效的基于循环的版本：
tailrec fun findFixPoint(x: Double = 1.0, eps: Double = 1E-10): Double =
    if (abs(x - cos(x)) < eps) x else findFixPoint(cos(x))