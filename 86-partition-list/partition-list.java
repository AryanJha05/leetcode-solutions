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
        
        ListNode before_X = new ListNode(0);
        ListNode before = before_X;

        ListNode after_X = new ListNode(0);
        ListNode after = after_X;


        ListNode curr = head;
        while(curr != null){

            if(curr.val < x){
                before.next = curr;
                before = before.next;
            }else{
                after.next = curr;
                after = after.next;
            }

            curr = curr.next;
        }

        after.next = null;
        before.next = after_X.next;

        return before_X.next;


    }
}