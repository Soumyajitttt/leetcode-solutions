/*
 * Problem #169: Majority Element
 * Difficulty: Easy
 *
 * ----- Description -----
 *
 * Given an array nums of size n, return the majority element.
 * 
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 * 
 *  
 * Example 1:
 * Input: nums = [3,2,3]
 * Output: 3
 * Example 2:
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 * 
 *  
 * Constraints:
 * 
 * 
 * 	n == nums.length
 * 	1 <= n <= 5 * 104
 * 	-109 <= nums[i] <= 109
 * 	The input is generated such that a majority element will exist in the array.
 * 
 * 
 *  
 * Follow-up: Could you solve the problem in linear time and in O(1) space?
 *
 * ----- Solution -----
 */

class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length / 2 ;
        int out = 0;
        HashMap <Integer, Integer> map =  new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])) map.put(nums[i], map.get(nums[i]) + 1);
            else map.put(nums[i], 1);
        }

        for (int key : map.keySet()){
            if(map.get(key) > n)  out = key;
        }

        return out;
    }
}