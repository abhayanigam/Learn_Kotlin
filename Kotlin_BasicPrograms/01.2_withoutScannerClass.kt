/*
    Take input from user without using the Scanner class – 
    Here, we will use readline() to take input from the user and no need to import Scanner class. 
    readline()!! take the input as a string and followed by (!!) to ensure that the input value is not null.
*/

fun main() {

	print("Enter an Integer value: ")
	val string1 = readLine()!!

	// .toInt() function converts the string into Integer
	var integerValue: Int = string1.toInt()
	println("You entered: $integerValue")

	print("Enter a double value: ")
	val string2= readLine()!!

	// .toDouble() function converts the string into Double
	var doubleValue: Double = string2.toDouble()
	println("You entered: $doubleValue")
}
