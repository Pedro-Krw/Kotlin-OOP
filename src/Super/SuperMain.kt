package Super

   open  class SuperMain {

    var tanggal = " "
   var hari = " "
       var hari2 = "selasa"
       var tanggal2 = "60"

    open fun getDate(){

        tanggal = "20 "
        hari = "senin"


    }



}

  class  getDay : SuperMain() {

      var date1 = "30 \n"
      var day1 = "minggu"

     override  fun getDate(){

         super.tanggal = "30 \n"
         super.hari = "Minggu \n"

         print(tanggal)
         print(hari)
         print(super.hari2)
         print(super.tanggal2)
     }


  }




