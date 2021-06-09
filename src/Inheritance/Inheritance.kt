package Inheritance



class Inheritance (val nama :String = "deflt" , val umur :String = "20"){

    val name = nama
    val age = umur

     open fun GetData (){
         print(name)
         print(age)
     }



}