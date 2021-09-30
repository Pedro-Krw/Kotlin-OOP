

fun main() {

    val tampung = Laptop("", "" , "1080" , "browser" ,
    "Merah" , "2019" , 4
        ).on()
    print(tampung)

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
       print(text)
   }

   fun off(){
       print("$text_2")
   }
}