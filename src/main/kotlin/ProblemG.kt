fun main() {
    print("Enter Size of Numbers: ")
    val numberCount = readln().toInt()
    val arrayList:ArrayList<Int> = ArrayList<Int>()

    inputs(arrayList,numberCount)
    outputs(arrayList)
}
fun inputs(arr:ArrayList<Int>,num:Int) {
    println("Enter Numbers: ")
    for(i in 1..num) {
        arr.add(readln().toInt())
    }
}
fun outputs(arr: ArrayList<Int>) {
    var x: List<Int> = arr

    x.forEach {
        var sum = 1
        for (i in 1..it) {
            sum *= i
        }
        println(sum)
    }
}