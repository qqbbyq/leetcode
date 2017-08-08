/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
          ListNode p = head;
    while(p != null && p.next != null) {
      if(p.next.val == val) {
        p.next = p.next.next;
      } else {
        p = p.next;
      }
    }
    if(head !=null && head.val == val) return head.next;
    else return head;
    }
}