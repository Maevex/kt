
fun setUser(name: String, age:Int): String //:string disebelah parameter merupakan return type
{
    return "My name is $name, and im $age years old"
}

fun main() {

    val user = setUser(name = "agus", age = 19)
    println(user)

    println(setUser(name = "mulyono", age = 69))

    val id = setID(id = "aaa", password = "kekw")
    val name = setName(name = "aku")
}

fun setID(id :String, password: String):Unit //unit digunakan jika tidak ingin fungsi mereturn nilai
{
    println("your id is $id, password $password")
}

fun setName(name:String) = "your name is $name" //expression body memungkinkan untuk tidak perlu menentukan return type