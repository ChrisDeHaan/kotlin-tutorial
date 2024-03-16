fun main () {
//    var userName: String = "John"
//    userName = "Chris"
//
//    var age: Int = 22
//    age = 31

    // Kotlin infers what the type is based on the value you assign it
//    var kotlinInfers = "test"
//    kotlinInfers = 3

    // Int min is -2147483648 and max is 2147483647
    val maxIntegerValue= Int.MAX_VALUE // can be written like this since it's inferred
    val minIntegerValue: Int = Int.MIN_VALUE

    // Byte min is -128 and max is 127 (size/width of 8)
    val myMaxByteValue= Byte.MAX_VALUE // can be written like this since it's inferred
    val myMinByteValue: Byte = Byte.MIN_VALUE

    // Short min is -32768 and max is 32767 (size/width of 16)
    val myMaxShortValue= Short.MAX_VALUE // can be written like this since it's inferred
    val myMinShortValue: Short = Short.MIN_VALUE

    // Long min is -9223372036854775808 and max is 9223372036854775807 (size/width of 32)
    val myMaxLongValue = Long.MAX_VALUE // can be written like this since it's inferred
    val myMinLongValue: Long = Long.MIN_VALUE

    // another way to assign long is to add L at the end
    val testNumber = 28L

    println("Max long value is: $myMaxLongValue")
    println("Min long value is: $myMinLongValue")
}