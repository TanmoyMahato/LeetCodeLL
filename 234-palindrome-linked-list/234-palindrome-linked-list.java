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
    // 2nd Approach using Slow-Fast Pointer
    public boolean isPalindrome(ListNode head) {
        
        //Get middle element
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow; //mid stores address of middle element
        
        
        //reverse node from middle
        ListNode prev=null;
        ListNode curr=mid;
        ListNode next=mid.next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode tail = prev; //stores last node of list
        
        
        //check Palindrome
        while(tail != null){
            if(head.val != tail.val)
                return false;
            tail = tail.next;
            head = head.next;
        }
        
        return true;
    }
}