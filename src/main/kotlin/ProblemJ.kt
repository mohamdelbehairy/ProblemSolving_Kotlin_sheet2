fun main() {
    print("Enter Number: ")
    val number = readln().toInt()
    println(primeNumber(number))

}
fun isPrime(num: Int): Boolean {
    if (num <= 1) {
        return false
    }
    for (i in 2..<num) {
        if(num % i == 0) {
            return  false
        }
    }
    return  true
}
fun primeNumber(n: Int) {
    for (i in 2..n) {
        if (isPrime(i)) {
            print(" $i ")
        }
    }
}