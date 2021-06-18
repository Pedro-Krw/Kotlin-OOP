package Getter_Setter

fun main() {
 getDataSet()
}


 private  fun getDataSet(){

   val dataGet = GetterSetter()

    print(dataGet.title)
     dataGet.title = "\n nama ini di manipulasi"
     print(dataGet.title)


 }