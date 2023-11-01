fun main() {
    print("Enter Number: ")
    val number = readln().toInt()
    var x = 0
    for (i in 1..number) {
        for (a in 1..number-i) {
            print(" ")
        }
        while (x != 2 * i - 1) {
            print("*")
            ++x
        }
        println()
        x = 0
    }
}