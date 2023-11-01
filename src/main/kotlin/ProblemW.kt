fun main() {
    print("Enter Number: ")
    val number = readln().toInt()
    var x = 0
    for (i in 1..number) {
        for (y in 1..number-i) {
            print(" ")
        }
        while (x != 2 * i - 1) {
            print("*")
            ++x
        }
        println()
        x = 0
    }
    var y = 0
    for (i in (number) downTo 1) {
        for (j in 1..(number - i)) {
            print(" ")
        }
        while (y != 2 * i - 1) {
            print("*")
            ++y
        }
        println()
        y = 0
    }
}