fun main(){
    /*
        Variables are containers for storing data values.
        To create a variable, use var or val, and assign a value to it with the equal sign (=)

        val: When you create a variable with the val keyword, the value cannot be changed/reassigned.
            Example:
                    val name = "John"
                    name = "Robert"  // Error (Val cannot be reassigned)
                    println(name)

        var: you can change the value whenever you want.

        So When To Use val?
            The val keyword is useful when you want a variable to always store the same value.
            like PI (3.14159...)
    */

    var name = "Artistic"
    var surname = " Guruji"
    val number = 7

    // or
    
    /* 
        //We can also declare a variable without assigning the value, 
            and assign the value later.

        var name1 : String 
        name1= "Artistic Guruji"
     */
    var name1 : String = "Artistic Guruji"
    val number1 : Int = 6

    println("My name is $name") // $ to print var or val in between the string.
    println(number)
    
    println("Again my name is $name1")
    println(number1)

    //To combine both text and a variable, use the + character:
    println("Hello " + name)

    // We can also use the + character to add a variable to another variable
    val fullname = name + surname
    println(fullname)

    //For numeric values, the + character works as a mathematical operator
    val x = 5; val y = 6 // Single line assignment.
    print(x+y)
}