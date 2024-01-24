package cn.chriswood.kotlincourse.basics

fun main() {
    val max : String = maxOf<String>("Hello", "World")

    val list = List.Cons(1.0, List.Nil)

    val result : Result<String>? = Result.success("Hello")
    if(result != null){
        println(result.isSuccess)
    }


}

fun <T> maxOf(a: T, b: T): T {
    println(a)
    println(b)
    return b
}

sealed class IntList {
    object Nil : IntList(){
        override fun toString(): String {
            return "Nil"
        }
    }
    data class Cons(val head: Int, val tail: IntList) : IntList(){
        override fun toString(): String {
            return "$head, $tail"
        }
    }

    fun joinToString(sep: Char = ','): String {
        return when(this){
            Nil -> "Nil"
            is Cons -> "${this.head}$sep${this.tail.joinToString(sep)}"
        }
    }
}

sealed class List<T> {
    object Nil : List<Any>(){
        override fun toString(): String {
            return "Nil"
        }
    }
    data class Cons<E>(val head: E, val tail: List<E>) : List<E>(){
        override fun toString(): String {
            return "$head, $tail"
        }
    }

    fun joinToString(sep: Char = ','): String {
        return when(this){
            Nil -> "Nil"
            is Cons -> "${this.head}$sep${this.tail.joinToString(sep)}"
        }
    }
}
