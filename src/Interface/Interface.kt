package Interface

interface  Interaction {
    val name :String

    fun sayHello(name : String){
        print("Hello $name  , my name is ${this.name}")
    }



}

class Human(override val name: String) : Interaction{


}