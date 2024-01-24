package cn.chriswood.kotlincourse.type.classes

import cn.chriswood.kotlincourse.type.classes.kotlin.InitOrderDemo
import cn.chriswood.kotlincourse.type.classes.kotlin.SimpleClass


class KotlinClasses {
    companion object {
        @JvmStatic
        fun main(vararg args: String) {
            InitOrderDemo("hello")
            val simpleClass = SimpleClass(9, "Hello")
            simpleClass.simpleProperty = 123456789
            println(simpleClass.simpleProperty)
            println(simpleClass.x)
            println(simpleClass.y)
            println(simpleClass.z)
            simpleClass.y()
            simpleClass.overridable()
            simpleClass.zzz("Sleeping ZZZ!")
        }
    }
}


