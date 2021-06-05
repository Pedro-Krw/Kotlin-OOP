package App

import RootAccess.Kiba
import RootAccess.Rata_Rata
import RootAccess.War
import RootAccess.Zoro


fun main() {


Peserta()



}


fun Peserta(){
    var peserta1 = Kiba()
    var peserta2 = Zoro()
    var peserta3 = War()
    var Rata_Rata = Rata_Rata()
    var Lulus : String = "Lulus"
    var Tidak : String = "Tidak Lulus"


    if (peserta1.NilaiUjian > Rata_Rata.Rata_Rata_Nilai){
        print(Lulus)
    }
    else{
        print(Tidak)
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

