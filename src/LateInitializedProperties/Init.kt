package LateInitializedProperties

class Init {

    lateinit var brand : String

    fun Call(brand :String){

        this.brand = brand

    }
}