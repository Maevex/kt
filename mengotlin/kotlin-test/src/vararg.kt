fun sumNum(vararg number: Int): Int{ //tidak bisa menggunakan 2 parameter bervararg yang berbeda
    return  number.sum()
}

fun main() {
    val sum = sumNum(10,20,30)
    println(sum)
}