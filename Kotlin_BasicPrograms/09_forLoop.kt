/*
    For Loop:
        Often when you work with arrays, you need to loop through all of the elements.
        To loop through array elements, use the for loop together with the in operator
*/

fun main()
{
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    for (x in cars) {
        print(x +" ")
    }

    println()

    val nums = arrayOf(1, 5, 10, 15, 20)
    for (x in nums) {
        print("$x ")
    }
}