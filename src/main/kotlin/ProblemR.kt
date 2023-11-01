fun main() {
    val numbers = ArrayList<String>()
    val number = 3
    inputs(numbers,number)
    outputs(numbers)
}
fun inputs(numbers:ArrayList<String>,num:Int) {
    println("Enter Numbers: ")
    for (i in 1..num) {
        numbers.add(readln())
    }
}

fun outputs(numbers:ArrayList<String>):Boolean {
    try {
        numbers.forEach {
            val num1 = it[0].toString().toInt()
            val num2 = it[2].toString().toInt()
            if(num2 <= 0) {
                return false
            }
            val range = if (num1 < num2) num1..num2 else num2..num1

            val arr = mutableListOf<Int>()

            range.forEach { it ->
                arr.add(it)
            }
            val sum = arr.sum()
            println(arr.joinToString(" ") + " sum = $sum")
        }
    } catch (e:NumberFormatException) {
    }
    return  true
}

