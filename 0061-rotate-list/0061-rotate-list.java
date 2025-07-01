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
        if(head==null || k==0){
            return head;
        }
        ListNode curr=head;
        ListNode temp=head;
        int n=1;
        while(temp.next!=null){
            temp=temp.next;
            n++;
        }
        if(k>n){
            k=k%n;
        }
        for(int i=0;i<n-k;i++){
            temp.next=curr;
            temp=temp.next;
            curr=curr.next;
        }
        temp.next=null;
        head=curr;
        return head;
    }
}