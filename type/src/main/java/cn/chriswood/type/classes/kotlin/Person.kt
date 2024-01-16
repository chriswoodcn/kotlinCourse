package cn.chriswood.type.classes.kotlin

open class Person(age: Int, name: String) {
    open var age: Int = age //property
        get() {
            return field
        }
        set(value) {
            println("setAge: $value")
            field = value
        }
    open var name: String = name
        get() {
            return field // backing field
        }
        set(value) {

        }

    constructor(x: Int) : this(x, "") {
    }
}

class Student(
    override var age: Int,
    override var name: String,
    var gender: Int
) : Person(age, name) {
    override fun toString(): String {
        return "$name $age $gender"
    }
}

fun main() {
    val ageRef = Person::age
    val person = Person(18, "Bennyhuo")
    val person2 = Person(20)
    val nameRef = person::name
    ageRef.set(person, 20)
    nameRef.set("Andyhuo")
}