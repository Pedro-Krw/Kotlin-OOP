package hashCode

// hashcode adalah function yang di gunakan sebagai representasi dari angka unit dari object yang kita buat

class HashCode (val namaku : String) {

    override fun hashCode(): Int {
        return namaku.hashCode()
    }



}