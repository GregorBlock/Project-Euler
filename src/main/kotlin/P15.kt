import java.math.BigInteger

/**
 * Problem 15 - Lattice paths
 * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down,
 * there are exactly 6 routes to the bottom right corner.
 *
 *  https://projecteuler.net/project/images/p015.png
 *
 * Q: How many such routes are there through a 20×20 grid?
 * A: 137846528820
 */
fun main() {
    println("Counting Lattice Paths ${latticePaths(20)}")
}

private fun latticePaths(gridSize: Long): BigInteger {
    return (gridSize + gridSize).factorial() / (gridSize.factorial() * gridSize.factorial())
}

fun Long.factorial(): BigInteger {
    fun factorial(start: Long, n: Long): BigInteger {
        var i: Long
        if (n <= 16) {
            var r = BigInteger.valueOf(start)
            i = start + 1
            while (i < start + n) {
                r = r.multiply(BigInteger.valueOf(i))
                i++
            }
            return r
        }
        i = n / 2
        return factorial(start, i) * factorial(start + i, n - i)
    }
    if (this <= 0) return BigInteger.ONE
    return factorial(1, this)
}
