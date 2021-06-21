package ExtensionFunction

class Student(val nama : String , val age :Int) {

    fun Student.sayHEllo(name : String = "kiba"){

         print("hello $name my name is $nama and my age is $age")
    }

}