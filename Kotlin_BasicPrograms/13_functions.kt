/*
    function:
        A function is a block of code which only runs when it is called.
        You can pass data, known as parameters, into a function.
        Functions are used to perform certain actions, and they are also known as methods.

    To create your own function, use the fun keyword, and write the name of the function, followed by parantheses ().

    println() is a function. It is used to output/print text to the screen
*/

// Single Parameter Function
fun myFunction(fname: String){
    println(fname + " Doe")
}

// Multi Parameter Function
fun myFunction1(fname: String , age: Int){
    println(fname + " is " + age)
}

// Return Value
// To return a value, use the return keyword, 
// and specify the return type after the function's parantheses (Int in this example)

// Single Parameter Return Function
fun myFunction2(x: Int): Int {
    return (x + 5)
}

// Multi Parameter Return Function
fun myfunction3(x: Int ,y: Int): Int{
    return (x+y)
}

// Shorter Syntax for Return Values
// a shorter syntax for returning values. 
// You can use the = operator instead of return without specifying the return type. 
// Kotlin is smart enough to automatically find out what it is
fun myfunction4(a:Int , b: Int) = a+b

fun main(){
    myFunction("John")
    myFunction("Jane")
    myFunction("George")

    myFunction1("John", 35)
    myFunction1("Jane", 32)
    myFunction1("George", 15)

    println("Function - 2 : " + myFunction2(2))
    println("Function - 3 : " + myfunction3(2,8))

    println("Function - 4 : " + myfunction4(2,10))
}