import kotlin.math.sqrt

/**
 * Problem 9 - Special Pythagorean triplet
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 *
 *                      a^2 + b^2 = c^2
 *
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 *
 * Q: Find the product abc.
 * A: 31875000
 */
fun main() {
    println("Special Pythagorean triplet ${specialPythagoreanTriplet(1_000)}")
}

// straightforward approach
private fun specialPythagoreanTriplet(perimeter: Int): Double {
    for (a in 3..perimeter - 3) {
        val a2 = a * a
        for (b in a + 1..perimeter - a) {
            val b2 = b * b
            val c = sqrt(a2.toDouble() + b2.toDouble())
            if (c % 1 == 0.0) {
                if ((a + b + c.toInt()) == perimeter) {
                    return a * b * c
                }
            }
        }
    }
    throw IllegalStateException()
}