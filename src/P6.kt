/**
 * Problem 6 - Sum square difference
 * The sum of the squares of the first ten natural numbers is,
 *      1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is,
 *      (1 + 2 + ... + 10)^2 = 55^2 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 *
 * Q: Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 * A: 25164150
 */
fun main() {
    println("Smallest multiple ${sumSquareDifference(100)}")
}

fun sumSquareDifference(limit: Int): Int {

    val sumOfSquares = (2 * limit + 1) * (limit + 1) * limit / 6
    val squareOfSum = limit * (limit + 1) / 2

    return (squareOfSum * squareOfSum) - sumOfSquares
}
/*
fun sumSquareDifferenceNaive(below: Int): Int {
    var sumOfSquares = 0
    var squareOfSum = 0
    for (x in 1 until below + 1) {
        sumOfSquares += x * x
        squareOfSum += x
    }

    return (squareOfSum * squareOfSum) - sumOfSquares
}
*/

