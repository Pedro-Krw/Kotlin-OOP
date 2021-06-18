package Getter_Setter

class GetterSetter () {

   var title : String = ""
    var umur : String = ""
    var bulan : String

    get() {
        return title
    }

    set(value) {
     umur = value
        title = value
        bulan = value

    }



}


 data class barang(
     val nama : String ,
     val jenis : String ,
     val berat : Int){



 }