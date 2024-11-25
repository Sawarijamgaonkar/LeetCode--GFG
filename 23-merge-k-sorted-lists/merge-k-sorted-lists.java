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
    public ListNode mergeKLists(ListNode[] lists) {
        int k=lists.length;
        ArrayList<Integer> merged=new ArrayList<Integer>();
        for(int i=0;i<k;i++){
            ListNode temp=lists[i];
            while(temp!=null){
                merged.add(temp.val);
                temp=temp.next;
            }
        }
        // Arrays.sort(merged);
        Collections.sort(merged); 
        ListNode tail=new ListNode(0);
        ListNode head=tail;
        for(int i=0;i<merged.size();i++){
            int value=merged.get(i);
            tail.next=new ListNode(value);
            tail=tail.next;
        }
        // LinkedList<Integer> linkedList= new LinkedList<Integer>(merged);
        // return linkedList;
        return head.next;
    }
}