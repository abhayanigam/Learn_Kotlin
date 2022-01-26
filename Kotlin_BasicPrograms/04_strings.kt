/*
    A string contains a collection of characters surrounded by double quotes.
    Kotlin is smart enough to understand that the given string is a string.
*/

fun main(){
    var txt = "Hello World"
    println(txt[0])
    println(txt[2])

    // String Length
    var txt2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    println("The length of the txt string is : " + txt2.length) 

    // String Functions (uppercase and lowercase)
    println(txt.toUpperCase())
    println(txt.toLowerCase())

    // Comparing String
    var txt3 = "Hello World"
    println(txt.compareTo(txt3))

    // Finding a string in a string
    var txt4 = "Please locate where 'locate' occures !"
    println(txt4.indexOf("locate"))

    // String Concatenation
    println(txt3 + " " + txt4)
    //  We can also use the plus() function to concatenate two strings
    println(txt3.plus(txt4))


}