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
    if(age <= 18){
        println("Entry to the club denied")

    } else if(isMember){
        println("Can You Please Enter Your Lucky Number")
        val number = readln().toIntOrNull() ?: 0
        println("You can take free drinks member,  " + number)

    } else if(hasVipPass){
        println("You Hve been granted a VIP Lounge access, Enjoy your is time in ROBBLLEZZE Club")
    }
    else {
        println("Entry to the club granted")
    }


}
