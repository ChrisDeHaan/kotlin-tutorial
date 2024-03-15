fun main () {
    var userName: String = "John"
    userName = "Chris"

    var age: Int = 22
    age = 31

    // Kotlin infers what the type is based on the value you assign it
    var kotlinInfers = "test"
    kotlinInfers = 3

    println("Hello $userName! Your age is $age.")
}