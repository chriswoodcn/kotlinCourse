package cn.chriswood.func.loop

fun main() {
    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (j == 10) break@loop
            print("i:$i j:$j;")
        }
    }
    println()
    println(">>>>>>>>>>返回标签>>>>>>>>>>")
    foo()
    foo2()
}

//sampleStart
fun foo() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return // 非局部直接返回到 foo() 的调用者
        print(it)
    }
    println()
    println("this point is unreachable")
}
//sampleEnd

//sampleStart
fun foo2() {
    listOf(1, 2, 3, 4, 5).forEach lit@{
        if (it == 3) return@lit // 局部返回到该 lambda 表达式的调用者——forEach 循环
        print(it)
    }
    println()
    println(" done with explicit label")
}
//sampleEnd
//sampleStart
fun foo3() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return@forEach // 隐式标签 局部返回到该 lambda 表达式的调用者——forEach 循环
        print(it)
    }
    print(" done with implicit label")
}
//sampleEnd
//sampleStart
fun foo4() {
    listOf(1, 2, 3, 4, 5).forEach(fun(value: Int) {
        if (value == 3) return  // 局部返回到匿名函数的调用者——forEach 循环
        print(value)
    })
    print(" done with anonymous function")
}
//sampleEnd
