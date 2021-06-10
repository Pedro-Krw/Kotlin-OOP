package Inheritance



 open class Inheritance (name : String = "Alice" ,  usia : String = "30"){

     var namaa = name
     var umur  = usia


    open  fun getProperties(){

          print("nama saya adalah $namaa \n")
          print("umur saya adalah $umur  \n")
      }



 }


  class getData : Inheritance("Bobi" , "21") {





//      kosong
  }



class getNama() : Inheritance(){


    override  fun getProperties(){

//        Kita memanipulasi program fun di bagian sini atau kita mengOverride function di bagian ini
        print("nama saya adalah Teman Alice \n")
        print("umur saya adalah 23  \n")

    }
}