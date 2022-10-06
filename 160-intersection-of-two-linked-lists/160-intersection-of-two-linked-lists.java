/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        
        //only one element
        if(headA == headB)
            return headA;
        
        //checking for intersection
        while(tempA != null){
            while(tempB != null){
                if(tempA == tempB)
                    return tempA;
                tempB = tempB.next;
            }
            tempA = tempA.next;
            tempB = headB;
        }
        
        return null;
    }
}