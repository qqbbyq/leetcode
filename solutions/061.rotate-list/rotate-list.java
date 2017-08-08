/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        /*if(head == null ||head.next == null || k == 0 ) return head;
        ListNode p = head;
        int len = 1;
        while(p.next != null){
            p = p.next;
            len ++;
        }
        p.next = head;
        int i = 0;
        while(i < len - k% len ){
            p = p.next;
            i ++;
        }
        ListNode r = p.next;
        p.next = null;
        return r;*/
        
        if(head == null || head.next == null || k == 0) return head;
        ListNode p = head;
        int len = 1;
        while(p.next != null){
            len ++;
            p = p.next;
        }
        p.next = head;
        int i = 0;
        while(i < len - k % len){
            p = p.next;
            i ++;
        }
        ListNode r = p.next;
        p.next = null;
        return r;
        
        
    }
}