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

        ListNode first = head;
        for(int i = 1; i < k; i++) first = first.next;

        ListNode ft_node = first;

        ListNode second = head;

        while(first.next != null){
            first = first.next;
            second = second.next;
        }

        int temp = ft_node.val;
        ft_node.val = second.val;
        second.val = temp;

        return head;
    }
}