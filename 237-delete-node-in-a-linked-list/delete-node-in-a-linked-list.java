/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // ListNode previous=new ListNode(0);
        // previous.next=head;
        // ListNode current=previous.next;
        // while(current.val!=node.val ){
        //     previous=previous.next;
        //     current=current.next;
        // }
        // if(current.val==node.val){
        //     previous.next=current.next;
        // }
        
        node.val = node.next.val;
        node.next = node.next.next;
        
    }
}