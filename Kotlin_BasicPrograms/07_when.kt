/*
    when statment:
        Instead of writing many if..else expressions,
        you can use the when expression, which is much easier to read.

    The when expression is similar to the switch statement.
*/

fun main()
{
    val day = 4
    val result = when(day){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }

    println(result)

    val day1 = 6
    when(day1){
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid day.")
    }

}