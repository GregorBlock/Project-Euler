import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class P18Test {
    @Test
    fun `only one row`() {
        val expected = 3
        val triangle = arrayOf(
                intArrayOf(3),
        )
        assertEquals(expected, P18.maximumPathSumI(triangle))
    }

    @Test
    fun `multi level triangle with one path`() {
        val expected = 3 + 7
        val triangle = arrayOf(
                intArrayOf(3),
                intArrayOf(7, 4),
        )
        assertEquals(expected, P18.maximumPathSumI(triangle))
    }

    @Test
    fun `multi level triangle with two path`() {
        val expected = 3 + 7 + 4
        val triangle = arrayOf(
                intArrayOf(3),
                intArrayOf(7, 4),
                intArrayOf(2, 4, 6),
        )
        assertEquals(expected, P18.maximumPathSumI(triangle))
    }

    @Test
    fun `multi level triangle with three path`() {
        val expected = 3 + 7 + 4 + 9
        val triangle = arrayOf(
                intArrayOf(3),
                intArrayOf(7, 4),
                intArrayOf(2, 4, 6),
                intArrayOf(8, 5, 9, 3)
        )
        assertEquals(expected, P18.maximumPathSumI(triangle))
    }

    @Test
    fun `final`() {
        P18.main()
    }
}