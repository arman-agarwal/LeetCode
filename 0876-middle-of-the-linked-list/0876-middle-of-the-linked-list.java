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
    public ListNode middleNode(ListNode head) {
        ListNode cur1 = head;
        ListNode cur2 = head;
        while(cur1!=null && cur1.next!=null){
            cur1=cur1.next.next;
            cur2=cur2.next;
        }
        return cur2;
    }
}