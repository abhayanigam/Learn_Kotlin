/*
    The usual logical conditions from mathematics:

        > Less than: a < b
        > Less than or equal to: a <= b
        > Greater than: a > b
        > Greater than or equal to: a >= b
        > Equal to a == b
        > Not Equal to: a != b

    If Else has the following conditionals:

            > Use if to specify a block of code to be executed, if a specified condition is true
            > Use else to specify a block of code to be executed, if the same condition is false
            > Use else if to specify a new condition to test, if the first condition is false
            > Use when to specify many alternative blocks of code to be executed
*/

fun main(){
    val time = 22
    if (time < 10) {
        println("Good morning.")
    } else if (time < 20) {
        println("Good day.")
    } else {
        println("Good evening.")
    }

    // If..Else Expressions : can also use if..else statements as expressions (assign a value to a variable and return it)
    val time = 20
    val greeting = if (time < 18) {
        "Good day."
    } else {
        "Good evening."
    }
    println(greeting)

    // Note: You can ommit the curly braces {} when if has only one statement:
    val time1 = 20
    val greeting1 = if (time1 < 18) "Good day." else "Good evening."
    println(greeting1)
}