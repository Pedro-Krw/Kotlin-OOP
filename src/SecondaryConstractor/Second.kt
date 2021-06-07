package SecondaryConstractor

fun main() {
  DataOrang()
}

  fun DataOrang(){
      val Data1 = MainSecond("nama ini di manipulasi    ", "umur ini di manipulasi juga \n")
      val Data2 = MainSecond("methus ")
      val Data3 = MainSecond()

      print(Data1.Orang1)
      print(Data1.Umur)
      print(Data2.Orang1)
      print(Data2.Umur)
      print(Data3.Orang1)
      print(Data3.Umur)


  }
