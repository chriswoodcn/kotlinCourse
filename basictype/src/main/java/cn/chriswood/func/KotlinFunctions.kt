package cn.chriswood.func

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
    }
}


