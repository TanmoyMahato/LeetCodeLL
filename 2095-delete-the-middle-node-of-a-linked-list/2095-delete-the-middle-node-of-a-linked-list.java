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
    public ListNode deleteMiddle(ListNode head) {        
        
        // if(only one element)
        if(head.next == null){
            return head=null;
        }
        
        // else if(only 2 elements)
        else if(head.next.next == null){
            head.next = null;
            return head;
        }
        
        // else (delete node)
        else{
            ListNode slow = head;
            ListNode fast = head;
            
            //traverse using slow-fast pointer to get middle node
            while(fast!=null && fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;
            }
            
            
            //delete middle node
            slow.val = slow.next.val;
            slow.next = slow.next.next;
            
            return head;
        }
        
        
    }
}