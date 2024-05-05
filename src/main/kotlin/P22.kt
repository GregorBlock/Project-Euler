/**
 * Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand
 * first names, begin by sorting it into alphabetical order. Then working out the alphabetical value
 * for each name, multiply this value by its alphabetical position in the list to obtain a name score.
 *
 * For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53
 * is the 938th name in the list. So, COLIN would obtain a score of 938 + 53 = 49714.
 *
 *
 * Q: What is the total of all the name scores in the file?
 * A: 871198282
 */
object P22 {

    fun main() {
        println("Names Scores ${totalNameScore(inputInAlphabeticalOrder())} ")
    }

    internal fun parseInput() = readInput(name = "P22").first().split(",").map { it.trim('"') }

    internal fun inputInAlphabeticalOrder() = parseInput().sorted()

    private fun totalNameScore(namesInAlphabeticalOrder: List<String>): Int {
        var totalNameScore = 0
        namesInAlphabeticalOrder.forEachIndexed { index, name ->
            totalNameScore += nameScore(position = index + 1, name = name)
        }
        return totalNameScore
    }

    internal fun nameScore(position: Int, name: String) = position * name.alphabeticalValue()

    fun Char.alphabeticalPosition(): Int {
        val alphabet = charArrayOf(
            'A',
            'B',
            'C',
            'D',
            'E',
            'F',
            'G',
            'H',
            'I',
            'J',
            'K',
            'L',
            'M',
            'N',
            'O',
            'P',
            'Q',
            'R',
            'S',
            'T',
            'U',
            'V',
            'W',
            'X',
            'Y',
            'Z'
        )
        return alphabet.indexOf(this) + 1
    }

    fun CharSequence.alphabeticalValue(): Int {
        var alphabeticalValue = 0
        this.forEach { c ->
            alphabeticalValue += c.alphabeticalPosition()
        }
        return alphabeticalValue
    }
}