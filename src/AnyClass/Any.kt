package AnyClass
// Any adalah super class dari semua class yang ada di kotlin
 open  class mainSaja (val name :String ) : Any(){

    fun get(){
        val merek_1 = "samsung"
        val merek_2 = "huwawei"
        val merek_3 = "nokia"
        val merek_4 = "sony"
        val merek_5 = "iphone"



    }

}


class any : mainSaja(""){

    fun dataSeler(){

        print(get())

    }

}
