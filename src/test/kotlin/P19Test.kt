import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.time.LocalDate

internal class P19Test {

    @Test
    fun `October 2000 starts with a sunday`() {
        val expected = 1L
        val start = LocalDate.parse("2000-10-01")
        val end = LocalDate.parse("2000-10-31")

        Assertions.assertEquals(expected, P19.countingSundays(start, end))
    }

    @Test
    fun `December 2000 starts with a friday`() {
        val expected = 0L
        val start = LocalDate.parse("2000-12-01")
        val end = LocalDate.parse("2000-12-31")

        Assertions.assertEquals(expected, P19.countingSundays(start, end))
    }

    @Test
    fun `final`() {
        P19.main()
    }
}