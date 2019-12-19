/**
 * Problem 1 - Multiples of 3 and 5
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Q: Find the sum of all the multiples of 3 or 5 below 1000.
 * A: 233168
 */
fun main() {
    println("Sum of all the multiples of 3 or 5 below 1000 is ${multiplesOf3And5(1000)}")
}

fun multiplesOf3And5(below: Int): Int = (1 until below).filter { i -> i.rem(3) == 0 || i.rem(5) == 0 }.reduce { acc, i -> acc + i }
