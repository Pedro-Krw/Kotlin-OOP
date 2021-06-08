package FunctionOverloading

class Overloading {

//    Function Over Loading adalah function yang bisa mengunakan nama function yang sama tapi
//    parameter harus berbeda entah itu dari segi tipe data
//    dan dari segi julah parameter


    var name : String = ""
    var umur1 : Int = 0

    fun sayHello(nama : String){
        name = nama

    }

    fun sayHello(nama : String = "deflt", umur :Int = 30){
        name = nama
        umur1 = umur


    }

}