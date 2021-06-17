package hashCode

fun main() {
   getDataFromClass()
}

 private  fun getDataFromClass(){

  val getNama = HashCode("pedro \n")
  val getNama2 = HashCode("pedro \n")

   print(getNama.hashCode() == getNama2.hashCode())
  print(getNama.hashCode())
  print(getNama2.hashCode())

 }