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
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        ListNode nextnode=null;
        while(curr!=null){
            nextnode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextnode;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        // 14ms runtime
        // Stack<Integer> stack1=new Stack<>();
        // ListNode curr=head;
        // while(curr!=null){
        //     stack1.push(curr.val);
        //     curr=curr.next;
        // }
        // curr=head;
        // while(curr!=null && curr.val==stack1.pop()){
        //     curr=curr.next;
        // }
        // return stack1.isEmpty();
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        // slow=slow.next;
        ListNode mid=reverse(slow);
        ListNode temp=head;
        while(mid!=null){
            if(temp.val!=mid.val){
                return false;
            }
            temp=temp.next;
            mid=mid.next;
        }
        return true;

    }
}