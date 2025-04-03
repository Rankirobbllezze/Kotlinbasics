// functions are reusable blocks of code that perform a specific task
//simple function / named function
fun greet(){
    println("Hello from the named function")
}
// function with parameters
fun greet_with_params(name: String){
    name.uppercase()
    println("Hello from the params function : $name")
}
//function with a 'return' value
fun add(a: Int, b: Int): Int {
    return a + b
}
//function with default argument
fun subtract(a: Int, b: Int): Int {
    return a - b
}
fun main(){
    greet() // invoking a function
    greet_with_params("lola") // invoking a function with params
    greet_with_params("Nokia")
    val sum = add(78890777,77777653)
    println(sum)
    val diff = subtract(20,40)
    println(diff)
}
