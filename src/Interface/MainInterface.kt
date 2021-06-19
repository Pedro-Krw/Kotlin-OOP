package Interface

fun main() {
    getDatainterface()
    print("data Interface")
}



  private fun getDatainterface(){

      val human = Human("kiba \n")
      val human2 = Human("kiba").sayHello( "zoro")

      print(human)
      print(human2)
  }