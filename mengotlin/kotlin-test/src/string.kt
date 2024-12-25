fun main() {
    val text = "pepega"
    val stringIndexing = text[1];


    println(stringIndexing); //print index ke 1

    for (char in text){
        print("$char ")
    }

    val line = "line 1\n" + "Line 2\n" + "Line 3\n"
    println(text[1])

    val baris = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent() //digunakan untuk menghilangkan indentasi

    print(line)
}