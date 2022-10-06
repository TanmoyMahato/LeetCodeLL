/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        //using Two Pointer approach
        ListNode fast = head;
        ListNode slow = head;
        
        //if(empty list || only one element in list)
        if(head == null || head.next == null)
            return false;
        
        //traversing the list
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            //checking for cycle
            if(slow == fast)
                return true;
        }
        
        //no cycle found
        return false;
    }
}