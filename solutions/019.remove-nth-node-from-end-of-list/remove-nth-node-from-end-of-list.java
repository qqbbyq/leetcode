/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int i = 0;
    ListNode p0 = new ListNode(0);
    p0.next = head;
    ListNode p1 = p0;
    ListNode p2 = p0;

    for (int j = 0; j < n; ++j){
      p1 = p1.next;
    }

    if(p1.next == null) return head.next;

    while(p1.next != null){
      p1 = p1.next;
      p2 = p2.next;
    }
    p2.next = p2.next.next;
    return head;
    }
}