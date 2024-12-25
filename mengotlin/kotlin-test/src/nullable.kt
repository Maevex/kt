fun main() {

    val text: String? = null //kotlin memaksa untuk variabel harus terisi, jika ingin variabelnya null, tambahkan ?
//    val textLength = text.length
    // namun kita tidak bisa langsung mengakses nilai dari objek yang nullable

    val string:String = "hallo"

    if (string != null){
        println(string.length)
    } //mengakses objek nullable dengan if

    var obj:Any = "amin"
    if (obj is String){
        println("length =  ${obj.length}")
    }// kotling mengubah any menjadi string tanpa dikonversi manual
    /* mamun, hanya berfungsi jika kompiler dapat menjamin bahwa variabel
    tidak akan berubah ketika setelah diperiksa dan sebelum digunakan.*/

}

