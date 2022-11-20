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

//find middle
//revervse middle to end
//interleave
class Solution {
    public void reorderList(ListNode head) {
        ListNode mid = findMiddle(head);
        ListNode reversedHead = reverseHead(mid.next);
        mid.next = null;
        ListNode curr = head;
        ListNode next = reversedHead;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = next;
            next = temp;
            curr = curr.next;
        }
    }
    
    private ListNode reverseHead(ListNode node){
        if(node==null)return null;
        ListNode prev = null;
        ListNode curr = node;
        ListNode next = node.next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    private ListNode findMiddle(ListNode node){
        if(node==null)return null;
        ListNode slow = node;
        ListNode fast = node.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            //if(fast.next==null)break;
            fast = fast.next.next;
        }
        return slow;
    }
}