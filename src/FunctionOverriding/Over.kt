package FunctionOverriding

open  class Over {

    var firtsnama : String = ""
    var age : String = ""

    constructor( lastName : String = "nameUser" , middleName : String = "UserAge"){

        firtsnama = lastName
        age = middleName


    }


    fun  getOver (){

        print(" Sa Pnya umur : $age")
        print("sa pu nama $firtsnama")

    }



    class Overriding () : Over ("" , ""){

        override fun toString(): String {

            print("$firtsnama = ini yang di ubah")

            return super.toString()
        }


    }



}