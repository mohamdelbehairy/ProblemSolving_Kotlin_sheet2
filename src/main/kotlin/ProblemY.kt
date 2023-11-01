fun main() {
    print("Enter Number: ")
    val number  = readln().toInt()

    for (i in 1..number) {
        val result = results(i)
        print("$result ")
    }
}

fun results(num:Int):Int {
    if(num == 1) {
        return 0
    } else if(num == 2) {
        return  1
    }

    var x = 0
    var y = 1
    var sum = 0
    for (i in 3..num) {
        sum = x + y
        x = y
        y = sum
    }
    return  sum
}

