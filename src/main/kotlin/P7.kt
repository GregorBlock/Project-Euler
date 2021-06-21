/**
 * Problem 7 - 10001st prime
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 *
 * Q: What is the 10 001st prime number?
 * A: 104743
 */
fun main() {
    println("10 001st prime number ${prime(10_001)}")
}

fun prime(i: Int): Long {
    var prime = 1L
    for (p in primes().take(i)) {
        prime = p
    }
    return prime
}




