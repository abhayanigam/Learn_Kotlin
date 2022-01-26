/*
    While Loop:
    The while loop loops through a block of code as long as a specified condition is true

    Do While Loop:
    The do..while loop is a variant of the while loop. 
    This loop will execute the code block once, before checking if the condition is true, 
    then it will repeat the loop as long as the condition is true.
*/

fun main(){
    var i = 0
    while (i < 5) {
        println(i)
        i++
    }

    do {
        println(i)
        i++
    }
    while (i < 5)
}