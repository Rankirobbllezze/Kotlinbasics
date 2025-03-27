fun main(){
    println("Welcome to the club entry system")
    println("Enter Your age: ")
    val age = readln().toIntOrNull() ?: 0
    println("Do You Have A VIP Pass? (yes/no) ")
    val hasVipPass = readln().equals("yes", ignoreCase = true)
    println("Are You A member? (yes/no) ")
    val isMember = readln().equals("yes", ignoreCase = true)
    println(age)
    println(hasVipPass)
    println(isMember)

}