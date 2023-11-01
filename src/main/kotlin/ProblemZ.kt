fun main() {
    print("Enter Numbers: ")
    val (k, s) = readln().split(" ").map { it.toInt() }
    println(results(k,s))
}

fun results(k:Int,s:Int): Int {
    var sum = 0

    for (x in 0..k) {
        for (y in 0..k) {
            val z = s - x - y
            if (z in 0..k) {
                sum++
            }
        }
    }
    return sum
}