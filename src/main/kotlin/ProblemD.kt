fun main() {
    t@ while (true) {
        print("Enter Password: ")
        val inputs = readln().toInt()
        val password = 1999
        if (inputs == password) {
            println("Correct")
            break@t
        } else println("Wrong")
        continue@t
    }
}

