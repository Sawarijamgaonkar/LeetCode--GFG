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
    public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode previous=null;
        ListNode temp=new ListNode(0);
        while(curr!=null){
            temp=curr.next;
            curr.next=previous;
            previous=curr;
            curr=temp;
        }
        return previous;
    }
}