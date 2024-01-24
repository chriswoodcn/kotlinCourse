package cn.chriswood.kotlincourse.array

class KotlinArrays {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val a = IntArray(5)  //对应java int[]
            println(a.size) //same with the Collections(e.g. List)

            val b = ArrayList<String>()
            println(b.size)

            val c0 = intArrayOf(1, 2, 3, 4, 5)
            val c1 = IntArray(5) { it } // y = 3*(x + 1)
            val c2 = IntArray(5) { it -> 3 * (it + 1) }

            println(c1.contentToString())
            println(c2.contentToString())

            val d = arrayOf("Hello", "World")
            d[1] = "Kotlin"
            println("${d[0]}, ${d[1]}")

            val floatArray = floatArrayOf(1f, 3f, 5f, 7f)
            for (element in floatArray) {
                println(element)
            }

            floatArray.forEach {
                println(it)
            }
            if (floatArray.any { it == 1f }) {
                println("1f存在于floatArray中")
            }

            val array = intArrayOf(1, 2, 3, 4, 5)

            // 判断元素是否存在于数组中
            if (array.contains(3)) {
                println("元素存在于数组中")
            } else {
                println("元素不存在于数组中")
            }

            // 遍历
            for (i in 1..4) {
                print(i)  // 1234
            }
            println()
            // 设置步长
            for (i in 1..4 step 2) {
                print(i)  // 13
            }
            println()
            // for(i in 4..1)  // error
            // 如果要从大到小遍历，可以使用downTo
            for (i in 4 downTo 1 step 2) {
                print(i)  // 42
            }
            println()
            // until排除结束元素
            for (i in 1 until 4) {
                print(i)  // 123
            }
            println()
        }
    }
}

