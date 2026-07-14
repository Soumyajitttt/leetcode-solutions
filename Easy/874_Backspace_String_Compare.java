/*
 * Problem #874: Backspace String Compare
 * Difficulty: Easy
 *
 * ----- Description -----
 *
 * Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
 * 
 * Note that after backspacing an empty text, the text will continue empty.
 * 
 *  
 * Example 1:
 * 
 * Input: s = "ab#c", t = "ad#c"
 * Output: true
 * Explanation: Both s and t become "ac".
 * 
 * 
 * Example 2:
 * 
 * Input: s = "ab##", t = "c#d#"
 * Output: true
 * Explanation: Both s and t become "".
 * 
 * 
 * Example 3:
 * 
 * Input: s = "a#c", t = "b"
 * Output: false
 * Explanation: s becomes "c" while t becomes "b".
 * 
 * 
 *  
 * Constraints:
 * 
 * 
 * 	1 <= s.length, t.length <= 200
 * 	s and t only contain lowercase letters and '#' characters.
 * 
 * 
 *  
 * Follow up: Can you solve it in O(n) time and O(1) space?
 *
 * ----- Solution -----
 */

class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack <Character> st = new Stack<>();
        Stack <Character> tt = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '#'){
                if(!st.isEmpty()) st.pop();
            } 
            else{
                st.push(s.charAt(i));
            }
        }

        for(int i = 0; i < t.length(); i++){
            if(t.charAt(i) == '#'){
                if(!tt.isEmpty()) tt.pop();
            }
            else{
                tt.push(t.charAt(i));
            }
        }

        if(tt.size() != st.size()) return false;

        int size = st.size();

        for(int i = 0; i < size; i++){
            if(st.peek() != tt.peek()) return false;
            st.pop();
            tt.pop();
        }

        return true;
    }
}