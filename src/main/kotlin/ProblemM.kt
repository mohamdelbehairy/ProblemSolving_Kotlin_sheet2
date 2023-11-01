fun main() {
    print("Enter Numbers: ")

    val(a,b) = readln().split(" ").map { it.toInt() }
    val numbers  = mutableListOf<Int>()

    for (i in a..b) {
        if (isLucky(i)) {
            numbers.add(i)
        }
    }
    if (numbers.isEmpty()) {
        println("-1")
    } else {
        println(numbers.joinToString(" "))
    }
}

fun isLucky(num:Int):Boolean {
    var number = num

    while (number > 0) {
        val x = number % 10
        if(x != 4 && x != 7) {
            return false
        }
        number /= 10
    }
    return  true
}


