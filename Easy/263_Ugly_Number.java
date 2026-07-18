/*
 * Problem #263: Ugly Number
 * Difficulty: Easy
 *
 * ----- Description -----
 *
 * An ugly number is a positive integer which does not have a prime factor other than 2, 3, and 5.
 * 
 * Given an integer n, return true if n is an ugly number.
 * 
 *  
 * Example 1:
 * 
 * Input: n = 6
 * Output: true
 * Explanation: 6 = 2 × 3
 * 
 * 
 * Example 2:
 * 
 * Input: n = 1
 * Output: true
 * Explanation: 1 has no prime factors.
 * 
 * 
 * Example 3:
 * 
 * Input: n = 14
 * Output: false
 * Explanation: 14 is not ugly since it includes the prime factor 7.
 * 
 * 
 *  
 * Constraints:
 * 
 * 
 * 	-231 <= n <= 231 - 1
 *
 * ----- Solution -----
 */

class Solution {
    public boolean isUgly(int num) {
        for (int i=2; i<6 && num>0; i++)
            while (num % i == 0)
                num /= i;
        return num == 1;
    }
}