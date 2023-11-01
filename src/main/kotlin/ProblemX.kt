fun main() {
    print("Enter Number: ")
    val number = readln().toInt()
    val numbersList = ArrayList<Int>()
    numbers(numbersList,number)

    for (i in numbersList) {
        val b = i.toString(2)
        println(b)
        val x = b.count {it == '1'}

        val result = "1".repeat(x).toInt(2)

        println(result)
    }
}

fun numbers(arr:ArrayList<Int>,num:Int) {
    println("Enter Numbers:")
    for (i in 1..num) {
        arr.add(readln().toInt())
    }
}