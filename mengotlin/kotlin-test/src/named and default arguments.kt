//named argument, memungkinkan untuk tidak perlu menghafal posisi dari parameter

fun getFullname(first: String, mid: String, last: String): String{
    return "$first $mid $last"
}

fun main() {
    val fullname = getFullname( mid = "Arifin", first = "muhammad", last = "Ilham") //kita bisa mengubah posisi dari argumen
    println(fullname)
    val user = getUser()
    println(user)
}

//default argument, memungkinka untuk menentukan nilai default dari sebuah parameter

fun getUser(uname:String = "maeve", password:String = "test"): String{
    return "Username = $uname \npassword = $password"
}

