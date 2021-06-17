package hashCode

// hashcode adalah function yang di gunakan sebagai representasi dari angka unit dari object yang kita buat

class HashCode (val namaku : String) {

//    hashCode di gunakan untuk menganti sebuah object yang berbeda untuk menjadi sama dalam bentuk number dan ini
//    adalah kebalikan dari equals
    override fun hashCode(): Int {
        return namaku.hashCode()
    }



}