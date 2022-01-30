/*
    OOP stands for Object-Oriented Programming.

    Object-oriented programming has several advantages over procedural programming:
        > OOP is faster and easier to execute
        > OOP provides a clear structure for the programs
        > OOP helps to keep the Kotlin code DRY "Don't Repeat Yourself", and makes the code easier to maintain, modify and debug
        > OOP makes it possible to create full reusable applications with less code and shorter development time
    Tip: 
        The "Don't Repeat Yourself" (DRY) principle is about reducing the repetition of code. 
        You should extract out the codes that are common for the application, and place them at a single place and reuse them instead of repeating it.

    Classes and objects are the two main aspects of object-oriented programming.
    
    >The difference between class and objects:

            class           -->     Object
            Fruit                       Apple
                                        Banana
                                        Mango

        Another example:

            class           -->     Object
            Car                         Volvo
                                        Audi
                                        Toyota

    > Everything in Programming Language is associated with classes and objects, 
    along with its properties and functions. 

    > For example: 
        In real life, a car is an object. 
        The car has properties, such as brand, weight and color, and functions, such as drive and brake.
        
    > A Class is like an object constructor, or a "blueprint" for creating objects.
*/

class Car {
    var brand = ""
    var model = ""
    var year = 0
}

    fun main() {
        val c1 = Car()

        c1.brand = "Ford"
        c1.model = "Mustang"
        c1.year = 1969

        val c2 = Car()

        c2.brand = "BMW"
        c2.model = "X5"
        c2.year = 1999
    
        println(c1.brand)
        println(c1.model)
        println(c1.year)
        
        println(c2.brand)
        println(c2.model)
        println(c2.year)
}