package DataClass

fun main() {
   callDataClass()
    call()
}



private fun callDataClass(){

     val CallObject = Data_Class( "Masako" , " 23 Juni 2021" , " 1000" )
     val CallObject2 = CallObject.copy(nama_Barang = "Royko")

   println(CallObject)
    println(CallObject2)

 }

private fun call(){
    val tampung = Barang_Dua(" Gitar" , " elektronik" , " 1 juta")
    println(tampung)
}

