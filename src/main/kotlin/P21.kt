/**
 * Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
 * If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.
 *
 * For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284.
 * The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
 *
 * Q: Evaluate the sum of all the amicable numbers under 10000.
 * A: 31626
 */
object P21 {

    fun main() {
        println("Amicable numbers ${sumAmicableNumbersUnder(10_000)} ")
    }

    private fun sumAmicableNumbersUnder(n: Int): Int {
        val d = mutableMapOf<Int, Int>()
        for (i in 2 until n) {
            d[i] = sumOfProperDivisors(i)
        }
        return sumAmicableNumbers(d)
    }

    internal fun sumAmicableNumbers(d: Map<Int, Int>): Int {
        var sum = 0
        d.forEach { (k, v) ->
            if (isAmicableNumbers(d, k, v)) {
                sum += (k + v)
            }
        }
        return sum / 2
    }

    internal fun isAmicableNumbers(d: Map<Int, Int>, a: Int, b: Int): Boolean = d[b] == a && a != b

    fun sumOfProperDivisors(n: Int): Int {
        var sum = 0
        for (i in 1 until n) {
            if (i.isProperDivisorOf(n)) {
                sum += i
            }
        }
        return sum
    }

    fun Int.isProperDivisorOf(n: Int) = n.mod(this) == 0
}