package cn.chriswood.kotlincourse.type.smartcast

import cn.chriswood.kotlincourse.type.smartcast.kotlin.Kotliner
import cn.chriswood.kotlincourse.type.smartcast.kotlin.Person

class KotlinCasts {

    companion object {
        @JvmStatic
        var tag: String? = null

        @JvmStatic
        fun main(vararg args: String) {

            if (tag != null) {
                println(tag?.length)
            }
            val kotliner: Kotliner = Person("benny", 20)
            if (kotliner is Person) {
                println((kotliner as? Person)?.name)
            }

            var value: String?
            value = "benny"
            if (value != null) {
                println(value.length)
            }

        }
    }
}





