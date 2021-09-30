

fun main() {

    val tampung = Laptop("laptop ini di nyalakan \n", "" , "1080" , "browser" ,
    " " , "2019" , 4
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
       if (
           text == text
       ){
           println("Red")
       }

       print(text)

   }

   fun off(){
       print("$text_2")
   }
}