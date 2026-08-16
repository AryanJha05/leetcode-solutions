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
        
        if(head == null) return null;
        if(left == right) return head;

        int len = 1;
        
        ListNode curr = head;
        ListNode before = null;
        while(len < left){
            before = curr;
            curr = curr.next;
            len++;
        }

        ListNode leftNode = curr;

        ListNode prev = null;
        while(len <= right){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

            len++;
        }

        if (before != null) before.next = prev;
        else head = prev;
        
        leftNode.next = curr;

        return head;

    }
}