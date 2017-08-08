/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode rs = new ListNode(0);
        ListNode head = rs;
        
        int up = 0;
        while(l1 != null || l2 != null || up !=0){
            int sum = (l1 == null ? 0: l1.val) + (l2 == null ? 0: l2.val) + up;
            up = sum / 10; 
            rs.next = new ListNode(sum % 10);
            rs = rs.next;
            if(l1 != null ) l1 = l1.next;
            if(l2 != null ) l2 = l2.next;
            
        }
        return head.next;
        
    }
}