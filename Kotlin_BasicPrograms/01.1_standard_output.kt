/*
    Take input from user using Scanner class – 
        If you are taking input from user other than String data type, 
        you need to use Scanner class. To use Scanner first of all you have to import the Scanner on the top of the program.  

    import java.util.Scanner;
*/

import java.util.Scanner

fun main() {
	
	// create an object for scanner class
	val number1 = Scanner(System.`in`)	
	print("Enter an integer: ")
	// var enteredNumber1:Int = number1.nextInt()
    // or
	var enteredNumber1 = number1.nextInt()
	println("You entered: $enteredNumber1")

	val number2 = Scanner(System.`in`)
	print("Enter a float value: ")
	var enteredNumber2:Float = number2.nextFloat()
	println("You entered: $enteredNumber2")

	val booleanValue = Scanner(System.`in`)
	print("Enter a boolean: ")
	var enteredBoolean:Boolean = booleanValue.nextBoolean()
	println("You entered: $enteredBoolean")
}