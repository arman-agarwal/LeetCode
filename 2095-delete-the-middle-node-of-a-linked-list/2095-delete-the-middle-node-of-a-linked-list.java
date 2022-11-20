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
    public ListNode deleteMiddle(ListNode head) {
        ListNode prevMid = findMiddlePrev(head);
        if(prevMid==null)return head.next;
        prevMid.next = prevMid.next.next;
        return head;
    }
    private ListNode findMiddlePrev(ListNode node){
        ListNode slow = node;
        ListNode fast = node;
        ListNode prev = null;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        return prev;
    }
}