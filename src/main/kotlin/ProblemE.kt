fun main() {
    print("Enter Number: ")
    val numbersCount = readln().toInt()

    print("Enter Numbers: ")
    val numbers = readln()
    var numbersList = numbers.split(" ")

    if(numbersCount == numbersList.size) {
        println(numbersList.max())
    } else println("NO Matching!")
}