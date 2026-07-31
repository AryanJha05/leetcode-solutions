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

        ArrayList<ListNode> arr = new ArrayList<>();

        ListNode temp = head;

        while (temp != null) {
            arr.add(temp);
            temp = temp.next;
        }

        ListNode first = arr.get(k - 1);
        ListNode second = arr.get(arr.size() - k);

        int val = first.val;
        first.val = second.val;
        second.val = val;

        return head;
    }
}