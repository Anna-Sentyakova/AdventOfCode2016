package leetcode.solution2;

class Solution231 {
    class Solution {
        public boolean isPowerOfTwo(int n) {
            return n < 1 ? false : Integer.bitCount(n) == 1;
        }
    }
}
