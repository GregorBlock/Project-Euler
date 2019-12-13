/**
 * Problem 4 - Largest palindrome product
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * Q: Find the largest palindrome made from the product of two 3-digit numbers.
 * A: 906609
 */
fun main() {
    println("largest palindrome ${findLargestPalindrome()}")
}

fun findLargestPalindrome(): Int {
    var largestPalindrome = Int.MIN_VALUE
    for (x in 100 until 999) {
        for (y in 100 until 999) {
            val result = x.times(y)
            val reversed = result.toString().reversed().toInt()
            if (result == reversed && largestPalindrome < result) {
                largestPalindrome = result
            }
        }
    }
    return largestPalindrome
}
