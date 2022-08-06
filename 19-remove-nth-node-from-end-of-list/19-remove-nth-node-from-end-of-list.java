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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur=head;
        ListNode rem=null;
        int i=1;
        if(head.next==null)
            return null;
        
        while(cur.next!=null){
            if(i==n){
                rem=head;
            }
            if(i>n){
                rem=rem.next;
            }
        i++;
            cur=cur.next;
        }
        if(rem==null)
            head=head.next;
        else
        rem.next=rem.next.next;
        return head;
    }
}