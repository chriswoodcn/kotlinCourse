package cn.chriswood.array

class KotlinArrays {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val a = IntArray(5)
            println(a.size) //same with the Collections(e.g. List)

            val b = ArrayList<String>()
            println(b.size)

            val c0 = intArrayOf(1, 2, 3, 4, 5)
            val c1 = IntArray(5) { 3 * (it + 1) } // y = 3*(x + 1)

            println(c1.contentToString())

            val d = arrayOf("Hello", "World")
            d[1] = "Kotlin"
            println("${d[0]}, ${d[1]}")

            val e = floatArrayOf(1f, 3f, 5f, 7f)
            for (element in e) {
                println(element)
            }

            e.forEach {
                println(it)
            }

            // 遍历
            for (i in 1..4) {
                print(i)  // 1234
            }

            // 设置步长
            for (i in 1..4 step 2) {
                print(i)  // 13
            }

            // for(i in 4..1)  // error
            // 如果要从大到小遍历，可以使用downTo
            for (i in 4 downTo 1 step 2) {
                print(i)  // 42
            }

            // until排除结束元素
            for (i in 1 until 4) {
                print(i)  // 123
            }
        }
    }
}

