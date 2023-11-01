fun main() {
    print("Enter Number: ")
    val number = readln().toInt()

    for (i in 1..number) {
        if(number % i == 0) {
            println(i)
        }
    }

}