package LateInitializedProperties

fun main() {
     dataCall()
}

 private fun dataCall(){
     val objetc = Init()

      objetc.brand = "Samsung A51"
      print(objetc.brand)

 }