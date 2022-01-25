import P20.factorial
import P20.factorial2
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class P20Test {

    @Test
    fun `9! = 362880`() {
        val expected = 362880
        Assertions.assertEquals(expected, 9.factorial2().toInt())
    }

    @Test
    fun `10! = 3628800`() {
        val expected = 3628800
        Assertions.assertEquals(expected, 10.factorial().toInt())
    }

    @Test
    fun `10! = 3628800, and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27`() {
        val expected = 27
        Assertions.assertEquals(expected, P20.sumOfDigits(10.factorial()))
    }

    @Test
    fun `final`() {
        P20.main()
    }
}