import kotlin.reflect.KMutableProperty
import kotlin.reflect.KProperty

class Animal {
    var name :String by DelegateName()
    var type :String = "cat"
    var weight :Double = 12.2
    var age :Int = 2

    fun eat(){
        println("im eating")
    }

    fun sleep(){
        println("Im sleeping")
    }

}

fun main() {

    val myCat = Animal()
    myCat.name = "katge"
    println("Nama : ${myCat.name} jenis hewan : ${myCat.type} berat : ${myCat.weight} Usia : ${myCat.age}")
    myCat.eat()
    myCat.sleep()

    myCat.name = "neko"
    myCat.type = "kucing"
    myCat.weight = 1.5

    println("Nama : ${myCat.name} jenis hewan : ${myCat.type} berat : ${myCat.weight} Usia : ${myCat.age}")


    //primary constructor
    val newPersonCons = person("Agus", 0.0, 23)
    println("nama : ${newPersonCons.name}, Berat ${newPersonCons.weight}, ${newPersonCons.age}")

    //secondary constructor
    val newMhs = secondConst("Arif", 23.2, 24, "272323", 2)
    newMhs.identity()
    


}

class DelegateName { //delegasi merupakan class yang digunakan untul mengatur setter dan getter
    private var value: String = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>) : String {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String){
        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class DelegateGenericClass { //delegasi dengan any
    private var value: Any = "Default"

    operator fun getValue(classRef: Any, property: KProperty<*>): Any {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any, property: KProperty<*>, newValue: Any) {
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}


        //Primary constructor
class person ( tname :String,  tweight :Double, tage :Int)//constructor
{
    val name: String
    val weight: Double
    val age :Int


    init { //init block dapat digunakan untuk inisialisasi properti dan validasi nilai
        weight = if (tweight <= 0) 0.1 else tweight
        age = tage
        name = tname

    }

    fun primconstMarker(){
        println("Primary constructor")
    }

}

        //primary constructor jika ingin nama dari parameter header dan properti body sama
class orang ( name :String,  weight :Double, age :Int)//constructor
{
    val name: String
    val weight: Double
    val age :Int


    init { //init block dapat digunakan untuk inisialisasi properti dan validasi nilai
        this.weight = if (weight <= 0) 0.1 else weight
        this.age = age
        this.name = name

    }

}


class secondConst( name :String,  weight :Double, age :Int)//constructor
{
    val name: String
    val weight: Double
    val age :Int
    var nim :String
    var kelas :Int


    init { //init block dapat digunakan untuk inisialisasi properti dan validasi nilai
        this.weight = if (weight <= 0) 0.1 else weight
        this.age = age
        this.name = name
        this.nim = ""
        this.kelas = 0

    }

    constructor(name :String,  weight :Double, age :Int, nim :String, kelas :Int) : this(name, weight, age){
        this.nim = nim
        this.kelas = kelas
    }

    fun identity (){
        println("Halo aku $name $weight $age $nim $kelas")
        println("Secondary constructor")
    }
    //konstruktor kedua akan dipanggil jika kita memasukkan nim dan kelas

}


