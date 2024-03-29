import cn.chriswood.kotlincourse.type.nullable.Person
import java.io.File


class KotlinNullables {
    companion object {
        @JvmStatic
        fun main(vararg args: String) {
//    var nonNull: String = "Hello"
//    // nonNull = null
//    val length = nonNull.length

            var nullable: String? = "Hello"
            //val length = nullable?.length
            val length = nullable?.length ?: 0 //elvis  boolean? a : b
            var x: String = "Hello"
            var y: String? = "World"

//    x = y // Type mismatch
            y = x // OK

            var a: Int = 2
            var b: Number = 10.0

//    a = b // Type mismatch
            b = a // OK

            val person = cn.chriswood.kotlincourse.type.nullable.Person()
            val title = person.title

            val titleLength = title?.length

            val file = File("abc")

            val files = file.listFiles()
            println(files?.size ?: "file has no size")
        }
    }
}


















