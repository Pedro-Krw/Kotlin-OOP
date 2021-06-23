package DataClass

fun main() {
   callDataClass()
}



private fun callDataClass(){

     val CallObject = Data_Class( "Masako" , " 23 Juni 2021" , " 1000" )
     val CallObject2 = CallObject.copy(nama_Barang = "Royko")

   println(CallObject)
    print(CallObject2)

 }

