package Getter_Setter

fun main() {
 getDataSet()
}


 private  fun getDataSet(){

   val dataGet = GetterSetter()
  val getDataBarang = barang(" maling " , " makanan kaleng "  ,  20)

  var BedaRasa = getDataBarang.copy(jenis = " \n makanan kaleng besar" , nama = "Cornet")
   print(getDataBarang )
   print(BedaRasa)




 }