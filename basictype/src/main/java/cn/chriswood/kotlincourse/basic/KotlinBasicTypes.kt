package cn.chriswood.kotlincourse.basic

class KotlinBasicTypes {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var a = 2
            val b = "Hello Kotlin"

//    val c = 12345678910l // compile error.
            val c = 12345678910L // ok

            val d = 3.0 // Double, 3.0f Float

            val e: Int = 10
            //val f: Long = e // implicitness not allowed
            val f: Long = e.toLong() // implicitness not allowed

            val float1: Float = 1.0f
            val double1 = 1.0

            val g: UInt = 10u
            val h: ULong = 100000000000000000u

            val i: UByte = 1u

            println("Range of Int: [${Int.MIN_VALUE}, ${Int.MAX_VALUE}]")
            println("Range of UInt: [${UInt.MIN_VALUE}, ${UInt.MAX_VALUE}]")

            val j = "I❤️China"
            println("Value of String 'j' is: $j") // no need brackets
            println("Length of String 'j' is: ${j.length}") // need brackets
            System.out.printf("Length of String 'j' is: %d\n", j.length)

            val k = "Today is a sunny day."
            val m = String("Today is a sunny day.".toCharArray())
            println(k === m) // compare references.
            println(k == m) // compare values.

            val n = """
                <!doctype html>
                <html>
                <head>
                    <meta charset="UTF-8"/>
                    <title>Hello World</title>
                </head>
                <body>
                    <div id="container">
                        <H1>Hello World</H1>
                        <p>This is a demo page.</p>
                    </div>
                </body>
                </html>
                """.trimIndent()

            println(n)
            // 使用下划线使数字常量更易读
            val oneMillion = 1_000_000
            val creditCardNumber = 1234_5678_9012_3456L
            val socialSecurityNumber = 999_99_9999L
            val hexBytes = 0xFF_EC_DE_5E
            val bytes = 0b11010010_01101001_10010100_10010010
            println(oneMillion)
            println(creditCardNumber)
            println(socialSecurityNumber)
            println(hexBytes)
            println(bytes)
        }
    }
}