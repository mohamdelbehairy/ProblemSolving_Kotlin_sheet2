fun main() {
    print("Enter sign: ")
    val sign = readln()
    print("Enter Number: ")
    val number = readln().toInt()

    val numbers = ArrayList<Int>()

    print("Enter Numbers: ")
    val numbersInputs = readln()
    val numbersWithSpace = numbersInputs.split(" ")
    numbersWithSpace.forEach {
        numbers.add(it.toInt())
    }
    inputs(numbers,sign,number)
}

fun inputs(arr:ArrayList<Int>,sign:String?,num:Int?) {
    if (num == arr.size) {
        for (i in arr) {
            println(sign?.repeat(i))
        }
    } else println("Oops try again!")
}