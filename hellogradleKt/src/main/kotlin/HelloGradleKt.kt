import cn.chriswood.kotlincourse.HelloGradleKtJava

fun main(args: Array<String>) {
    println("Hello gradle!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    cn.chriswood.kotlincourse.HelloGradleKtJava.printName()
}