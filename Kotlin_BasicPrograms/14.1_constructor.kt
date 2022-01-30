// A constructor is like a special function, and it is defined by using two parantheses () 
// after the class name. You can specify the properties inside of the parantheses (like passing parameters into a regular function).
// The constructor will initialize the properties when you create an object of a class. 
// Just remember to specify the type of the property/variable

class Car(var brand : String, var model : String, var year : Int)

fun main(){
    val c = Car("Ford", "Mustang", 1959) // Constructor
    val c2 = Car("BMW", "X5", 1999) // Constructor
    val c3 = Car("Tesla", "Model S", 2020) // Constructor

    println(c.brand)
    println(c.model)
    println(c.year)
    
    print("\n")
    
    println(c2.brand)
    println(c2.model)
    println(c2.year)
    
    print("\n")

    println(c3.brand)
    println(c3.model)
    println(c3.year)
}