/*
 * Problem #61: Rotate List
 * Difficulty: Medium
 *
 * ----- Description -----
 *
 * Given the head of a linked list, rotate the list to the right by k places.
 * 
 *  
 * Example 1:
 * 
 * Input: head = [1,2,3,4,5], k = 2
 * Output: [4,5,1,2,3]
 * 
 * 
 * Example 2:
 * 
 * Input: head = [0,1,2], k = 4
 * Output: [2,0,1]
 * 
 * 
 *  
 * Constraints:
 * 
 * 
 * 	The number of nodes in the list is in the range [0, 500].
 * 	-100 <= Node.val <= 100
 * 	0 <= k <= 2 * 109
 *
 * ----- Solution -----
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;

        ListNode yo = head;
        ListNode temp = head;
        int size = 0;

        while(temp !=null){
            size++;
            temp = temp.next;
        }

        k = k % size ;

        while(k>0){
            yo = rotate(yo);
            k--;
        }
        return yo;
    }

    public ListNode rotate(ListNode head){
        if(head == null || head.next == null) return head; 

        ListNode temp = head;

        while(head.next.next != null){
            head = head.next;
        }

        ListNode newHead = head.next;

        newHead.next = temp;
        head.next = null; 

        return newHead;
    }
}