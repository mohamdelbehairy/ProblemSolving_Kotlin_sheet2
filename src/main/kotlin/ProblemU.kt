fun main() {
    print("Enter Numbers: ")
    val(n,a,b) = readln().split(" ").map { it.toInt() }

    var sum = 0
    for (i in 1..n) {
        val x = outputs(i)
        if (x in a..b) {
            sum += i
        }
    }
    println(sum)
}

fun outputs(number:Int):Int {
    var num = number
    var sum = 0
    while (num > 0) {
        sum += num % 10
        num /= 10
    }
    return sum
}