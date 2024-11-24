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
    public ListNode removeElements(ListNode head, int val) {
//         ListNode temp=head;
//         ListNode prev=new ListNode(0,temp);
//         while(temp!=null){
//             if(temp.val==val){
//                 if(temp.next==null){
//                     prev.next=null;
//                 }
//                 prev.next=temp.next;
//             }
//             prev=prev.next;
//             temp=temp.next;
            
//         }
//         return head;
        
        ListNode ans = new ListNode(0, head);
        ListNode dummy = ans;

        while (dummy != null) {
            while (dummy.next != null && dummy.next.val == val) {
                dummy.next = dummy.next.next;
            }
            dummy = dummy.next;
        }

        return ans.next;
    }
}