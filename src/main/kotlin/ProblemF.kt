fun main() {
    print("Enter Number: ")
    var number = readln().toInt()

    while (number <= 12) {
        var y = 1
        while (y <= 12) {
            println("$number * $y = "+(number*y))
            y++
        }
        number++
        break
    }
}