/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode start = new ListNode(-1);
        start.next = head;
        
        ListNode slow = start;
        ListNode fast = head;
        
        while(fast != null){
            while(fast.next != null && fast.val == fast.next.val){
                fast = fast.next;
            }
            if(slow.next == fast){
                slow = slow.next;
                fast = fast.next;
            } else {
                slow.next = fast.next;
                fast = fast.next;
            }
        }
        return start.next;
        
    }
} 