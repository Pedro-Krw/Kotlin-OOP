

fun main() {

    val tampung = Laptop("laptop ini di nyalakan", "" , "1080" , "browser" ,
    "Merah" , "2019" , 4
        )
    print("${tampung.on()}")

}

class Laptop (

    val text : String = "on",
    val text_2 : String = "oof",
    val layar : String,
    val Google_chrome : String,
    val led : String,
    val vsCode : String,
    val usb_port: Int)
{
   fun on (){
       println(text)
   }

   fun off(){
       print("$text_2")
   }
}