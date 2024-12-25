package `Controll flow`

fun main() {
    val ranges = 1.rangeTo(10)
    for (i in ranges){
        println(i)
    }

    val steppedRange = 1.rangeTo(10) step 2
    for ((index, value) in steppedRange.withIndex()){
        println("value $value, index $index")
    }
    println()

    val rangeT = 1.rangeTo(10) step  2
    rangeT.forEach { value ->
        println(value)
    }


}