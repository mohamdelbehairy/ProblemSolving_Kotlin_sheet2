fun main() {
    print("Enter Number: ")
    val number = readln().toInt()

    for(i in -number+1..0) {
        for (j in i..0) {
            print("*")
        }
        println()
    }
}