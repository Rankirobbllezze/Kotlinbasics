fun main(){
    println("Welcome to the club ")
    println("Enter Your age: ")
    val age = readln().toIntOrNull() ?: 0
    println("Do You Have A VIP Pass? (yes/no) ")
    val hasVipPass = readln().equals("yes", ignoreCase = true)
    println("Are You A member? (yes/no) ")
    val isMember = readln().equals("yes", ignoreCase = true)
    println("Your age is " +  age)
    println(hasVipPass)
    println(isMember)

    when {
        age < 18 -> println("Entry to the club denied")
        age >= 18 -> println("Entry to the club granted")

    }


}