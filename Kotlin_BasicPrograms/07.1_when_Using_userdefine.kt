import java.util.Scanner;

fun main() {
    var reader = Scanner(System.`in`)
    print("Enter any largebody:")
    var lb = reader.next()

    when(lb) {
        "Sun" -> println("Sun is a Star")
        "Moon" -> println("Moon is a Satellite")
        "Earth" -> println("Earth is a planet")
        else -> println("I don't know anything about it")

        /*
            Note:
                If none of the branches are satisfied with 
                the condition then it simply exits the block without printing anything to system output. 
        */
    }

    when(lb) {
        "Mercury","Earth","Mars","Jupiter"
            ,"Neptune","Saturn","Venus","Uranus" -> println("Planet")
        else -> println("Neither planet nor star")
    }
}