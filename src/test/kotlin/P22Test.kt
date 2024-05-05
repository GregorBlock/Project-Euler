import P22.alphabeticalPosition
import P22.alphabeticalValue
import P22.inputInAlphabeticalOrder
import P22.nameScore
import P22.parseInput
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class P22Test {

    @Test
    fun `The alphabetical position of A is 1`() {
        val expected = 1
        Assertions.assertEquals(expected, 'A'.alphabeticalPosition())
    }

    @Test
    fun `The alphabetical position of C is 3`() {
        val expected = 3
        Assertions.assertEquals(expected, 'C'.alphabeticalPosition())
    }

    @Test
    fun `The alphabetical position of Z is 26`() {
        val expected = 26
        Assertions.assertEquals(expected, 'Z'.alphabeticalPosition())
    }

    @Test
    fun `Alphabetical value of COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53`() {
        val expected = 53

        Assertions.assertEquals(expected, "COLIN".alphabeticalValue())
    }

    @Test
    fun `Read names first name is MARY`() {
        val expected = "MARY"
        Assertions.assertEquals(expected, parseInput().first())
    }

    @Test
    fun `Read names last name is ALONSO`() {
        val expectedName = "ALONSO"
        Assertions.assertEquals(expectedName, parseInput().last())
    }

    @Test
    fun `Value by its alphabetical position, COLIN is 938th name in the list`() {
        val expected = "COLIN"
        Assertions.assertEquals(expected, inputInAlphabeticalOrder()[938 - 1])
    }

    @Test
    fun `Name score of COLIN 938 * 53 = 49714`() {
        val expected = 49714
        Assertions.assertEquals(expected, nameScore(position = 938, name = "COLIN"))
    }

    @Test
    fun `final`() {
        P22.main()
    }
}