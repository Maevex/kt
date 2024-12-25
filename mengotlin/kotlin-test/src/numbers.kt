fun main() {
    val intNumber = 100 //32 bit
    val longNum : Long = 100 // size lebih besar dari int //64 bit
    val longNumber = 100L //penulisan long dengan menambahkan suffix l
    val shortNum : Short = 10 //16 bit
    val byteNum : Byte = 7 //8bit

    //desimal
    val doubleNum : Double = 18.2 //64 bit
    val floatNum: Float = 0.6f //32 bit

    val maxInt = Int.MAX_VALUE //digunakan untuk melihat max value dari int
    val minInt = Int.MAX_VALUE

    val a = 2
    val b = 3

    println(a + b)


    val byteNumber: Byte = 2
    val intNum: Int = byteNumber.toInt() //konversi byte ke integer
    
}