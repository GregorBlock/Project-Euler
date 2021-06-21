/**
 * Problem 12 - Highly divisible triangular number
 * The sequence of triangle numbers is generated by adding the natural numbers.
 * So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:
 *
 *                          1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
 *
 * Let us list the factors of the first seven triangle numbers:
 *
 *      1: 1
 *      3: 1,3
 *      6: 1,2,3,6
 *      10: 1,2,5,10
 *      15: 1,3,5,15
 *      21: 1,3,7,21
 *      28: 1,2,4,7,14,28
 *
 * We can see that 28 is the first triangle number to have over five divisors.
 *
 * Q: What is the value of the first triangle number to have over five hundred divisors?
 * A: 76576500
 */
fun main() {
    println("Highly divisible triangular number ${divisibleTriangularNumber(500)}")
}

private fun divisibleTriangularNumber(limit: Int): Int {
    var triangular = 0
    var number = 1
    val divisors = mutableListOf<Int>()
    while (divisors.size <= limit) {
        triangular += number
        number++
        divisors.clear()
        for (x in 1..triangular) {
            if (triangular % x == 0) {
                divisors.add(x)
            }
        }
    }
    return triangular
}
