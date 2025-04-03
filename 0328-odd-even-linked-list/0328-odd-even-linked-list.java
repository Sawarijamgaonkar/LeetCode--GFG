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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode oddlist=head;
        ListNode evenlist=head.next;
        ListNode second=evenlist;
        while(evenlist!=null && evenlist.next!=null){
            oddlist.next=evenlist.next;
            oddlist=oddlist.next;
            evenlist.next=oddlist.next;
            evenlist=evenlist.next;
        }
        oddlist.next=second;
        return head;
        
    }
}