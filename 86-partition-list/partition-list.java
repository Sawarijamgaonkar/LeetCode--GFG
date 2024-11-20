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
    public ListNode partition(ListNode head, int x) {
        ListNode temp=head;
        ListNode first_dummy=new ListNode(0);
        ListNode second_dummy=new ListNode(0);
        ListNode second=second_dummy;
        ListNode first=first_dummy;
        while(temp!=null){
            if(temp.val<x){
                first.next=temp;
                first=first.next;
                
            }
            else if(temp.val>=x){
                second.next=temp;
                second=second.next;
                
            }
            temp=temp.next;
        }
        second.next=null;
        first.next=second_dummy.next;
        return first_dummy.next;
    }
}