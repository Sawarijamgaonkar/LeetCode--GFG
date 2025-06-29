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
    public ListNode swapPairs(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode temp=new ListNode(0);
        ListNode prev=temp;
        ListNode curr=head;
        while(curr!=null){
            prev.next=curr.next;
            if(curr.next==null){
                prev.next=curr;
                break;
            }
            // ListNode nextN=curr.next;
            curr.next=curr.next.next;
            prev.next.next=curr;
            prev=curr;
            curr=prev.next;
        }
        
        return temp.next;
    }
}