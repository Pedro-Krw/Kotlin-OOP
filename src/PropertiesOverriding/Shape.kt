package PropertiesOverriding

 open class Shape ( ) {
      val data = 10
  open  val data1 : String = "ini adalah data dflt  $data "


     fun getData1(){

         print(data1)

     }



     class Data2 : Shape(){

         override  val data1 = "50"


     }

}