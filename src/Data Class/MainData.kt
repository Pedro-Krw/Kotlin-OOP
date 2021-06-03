fun main() {

    listData()


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

    val dataTengah: Int = 11;
    val dataAwal: Int = 7
    val DataPrivate = ArrayList<Int>()
    DataPrivate.add(20)
    DataPrivate.add(30)
    DataPrivate.add(40)
    DataPrivate.add(50)
    DataPrivate.add(60)
    DataPrivate.add(70)

    if (dataTengah > dataAwal){
        print(DataPrivate + nameList())
    }

    return DataPrivate
}
