// Like Java, abstract keyword is used to declare abstract classes in Kotlin. 
// An abstract class cannot be instantiated (you cannot create objects of an abstract class).
//  However, you can inherit subclasses from can them.

// Note: Abstract classes are always open. 
// You do not need to explicitly use open keyword to inherit subclasses from them.

abstract class Person(name : String){

    /*
    The code inside the init block is the first to be executed when the class is instantiated.
    The init block is run every time the class is instantiated, with any kind of constructor as we shall see next.
    Multiple initializer blocks can be written in a class. They’ll be executed sequentially
    */

    init{
        println("My name is $name")
    }
    fun displaySSN(ssn: Int){
        println("My SSN is $ssn")
    }

    abstract fun displayJob(description: String)
}

class Teacher(name: String): Person(name) {

    override fun displayJob(description: String) {
        println(description)
    }
}

fun main() {
    val jack = Teacher("Jack Smith")
    jack.displayJob("I'm a mathematics teacher.")
    jack.displaySSN(23123)
}