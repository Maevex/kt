package `Controll flow`

//expression merupakan statement yang mengembalikan nilai, dan bisa disimpan pada variable

fun main() {

    val now = 10
    val open = 12

    val openHour = if (open >= now || open <= now) "office is already open" else "office is closed"

    println(openHour)

    val count = sum(valA = 10, valB = 10 * 4)
    println(count)

}

fun sum(valA : Int, valB : Int) = valA + valB