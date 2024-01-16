package cn.chriswood.func.operator

data class Point(val x: Int, val y: Int) {
    operator fun unaryMinus(): Point {
        return Point(-x, -y)
    }
}


data class Counter(val dayIndex: Int) {
    operator fun plus(increment: Int): Counter {
        return Counter(dayIndex + increment)
    }
}

fun main() {

    println(">>>>>>>>>> 操作符重载 >>>>>>>>>>")
// 一元前缀操作符
//    +a	a.unaryPlus()
//    -a	a.unaryMinus()
//    !a	a.not()

// 递增与递减
//  a++	a.inc() +
//  a--	a.dec() +

// 算术运算符
// a + b	a.plus(b)
// a - b	a.minus(b)
// a * b	a.times(b)
// a / b	a.div(b)
// a % b	a.rem(b)
// a..b	a.rangeTo(b)
// a..<b	a.rangeUntil(b)
    val point = Point(10, 20)
    println(-point)  // 输出“Point(x=-10, y=-20)”
    val counter = Counter(10)
    println(counter + 20)
// in 操作符
// a in b	b.contains(a)
// a !in b	!b.contains(a)

// 索引访问操作符
// a[i]	a.get(i)
// a[i, j]	a.get(i, j)
// a[i_1, ……, i_n]	a.get(i_1, ……, i_n)
// a[i] = b	a.set(i, b)
// a[i, j] = b	a.set(i, j, b)
// a[i_1, ……, i_n] = b	a.set(i_1, ……, i_n, b)

// invoke 操作符
// a()	a.invoke()
// a(i)	a.invoke(i)
// a(i, j)	a.invoke(i, j)
// a(i_1, ……, i_n)	a.invoke(i_1, ……, i_n)

// 广义赋值
// a += b	a.plusAssign(b)
// a -= b	a.minusAssign(b)
// a *= b	a.timesAssign(b)
// a /= b	a.divAssign(b)
// a %= b	a.remAssign(b)

// 相等与不等操作符
// a == b	a?.equals(b) ?: (b === null)
// a != b	!(a?.equals(b) ?: (b === null))

// 比较操作符
// a > b	a.compareTo(b) > 0
// a < b	a.compareTo(b) < 0
// a >= b	a.compareTo(b) >= 0
// a <= b	a.compareTo(b) <= 0

// 属性委托操作符

// 具名函数的中缀调用
}