import java.time.DayOfWeek
import java.time.LocalDate

/**
 * You are given the following information, but you may prefer to do some research for yourself.
 *
 *  1 Jan 1900 was a Monday.
 *  Thirty days has September,
 *  April, June and November.
 *  All the rest have thirty-one,
 *  Saving February alone,
 *  Which has twenty-eight, rain or shine.
 *  And on leap years, twenty-nine.
 *  A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
 *
 *  Q: How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
 *  A: 171
 */
object P19 {
    fun main() {
        val start = LocalDate.parse("1901-01-01")
        val end = LocalDate.parse("2000-12-31")
        println("Counting Sundays ${countingSundays(start, end)} ")
    }

    internal fun countingSundays(start: LocalDate, end: LocalDate): Long {
        var countingSundays = 0L
        var month = start
        while (month < end) {
            if (month.dayOfMonth == 1 && month.dayOfWeek == DayOfWeek.SUNDAY) {
                countingSundays++
            }
            month = month.plusMonths(1)
        }
        return countingSundays
    }
}