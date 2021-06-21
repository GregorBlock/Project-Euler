/**
 * Problem 17 - Number letter counts
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five,
 * then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 *
 * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23
 * letters and 115 (one hundred and fifteen) contains 20 letters.
 * The use of "and" when writing out numbers is in compliance with British usage.
 *
 * Q: If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
 * A: 21124
 */
fun main() {
    println("Number letter counts ${numberLetterCounts(1_000)}")
}

private fun numberLetterCounts(oneThousand: Int): Long {
    var accumulator = 0L
    for (i in 1 until oneThousand) {
        accumulator += handleHundreds(i)
        accumulator += handleTens(i)
    }
    accumulator += ("onethousand".length)
    return accumulator
}

private fun handleTens(i: Int): Long {
    var letterCount = 0L
    val rest = i % 100

    if (rest > 19) {
        letterCount += convertTensNumberToLetter(rest).length
        if (rest % 10 != 0) {
            letterCount += convertUniquesNumberToLetter(rest % 10).length
        }
    } else if (rest != 0) {
        letterCount += convertUniquesNumberToLetter(rest).length
    }
    return letterCount
}

private fun handleHundreds(i: Int): Long {
    var letterCount = 0L
    if (i >= 100) {
        letterCount += convertHundredsToLetter(i).length
        if (i % 100 != 0) {
            letterCount += "and".length
        }
    }
    return letterCount
}

private fun convertUniquesNumberToLetter(number: Int): String = when (number) {
    1 -> "one"
    2 -> "two"
    3 -> "three"
    4 -> "four"
    5 -> "five"
    6 -> "six"
    7 -> "seven"
    8 -> "eight"
    9 -> "nine"
    10 -> "ten"
    11 -> "eleven"
    12 -> "twelve"
    13 -> "thirteen"
    14 -> "fourteen"
    15 -> "fifteen"
    16 -> "sixteen"
    17 -> "seventeen"
    18 -> "eighteen"
    19 -> "nineteen"
    else -> throw IllegalArgumentException("not a unique: $number")
}

private fun convertHundredsToLetter(number: Int): String = when (number) {
    in 100..199 -> "onehundred"
    in 200..299 -> "twohundred"
    in 300..399 -> "threehundred"
    in 400..499 -> "fourhundred"
    in 500..599 -> "fivehundred"
    in 600..699 -> "sixhundred"
    in 700..799 -> "sevenhundred"
    in 800..899 -> "eighthundred"
    in 900..999 -> "ninehundred"
    else -> throw IllegalArgumentException("not a hundred: $number")
}

private fun convertTensNumberToLetter(number: Int): String = when (number) {
    in 20..29 -> "twenty"
    in 30..39 -> "thirty"
    in 40..49 -> "forty"
    in 50..59 -> "fifty"
    in 60..69 -> "sixty"
    in 70..79 -> "seventy"
    in 80..89 -> "eighty"
    in 90..99 -> "ninety"
    else -> throw IllegalArgumentException("no tens: $number")
}