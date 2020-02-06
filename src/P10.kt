/**
 * Problem 10 - Summation of primes
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *
 * Q: Find the sum of all the primes below two million.
 * A: 142913828922
 */
fun main() {
    println("Summation of primes ${summationOfPrimes(2_000_000)}")
}

fun summationOfPrimes(limit: Int): Long {
    var sum = 0L
    for (p in primes().takeWhile { l -> l < limit }) {
        sum += p
    }
    return sum
}
