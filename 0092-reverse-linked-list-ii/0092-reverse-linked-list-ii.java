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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp = new ListNode(0);
        temp.next = head;

        ListNode leftN = temp;
        ListNode curr = head;
        for(int i =0; i<left-1;i++){
            leftN = leftN.next;
            curr = curr.next;
        }
        ListNode newHead = curr;
        ListNode prev = null;

        for(int i =0; i<=right-left;i++){
            ListNode nextN = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextN;
        }


        leftN.next = prev;
        newHead.next = curr;
        return temp.next;
    }
}