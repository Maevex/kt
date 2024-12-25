class Animal {
    var name :String = "catge"
        get(){
            println("memanggil getter")
            return field
        }
        set(value) {
            println("Memanggil setter")
            field = value
        }
}

fun main() {
    var myPet = Animal()
    println("pet name : ${myPet.name}")

    myPet.name = "yumi"
    println("pet name : ${myPet.name}")
}