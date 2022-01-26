/*
    Arrays:
        Arrays are used to store multiple values in a single variable, 
        instead of creating separate variables for each value.

        To create an array, use the arrayOf() function, 
        and place the values in a comma-separated list inside it
*/

fun main()
{
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    println(cars[0])

    // Change an Array Element
    cars[0] = "Audi"
    println(cars[0])

    // Length / Size
    println("The size of the array ${cars.size}")

    // If an element exits in a array.
    if ("Volvo" in cars) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }

    // Loop through an Array

    println("The Elements in an Array are:")
    for (x in cars){
        println(x)
    }

    val arr = arrayOf(3,4,5,6,7,8)
    println("The Elements in an Integer Array are:")
    for (x in arr){
        println(x)
    }
}