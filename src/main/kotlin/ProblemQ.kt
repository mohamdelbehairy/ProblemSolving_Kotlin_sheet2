fun main() {
    print("Enter Number: ")
    val number = readln().toInt()
    val numbers = ArrayList<Any>()
    inputs(numbers,number)
    outputs(numbers)
}

fun inputs(numbers:ArrayList<Any>,num:Int) {
    for (i in 1..num) {
        numbers.add(readln())
    }
}
fun outputs(numbers:ArrayList<Any>) {
    numbers.forEach {
        val letters = it.toString().toCharArray()
        println(letters.reversed().joinToString(" "))
    }
}

