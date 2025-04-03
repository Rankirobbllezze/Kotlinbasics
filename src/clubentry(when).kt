fun main() {
    print("Enter your age: ")
    val age = readLine()?.toIntOrNull() // Read age from input and convert to Int

    if (age == null || age <= 0) {
        println("Invalid age entered.")
        return // Exit if age is invalid
    }

    if (age <= 18) {
        println("Sorry, you are not allowed entry.")
    } else {
        println("Welcome! Please enter your member number (or 'VIP' for VIP access): ")
        val memberNumber = readLine()

        if (memberNumber.equals("VIP", ignoreCase = true)) {
            println("VIP access granted! Enjoy the VIP lounge.")
        } else {
            when (memberNumber) {
                "78987" -> println("Member with drinks discount.")
                "97778" -> println("Member of the regular set.")

                else -> println("Member status not recognized.")
            }
        }
    }
}