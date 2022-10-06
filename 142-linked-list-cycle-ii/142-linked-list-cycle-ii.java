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
    
    
    public ListNode startOfCycle(ListNode slow, ListNode fast){
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow;
    }
        
        
        
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!=null){ 
            fast = fast.next.next;
            slow = slow.next;
            
            //checking for cycle
            if( slow == fast){
                slow = head;
                return startOfCycle(slow, fast);
            }
        }
        
        return null;        
    }
}