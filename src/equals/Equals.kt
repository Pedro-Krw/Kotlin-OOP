package equals

fun main() {
    dataUser()

}



private fun dataUser(){

//    Ini bagian dari object yan akan menmpung nilai dari class lain
    var tampug = mainEquals()
    print(tampug.Tulisan())



    val data = "get Access"
    val key : Boolean = true
    val pass = 1234567

    val tampung = data + key

    if (data == key.toString() ){
        print(pass.toString() + data)
    }
    print(pass.toString() + data)



}
