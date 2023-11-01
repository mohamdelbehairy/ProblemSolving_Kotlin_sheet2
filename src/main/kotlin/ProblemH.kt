fun main() {
    print("Enter Number: ")
    var number = readln().toInt()

    if(number > 0) {
        when {
            number == 1 -> println("No")
            number in 2..3 -> println("Yes")
            number % 2 == 1 && number % 3 != 0 -> println("Yes")
            else -> println("No")
        }
    } else println("Input Positive Number")
}
