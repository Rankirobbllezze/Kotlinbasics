//when

var day = 7
fun main(){
//    basic when statement
    when(day){
        1 -> println("monday")
        2 -> println("tuesday")
        3 -> println("wednesday")
        4 -> println("thursday")
        5 -> println("friday")
        6,7 -> println("weekend")
        else -> println("Invalid Day")
    }
//    when expression
    val daytype = when(day){
        in 1..5 -> "weekday"
        6,7 -> "weekend"
        else -> "Invalid"
    }
    println(daytype)

//    when like and if .. else
    val x = 0
    when {
        x < 0 -> println("negative")
        x > 0 -> println("positive")
        x == 0 -> println("zero")
        else -> println("NaN")
    }





}