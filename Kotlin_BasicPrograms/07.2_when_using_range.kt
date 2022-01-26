import java.util.Scanner;

fun main() {
    var reader = Scanner(System.`in`)
    print("Enter the month number of year: ")
    var num = reader.nextInt()

    when(num){
        in 1..3 -> println("It is spring season")
        in 4..6 -> println("It is summer season")
        in 7..8 -> println("It is rainy season")
        in 9..10 -> println("It is autumn season")
        in 11..12 -> println("It is winter season")
        !in 1..12 -> println("Enter valid month of year")
    }
}