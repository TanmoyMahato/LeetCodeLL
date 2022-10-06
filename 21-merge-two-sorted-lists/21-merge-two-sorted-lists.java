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
    public ListNode merge(ListNode list1, ListNode list2){
        ListNode head = list1;
        
        //if(only one node)
        if(list1.next == null){
            list1.next = list2;
            return list1;
        }
        
        
        ListNode prev = list1;
        ListNode next = list1.next;
        
        while(list2!=null && next!=null){
            if(prev.val<=list2.val && list2.val<=next.val){
                ListNode temp = list2.next;
                prev.next = list2;
                list2.next = next;
                list2 = temp;      
                prev = prev.next;
            }
            else{                
                prev = prev.next;
                next = next.next;
                
                if(next == null){
                    prev.next = list2;
                    return head;
                }
            }
        }
        
        return head;
    }
    
    
    
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        //if(list1 is empty)
        if(list1 == null) 
            return list2;
        
        //if(list2 is empty)
        else if(list2 == null)
            return list1;
        
        //else(no list is empty)
        else{
            if(list1.val <= list2.val)
                return merge(list1, list2);
            
            else
                return merge(list2, list1);
           
        }
    }
}