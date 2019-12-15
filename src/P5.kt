/**
 * Problem 5 - Smallest multiple
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *
 * Q: What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * A: 232792560
 */
fun main() {
    println("Smallest multiple ${smallestMultiple(20)}")
}

fun smallestMultiple(to: Int): Int {
    var number = 1
    var result = 0
    var temp = 0
    while (temp != to) {
        for (x in 1 until to + 1) {
            if (number.rem(x) == 0) {
                temp++
            } else {
                temp = 0
                break
            }
            result = number
        }
        number++
    }
    return result
}


