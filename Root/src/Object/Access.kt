package Object

import Class.Kiba
import Class.Rata_Rata
import Class.War
import Class.Zoro


fun main() {


Peserta()



}


fun Peserta(){
    var peserta1 = Kiba()
    var peserta2 = Zoro()
    var peserta3 = War()
    var Rata_Rata = Rata_Rata()
    var Lulus : String = " Lulus  "
    var Tidak : String = " TidakLulus  "


    if (peserta1.Nilai > Rata_Rata.Rata_Rata_Nilai){
        print(peserta1.Nama + Lulus)
    }
    else{
        print(peserta1.Nama + Tidak)
    }

    if (peserta2.Nilai > Rata_Rata.Rata_Rata_Nilai){
        print(peserta2.Nama + Lulus)
    }
    else{
        print(peserta2.Nama + Tidak)
    }


    if (peserta3.Nilai > Rata_Rata.Rata_Rata_Nilai){
        print(peserta3.Nama + Lulus)
    }
    else{
        print(peserta3.Nama + Tidak)
    }



}






fun version(){
    //    val Run = app()
//    Run.Display = 70
//    Run.Setup = "  SuperAmoled  "
//    Run.Vendor = "  Panasonic"
//
//    print("${Run.Display} Innci")
//    print(Run.Setup)
//    print(Run.Vendor)
}

