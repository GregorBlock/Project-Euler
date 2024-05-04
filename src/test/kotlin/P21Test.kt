import P21.isAmicableNumbers
import P21.isProperDivisorOf
import P21.sumAmicableNumbers
import P21.sumOfProperDivisors
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class P21Test {

    @Test
    fun `3 are positive proper divisors of 6`() {
        val expected = true
        Assertions.assertEquals(expected, 3.isProperDivisorOf(6))
    }

    @Test
    fun `1, 2, and 3 are positive proper divisors of 6, and the sum is 6`() {
        val expected = 6
        Assertions.assertEquals(expected, sumOfProperDivisors(6))
    }

    @Test
    fun `The proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110, than d(220) = 284`() {
        val expected = 284
        Assertions.assertEquals(expected, sumOfProperDivisors(220))
    }

    @Test
    fun `The proper divisors of 284 are 1, 2, 4, 71 and 142, so d(284) = 220`() {
        val expected = 220
        Assertions.assertEquals(expected, sumOfProperDivisors(284))
    }

    @Test
    fun `If d(a) = b and d(b) = a, where a != b, then a and b are an amicable pair`() {
        val expected = true
        val d = mapOf(6 to 6, 220 to 284, 284 to 220)
        Assertions.assertEquals(expected, isAmicableNumbers(d, 220, 284))
    }

    @Test
    fun `When d(220) = 284 and d(284) = 220, than the sum is 504`() {
        val expected = 504
        val d = mapOf(6 to 6, 220 to 284, 284 to 220)
        Assertions.assertEquals(expected, sumAmicableNumbers(d))
    }

    @Test
    fun `final`() {
        P21.main()
    }
}