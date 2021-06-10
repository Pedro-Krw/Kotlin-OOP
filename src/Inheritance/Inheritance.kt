package Inheritance



 open class Inheritance (name : String = "Alice" ,  usia : String = "30"){

     var namaa = name
     var umur  = usia


      fun getProperties(){

          print("nama saya adalah $namaa \n")
          print(" umur saya adalah $umur  ")
      }



 }


  class getData : Inheritance("Bobi" , "Nick") {



//      kosong
  }