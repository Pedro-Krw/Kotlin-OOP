fun main() {

    nameList()
    listData()
    testing()
}
  val dataAwal: Int = 30;
  val dataTengah: Int = 10;

  fun testing(){
      val dataAwal: Int = 30;
      val dataTengah: Int = 10;

      if (dataAwal > dataTengah){
          print("yapp")
      }
  }


fun nameList(): ArrayList<String>{
   val names = ArrayList<String>()
    names.add("martin")
    names.add("jaen")
    names.add("zoro")
    names.add("kiba")
    names.add("war")

    print(names)

  return names
}


fun listData(): ArrayList<Int>{

    val DataPrivate = ArrayList<Int>()
    DataPrivate.add(20)
    DataPrivate.add(30)
    DataPrivate.add(40)
    DataPrivate.add(50)
    DataPrivate.add(60)
    DataPrivate.add(70)



    return DataPrivate
}
