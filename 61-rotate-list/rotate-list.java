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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        ListNode first=head;
        ListNode current=new ListNode(0);
        int size=0;
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        while(temp.next!=null){
            temp=temp.next;
            size++;
        }
        while(k>=size+1){
            k=k-size-1;
        }
        for(int i=0;i<size-k;i++){
            head=head.next;
        }
        current.next=head.next;
        if(current.next==null){
            return first;
        }
        head.next=null;
        temp.next=first;
        return current.next;
    }
}