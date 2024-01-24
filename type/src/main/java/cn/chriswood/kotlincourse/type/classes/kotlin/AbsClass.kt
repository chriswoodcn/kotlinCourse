package cn.chriswood.kotlincourse.type.classes.kotlin

abstract class AbsClass {
    abstract fun absMethod()
    open fun overridable() {
        println("AbsClass func overridable")
    }

    fun nonOverridable() {}
}