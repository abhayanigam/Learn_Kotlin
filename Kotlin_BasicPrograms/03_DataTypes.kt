fun main(){
    /* 
    val myNum: Int = 5
    val myDoubleNum: Double = 5.99
    val myLetter: Char = 'D'          
    val myBoolean: Boolean = true
    val myText: String = "Hello"
    val myByte: Byte = 100
    val myShort : Short = 5000
    val myLong : Long = 15000000000L
    val myFloat : Float = 5.75F
    */
    //or
    val myInt = 5             // Int (store whole numbers, positive or negative (such as 123 or -456))
                                        // (The Int data type can store whole numbers from -2147483648 to 2147483647)
    val myDouble = 5.99       // Double (The Double data type can store fractional numbers from 1.7e−308 to 1.7e+038)
    val myLetter = 'D'        // Char (The Char data type is used to store a single character.)
    val myBoolean = true      // Boolean (The Boolean data type and can only take the values true or false)
    val myText = "Hello"      // String (The String data type is used to store a sequence of characters (text))
    val myByte = 100          // Byte (The Byte data type can store whole numbers from -128 to 127)
    val myShort = 5000        // Short (The Short data type can store whole numbers from -32768 to 32767)
    val myLong = 15000000000L // Long (The Long data type can store whole numbers from -9223372036854775808 to 9223372036854775808.)
    val myFloat = 5.75F       // Float (The Float data type can store fractional numbers from 3.4e−038 to 3.4e+038.)

    // Difference Between Int and Long
    // A whole number is an Int as long as it is up to 2147483647. 
    // If it goes beyond that, it is defined as Long:

    val myNum1 = 2147483647  // Int
    val myNum2 = 2147483648  // Long

    // Type Conversion
    // To convert a numeric data type to another type, you must use one of the following functions: toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble() or toChar():

    val x: Int = 5
    val y: Long = x.toLong()
    println(y)
}