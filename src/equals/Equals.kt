package equals

fun main() {


    dataWhen()

}

private fun dataWhen(){

    val need = mainEquals("pedro" )
    val need2 = mainEquals("pedro")

    print(need == need2)


}






private fun dataUser(){

//    Ini bagian dari object yan akan menmpung nilai dari class lain





    val data = "get Access"
    val key : Boolean = true
    val pass = 1234567

    val tampung = data + key

    if (data == key.toString() ){
        print(pass.toString() + data)
    }
    print(pass.toString() + data)



}
