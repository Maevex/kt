// string template memungkinkan untuk menyisipkan kata pada text

fun main() {
    val name = "mulyono"

    val age = 10
    val grade = 70

    println("Halo nama aku " + name) //tanpa string template

    println("Halo namaku $name") //dengan string template

    println("Halo namaku $name dan usiaku $age") //dapat digunakan pada integer juga

    println("${if (grade>=70) "passed" else "failed"}") //dapat digunakan untuk if juga

}