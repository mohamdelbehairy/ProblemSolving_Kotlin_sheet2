fun main() {
    print("Enter Number: ")
    val number = readln().toInt()

    val numbers = ArrayList<Pair<Int,Int>>()
    inputs(numbers,number)
    result(numbers)
}
fun inputs(numbers:ArrayList<Pair<Int,Int>>,num:Int) {
    println("Enter Numbers: ")
    for (i in 1..num) {
        val input = readln().split(" ").map { it.toInt() }
        val output = Pair(input[0],input[1])
        numbers.add(output)
    }
}
fun result(numbers:ArrayList<Pair<Int,Int>>) {
    for ((i,j) in numbers.withIndex()) {
        val start = if(j.first < j.second) j.first else j.second
        val end = if(j.first > j.second) j.first else j.second

        var sum = 0
        for (x in(start+1) until end) {
            if ( x % 2 != 0) {
                sum += x
            }
        }
        println(sum)
    }
}

