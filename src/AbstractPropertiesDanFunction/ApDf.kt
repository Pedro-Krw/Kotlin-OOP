package AbstractPropertiesDanFunction

abstract class ApDf {

    abstract val name : String
    abstract fun run()


}

class Cat : ApDf(){
    override val name: String = "cat"


    override fun run() {
        print("Cat Run")
    }


}
