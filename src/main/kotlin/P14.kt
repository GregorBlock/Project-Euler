/**
 * Problem 14 - Longest Collatz sequence
 * The following iterative sequence is defined for the set of positive integers:
 *
 *                      n → n/2 (n is even)
 *                      n → 3n + 1 (n is odd)
 *
 * Using the rule above and starting with 13, we generate the following sequence:
 *
 *          13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
 * Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
 *
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 *
 * Q: Which starting number, under one million, produces the longest chain?
 * A: 837799
 */
fun main() {
    println("Longest Collatz sequence ${longestCollatzSequence(1_000_000)}")
}

fun longestCollatzSequence(limit: Int): Int {
    var collatzSequence = Int.MIN_VALUE
    var startingNum = Int.MIN_VALUE
    for (x in 1 until limit) {
        val localMax = callatzSequence(x)
        if (localMax >= collatzSequence) {
            collatzSequence = localMax
            startingNum = x
        }
    }
    return startingNum
}

private fun callatzSequence(x: Int): Int {
    var x1 = x.toLong()
    var termCount = 1
    while (x1 != 1L) {
        if ((x1 % 2) == 0L) {
            x1 /= 2
        } else {
            x1 = 3 * x1 + 1
        }
        termCount++
    }
    return termCount
}