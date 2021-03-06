package leetcode.solution3

import leetcode.eq
import leetcode.toIntArray
import java.util.*

private class Solution313 {
    class Solution {
        fun nthSuperUglyNumber(n: Int, primes: IntArray): Int {
            val numbers = TreeSet<Long>()
            var count = 0
            var i = 1L
            numbers += 1
            while (count < n) {
                ++count
                for (element in primes) {
                    numbers += i * element
                }
                i = numbers.higher(i)!!
            }
            return numbers.lower(i)!!.toInt()
        }
    }
}

fun main() {
    Solution313.Solution().nthSuperUglyNumber(12, "[2,7,13,19]".toIntArray()) eq 32
    Solution313.Solution().nthSuperUglyNumber(100000, "[7,19,29,37,41,47,53,59,61,79,83,89,101,103,109,127,131,137,139,157,167,179,181,199,211,229,233,239,241,251]".toIntArray()) eq 1092889481
}
