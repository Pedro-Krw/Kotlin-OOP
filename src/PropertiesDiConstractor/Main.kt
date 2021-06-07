package PropertiesDiConstractor

fun main() {

    DataUser()

}

   fun DataUser(){

       val user1 = Data("Edan " , "02281\n")
       val user2 = Data("Anonim terdaftar ")
       val user3 = Data()

       print(user1.user + user1.id)
       print(user2.user + user2.id)
       print(user3.user + user3.id)


   }