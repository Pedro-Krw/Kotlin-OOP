fun main() {

   DataFungtion();


}


fun namaDonmain(): ArrayList<String>{
    val Domain = ArrayList<String>()
    val nama: Int = 40

    Domain.add("Nama satu")
    Domain.add("Nama dua")
    Domain.add("Nama tiga")
    Domain.add("Nama empat")
    Domain.add("Nama lima")
    Domain.add("Nama lima "+ nama.toString())


    print(Domain)
    return  Domain
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
    DataPrivate.add(80)
    DataPrivate.add(90)
    DataPrivate.add(100)

    if (dataTengah > dataAwal){
        print(DataPrivate + nameList())
    }

    return DataPrivate
}


fun DataFungtion(){
    val dataPertama: Int = 10
    val dataKemungkinan : Int = 20 * 2
    val dataKetiga : Int  = 40
    val hasil = dataKemungkinan * dataKetiga * nameList().size

    if (dataPertama <= 12 ){

        print(hasil)
    }



}

