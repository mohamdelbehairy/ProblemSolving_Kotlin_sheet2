fun main() {
    print("Enter number: ")
    val number = readln().toInt()

    for(i in 1..number) {
        if(i % 2 == 0) println(i)
        else continue
    }
}