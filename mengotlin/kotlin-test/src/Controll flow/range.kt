package `Controll flow`

fun main() {
    val rangeInt = 1..10 //penulisan range
    println(rangeInt.step) // untuk print step pada range, range merupakan jarak antara dua nilai

    val rangeTest = 1..10 step 2
    rangeInt.forEach {
        print("$it ")
    }
    println(rangeTest.step)

    val rangetoInt = 1.rangeTo(10)
    val downtoInt = 10.downTo(1)

    val rangeChar = 'a'.rangeTo('g')
}