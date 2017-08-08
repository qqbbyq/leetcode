/**
 * Definition for singly-linked li
 *     int val;
 *     ListNode next;st.
 * public class ListNode {
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode p1 = headA;
        ListNode p2 = headB;
       
        while(p1 != p2){
            p1 = p1 == null ? headB : p1.next;
            p2 = p2 == null ? headA : p2.next;
            if(p1 == headB && p2 == headA) return null;
        }
        
        return p1;
        
    }
}