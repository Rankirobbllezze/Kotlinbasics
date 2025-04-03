// arrays are used to store multiple values in a single variable
//create an array using arrayOf() , listOf()
var car_s = arrayOf("Volvo", "BMW", "Mazda",0, arrayOf("Toyota Corolla", "Toyota X"))
//ACCESSING ELEMENTS INSIDE  AN ARRAY
//We access an element by refering to the index number inside []'s
//index position starts from 0
fun main(){
    println(cars[1]) // access element in array
//    changing an element inside an array
//    simply access element and reassign its value
    car_s[3] = "Toyota Corolla"
    car_s[4] = "Toyota X"
    println(car_s)
//    to know the nmber of elements in an array use the .size method
    println(car_s.size) // 5
//    checking if an element exists inn an array
//    use the 'in' operator
    if("Jeep" in car_s) {
        println("it exists")
    } else {
        println("It does not exists")
    }
//    looping / transversing an array , forEach ,for loop
    for(x in car_s)
        println(x)
}