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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null) return head;

        int len = 0;
        ListNode temp = head;

        while (temp != null) {
            len++;
            temp = temp.next;
        }

        // Delete head
        if (len == n) {
            return head.next;
        }

        int idx = len - n;

        temp = head;
        int cnt = 1;

        while (temp != null) {

            if (cnt == idx) {
                temp.next = temp.next.next;
                break;
            }

            temp = temp.next;
            cnt++;
        }

        return head;
    }
}