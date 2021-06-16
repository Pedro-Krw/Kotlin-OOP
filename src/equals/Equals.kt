package equals

fun main() {

    dataUser()
}


  private fun dataUser(){

      val data = "get Access "
      val key : Boolean = true
      val pass = 1234567

      val tampung = data + key

      if (data == key.toString() ){
          print(tampung)
      }
      print(tampung)



  }