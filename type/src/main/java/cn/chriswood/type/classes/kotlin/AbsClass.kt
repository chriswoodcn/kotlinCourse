package cn.chriswood.type.classes.kotlin

abstract class AbsClass {
    abstract fun absMethod()
    open fun overridable() {
        println("AbsClass func overridable")
    }

    fun nonOverridable() {}
}