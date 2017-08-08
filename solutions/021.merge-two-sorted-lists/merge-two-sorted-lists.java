/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l0 = new ListNode(-1);
        ListNode head = l0;
        
        while(l1 != null && l2 != null){
            
            if(l1.val <= l2.val){
                l0.next = l1;
                l1 = l1.next;
            } else {
                l0.next = l2;
                l2 = l2.next;
            }
            l0 = l0.next;
            
        }
        if(l1 == null) l0.next = l2;
        if(l2 == null) l0.next = l1;
        return head.next;
        
    }
}