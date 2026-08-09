/*
 * Problem #229: Majority Element II
 * Difficulty: Medium
 *
 * ----- Description -----
 *
 * Given an integer array of size n, find all elements that appear more than ⌊n / 3⌋ times.
 * 
 *  
 * Example 1:
 * 
 * Input: nums = [3,2,3]
 * Output: [3]
 * 
 * 
 * Example 2:
 * 
 * Input: nums = [1]
 * Output: [1]
 * 
 * 
 * Example 3:
 * 
 * Input: nums = [1,2]
 * Output: [1,2]
 * 
 * 
 *  
 * Constraints:
 * 
 * 
 * 	1 <= nums.length <= 5 * 104
 * 	-109 <= nums[i] <= 109
 * 
 * 
 *  
 * Follow up: Could you solve the problem in linear time and in O(1) space?
 *
 * ----- Solution -----
 */

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length / 3 ;
        
        ArrayList <Integer> list = new ArrayList<>();
        HashMap <Integer, Integer> map =  new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])) map.put(nums[i], map.get(nums[i]) + 1);
            else map.put(nums[i], 1);
        }

        for (int key : map.keySet()){
            if(map.get(key) > n)  list.add(key);
        }

        Collections.sort(list);
        return list;
    }
}