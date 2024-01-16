package cn.chriswood.demo

class Calculator {
    companion object {
        /**
         * input: 3 * 4
         */
        @JvmStatic
        fun main(vararg args: String) {
            if (args.size < 3) {
                return showHelp()
            }

            val operators = mapOf(
                "+" to Companion::plus,
                "-" to Companion::minus,
                "*" to Companion::times,
                "/" to Companion::div
            )

            val op = args[1]
            val opFunc = operators[op] ?: return showHelp()

            try {
                println("Input: ${args.joinToString(" ")}")
                println("Output: ${opFunc(args[0].toInt(), args[2].toInt())}")
            } catch (e: Exception) {
                println("Invalid Arguments.")
                showHelp()
            }
        }

        fun plus(arg0: Int, arg1: Int): Int {
            return arg0 + arg1
        }

        fun minus(arg0: Int, arg1: Int): Int {
            return arg0 - arg1
        }

        fun times(arg0: Int, arg1: Int): Int {
            return arg0 * arg1
        }

        fun div(arg0: Int, arg1: Int): Int {
            return arg0 / arg1
        }

        private fun showHelp() {
            println(
                """
        
        Simple cn.chriswood.demo.Calculator:
            Input: 3 * 4
            Output: 12
    """.trimIndent()
            )
        }
    }
}
