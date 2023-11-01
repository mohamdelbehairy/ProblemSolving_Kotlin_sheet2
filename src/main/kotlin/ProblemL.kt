fun main() {
    print("Enter Numbers: ")
    val numbers = readln()

    val numbersList = numbers.split(" ")
    val num1 = numbersList[0].toInt()
    val num2 = numbersList[1].toInt()

    println(outputs(num1,num2))
}

fun outputs(number1:Int,numbers2:Int):Int {
    var num1 = number1
    var num2 = numbers2

    while (num2 != 0) {
        val sum = num2
        num2 = num1 % num2
        num1 = sum
    }
    return num1
}