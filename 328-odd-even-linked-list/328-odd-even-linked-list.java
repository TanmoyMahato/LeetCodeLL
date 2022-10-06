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
    public ListNode oddEvenList(ListNode head) {
        //if(empty list || only one element present)
        if(head == null || head.next == null)
            return head;
        
        
        //creating list for odd elements
        ListNode oddList = new ListNode();
        ListNode oddHead = head;
        
        //creating list for even elements
        ListNode evenList = new ListNode();
        ListNode evenHead = head.next;
        
        //adding elmnts from original list to odd-even list
        ListNode temp = head;
        int i=1;
        while(temp != null){
            if( i%2 != 0){
                oddList.next = temp;
                oddList = oddList.next;
            }
            else{
                evenList.next = temp;
                evenList = evenList.next;
            }
            
            i++;
            temp = temp.next;
        }
        
        oddList.next = evenHead;
        evenList.next = null;
        
        return oddHead;
    }
}