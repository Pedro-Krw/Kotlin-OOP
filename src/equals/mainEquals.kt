package equals

class mainEquals (val nama :  String) {


    override fun equals(other: Any?): Boolean {

        return  when (other) {
            is mainEquals -> other.nama == this.nama

            else -> false
        }


    }

}