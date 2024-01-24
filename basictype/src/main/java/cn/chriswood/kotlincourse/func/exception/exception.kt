package cn.chriswood.kotlincourse.func.exception

fun main() {
    val num: Int? = null
    //try 是一个表达式，意味着它可以有一个返回值
    //try-表达式的返回值是 try 块中的最后一个表达式或者是（所有）catch 块中的最后一个表达式。
    //finally 块中的内容不会影响表达式的结果。
    val a: Int? = try {
        num
    } catch (e: NumberFormatException) {
        null
    }
    val name: String? = null
    //在 Kotlin 中 throw 是表达式，所以你可以使用它（比如）作为 Elvis 表达式的一部分
    val s = name ?: throw IllegalArgumentException("Name required")
}

//throw 表达式的类型是 Nothing 类型。 这个类型没有值，而是用于标记永远不能达到的代码位置。
//在你自己的代码中，你可以使用 Nothing 来标记一个永远不会返回的函数：
fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}