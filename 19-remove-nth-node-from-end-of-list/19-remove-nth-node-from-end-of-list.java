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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        //get size of list
        int size=0;
        ListNode temp=head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        
        //delete node
        if(size == n){ //if(only one node)
            head = head.next;
            return head;
        }
        else{
            int i=1;
            temp = head;
            
            while(i < (size-n)){
                temp = temp.next;
                i++;
            }
            
            temp.next = temp.next.next;
            return head;
        }
        
        
    }
}