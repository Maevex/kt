@file:Suppress("UNUSED_EXPRESSION")

package `Controll flow`

fun main() {
    val value  = 7

    when(value){
        6 -> {
            println("6")
            " value is 6"
        }
        7 -> {
            println("7")
            " value is 7"
        }
        8 ->{
            println("8")
            " value is 8"
        }
        9 -> {
            println("9")
            " value is 9"
        }
        else -> println("value cannot be reached")

    }
}