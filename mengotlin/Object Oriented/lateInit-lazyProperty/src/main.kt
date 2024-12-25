lateinit var nama :String // lateinit digunakan untuk menunda inisialisasi, namun hanya bisa var

fun main() {
    nama = "ilham"

    val text :String by lazy {
        "halo"
    }// lazy digunakan untuk menunda juga, namun hanya bisa menggunakan val
}