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
    public ListNode swapNodes(ListNode head, int k) {
        int temp=0;
        ListNode dummy=head;
        ListNode frontnode=head;
        ListNode backnode=head;
        int size=1;
        while(dummy!=null){
            dummy=dummy.next;
            size++;
        }
        for(int i=0;i<k-1;i++){
            frontnode=frontnode.next;
        }
        for(int i=0;i<size-k-1;i++){
            backnode=backnode.next;
        }
        temp=backnode.val;
        backnode.val=frontnode.val;
        frontnode.val=temp;
        return head;
    }
}