import java.math.BigDecimal

/**
 * Problem 16 - Power digit sum
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 *
 * Q: What is the sum of the digits of the number 2^1000?
 * A: 1366
 */
fun main() {
    println("Power digit sum ${powerDigitSum(1_000)}")
}

private fun powerDigitSum(power: Int): Int {
    var sum = 0
    for (x in BigDecimal(2).pow(power).toString().toCharArray()) {
        sum += Character.getNumericValue(x)
    }
    return sum
}


