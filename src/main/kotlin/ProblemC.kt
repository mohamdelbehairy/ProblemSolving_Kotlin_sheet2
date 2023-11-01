fun main() {
    print("Enter Number: ")
    val number = readln().toInt()

    val arr  = ArrayList<Int>()
    input(arr,number)
    output(arr)
}
fun input(arr:ArrayList<Int>,num:Int) {
    println("Enter Numbers: ")
    for (i in 1..num) {
        arr.add(readln().toInt())
    }
}

fun output(arr:ArrayList<Int>) {
    var even = 0
    var odd = 0
    var positive = 0
    var negative = 0
    for (i in arr) {
        if (i > 0) {
            positive++
        } else {
            if (i < 0) {
                negative++
            }

        }
        if (i % 2 == 0) {
            even++
        } else {
            odd++
        }
    }
    println("Even: $even")
    println("Odd: $odd")
    println("Positive: $positive")
    println("Negative: $negative")
}