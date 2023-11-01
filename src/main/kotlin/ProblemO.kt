fun main() {
    print("Enter Number: ")
    val number = readln().toInt()

    for (i in 1..number) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}