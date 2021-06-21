import kotlin.math.floor
import kotlin.math.sqrt

/**
 * Problem 3 - Largest prime factor
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * Q: What is the largest prime factor of the number 600851475143 ?
 * A: 6857
 */
fun main() {
    println("Largest prime factor ${primeFactors(600851475143L)}")
}

fun primes(): Sequence<Long> {
    var i = 2L
    return sequence {
        generateSequence { i++ }
                .filter { n ->
                    when {
                        n == 1L -> false
                        n < 4 -> true
                        n.rem(2) == 0L -> false
                        n < 9 -> true
                        n.rem(3) == 0L -> false
                        else -> {
                            val r = floor(sqrt(n.toDouble()))
                            var f = 5

                            while (f <= r) {
                                if (n.rem(f) == 0L || n.rem(f + 2) == 0L) return@filter false
                                f += 6
                            }
                            true
                        }
                    }
                }
                .forEach { yield(it) }
    }
}

fun primeFactors(of: Long): Long {
    var temp = of
    var prime = 1L
    for (p in primes().takeWhile { temp > 1 }) {
        val rem = temp.rem(p)
        if (rem == 0L) {
            prime = p
            temp = temp.div(p)
        }
    }
    return prime
}