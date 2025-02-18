fun greetUser(name: String?) {
    // println("Length of the name is: ${name.length}")
    // accesing len of name if it's not nul
    // val nameLength = name?.length
    // println("Name length is: $nameLength")

    val nameLength = name?.length ?: "Please enter a valid name"
    println(nameLength)

}

fun main(){

    greetUser("yes")
    greetUser(null)

}