fun main() {
    print("Enter Number: ")
    val number = readln().toInt()

    var x = 1
    for(i in 1..number) {
        println("$x ${x+1} ${x+2} PUM")
        x += 4
    }
    
}