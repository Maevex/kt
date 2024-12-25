fun main() {
    val grade = 20

    if (grade > 70) {
        println("passed")
    }
    else if (grade >= 40 && grade <= 70) {
        println("remedial")
    }
    else if (grade >= 0 && grade < 40) {
        println("Failed")
    }
    else {
        println("error")
    }
}
