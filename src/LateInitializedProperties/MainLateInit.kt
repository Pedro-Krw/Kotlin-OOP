package LateInitializedProperties

fun main() {
     dataCall()
}

 private fun dataCall(){
     val object1 = Init()

      object1.brand = "Samsung A51"
      print(object1.brand)

 }