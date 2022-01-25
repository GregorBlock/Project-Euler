import java.math.BigInteger

/**
 *  n! means n × (n − 1) × ... × 3 × 2 × 1
 *
 *  For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
 *  and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 *
 *  Q: Find the sum of the digits in the number 100!
 *  A: 648
 */
object P20 {
    fun main() {
        println("factorial ${sumOfDigits(100.factorial())} ")
    }

    internal fun sumOfDigits(n: BigInteger): Int {
        var rest = n
        var sum = 0
        while (rest > BigInteger.ZERO) {
            sum += rest.mod(BigInteger.TEN).toInt()
            rest /= BigInteger.TEN
        }
        return sum
    }

    fun Int.factorial(): BigInteger =
        (this - 1 downTo 2).fold(this.toBigInteger()) { product, n -> product * n.toBigInteger() }

    // straightforward non-functional approach
    fun Int.factorial2(): BigInteger {
        var factorial = this.toBigInteger()
        for (n in this - 1L downTo 2) {
            factorial *= n.toBigInteger()
        }
        return factorial
    }
}