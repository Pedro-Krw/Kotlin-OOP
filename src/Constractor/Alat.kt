package Constractor

class Alat (nama:String , alamat : String , usia : Int = 30){

    var Nama = nama
    var Alamat = alamat
    var Usia = usia

    init {
        print("nama saya $Nama")
        print("ini adalah $Alamat saya")
        print("Ini adalah $usia saya")
    }


}