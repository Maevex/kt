//safe call menjamin kode yang ditulis akan aman dari NPE
//penggunaan safe call akan mengganti . dengan ? saat mengelola nilai dari objek nullable

fun main() {
    val text:String? = null
    text?.length // contoh safe call, kompiler akan melewatkan proses jika objek null


//Elvis operator, memungkinkan untuk menetapkan nilai awal objek jika objek null

    val test:String? = null
    val textLength =  test?.length ?: 7
    /*akan mengembalikan nilai test.length jika tidak null, namun sebaliknya
    akan mengembalikan nilai 7 jika null */

    println(textLength)

//operator non null assertion (!!)

    val aduh:String? = null
    val aduhLength = aduh!!.length// kompiler akan mengizinkan kita untuk mengakses objek nullable
    //namun, itu memaksa objek untuk menjadi non null, sehingga jika objek tesebut null, akan tetap terkena NPE
}