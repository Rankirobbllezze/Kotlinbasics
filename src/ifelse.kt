// Kotlin has the following conditions
// 1. use of if to specify that a block of code is to be executed if a condition is true
// 2. use of else to specify if the above condition is false
// 3. elseif to add new conditions to our test
// 4. when to specify many alternative to be executed
var a = 38
var b = 38
fun main(){
    if(a > b){
        println("$a is greater than $b")
    } else if(a < b){
        println("$a is less than $b")
    } else if(a == b){
        println("$a is equal to $b")
    }
    else {
        println("$a is not greater than $b")
    }
}