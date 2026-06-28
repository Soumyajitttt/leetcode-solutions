/*
 * Problem #9: Palindrome Number
 * Difficulty: Easy
 *
 * ----- Description -----
 *
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 * 
 *  
 * Example 1:
 * 
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * 
 * 
 * Example 2:
 * 
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * 
 * 
 * Example 3:
 * 
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * 
 * 
 *  
 * Constraints:
 * 
 * 
 * 	-231 <= x <= 231 - 1
 * 
 * 
 *  
 * Follow up: Could you solve it without converting the integer to a string?
 *
 * ----- Solution -----
 */

class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int temp=x;
        for(int i=0;x>0;x/=10,i++){
            rev=rev*10+x%10;
        }
        if(temp==rev)
            return true;
        else
            return false;
    }
}