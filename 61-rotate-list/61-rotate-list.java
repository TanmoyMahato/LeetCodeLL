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
       if( head==null || head.next==null ) return head;
        
        int size=1;
        ListNode trav = head;
        
        //find size of list
        while(trav.next!=null){
            size++;
            trav=trav.next;
        }

        k=k%size;
        trav.next=head;
        
        while((size-k)>0){
            head=head.next;
            trav=trav.next;
            k++;
        }
        trav.next=null;
        
        return head;
        
    }
}