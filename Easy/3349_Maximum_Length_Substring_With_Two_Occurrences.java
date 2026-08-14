/*
 * Problem #3349: Maximum Length Substring With Two Occurrences
 * Difficulty: Easy
 *
 * ----- Description -----
 *
 * Given a string s, return the maximum length of a substring such that it contains at most two occurrences of each character.
 *  
 * Example 1:
 * 
 * 
 * Input: s = "bcbbbcba"
 * 
 * Output: 4
 * 
 * Explanation:
 * The following substring has a length of 4 and contains at most two occurrences of each character: "bcbbbcba".
 * 
 * Example 2:
 * 
 * 
 * Input: s = "aaaa"
 * 
 * Output: 2
 * 
 * Explanation:
 * The following substring has a length of 2 and contains at most two occurrences of each character: "aaaa".
 * 
 *  
 * Constraints:
 * 
 * 
 * 	2 <= s.length <= 100
 * 	s consists only of lowercase English letters.
 *
 * ----- Solution -----
 */

class Solution {
    public int maximumLengthSubstring(String s) {
        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            int[] freq = new int[26];

            for (int j = i; j < s.length(); j++) {

                int index = s.charAt(j) - 'a';
                freq[index]++;
                if (freq[index] > 2) {
                    break;
                }

                max = Math.max(max, j - i + 1);
            }
        }

        return max;
    }
}