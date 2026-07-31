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
    public ListNode swapPairs(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        while(prev.next != null && prev.next.next != null){

            ListNode st = prev.next;
            ListNode nd = st.next;

            //Swap Nodes :
            st.next = nd.next;
            nd.next = st;
            prev.next = nd;

            //move to next pair :
            prev = st;
        }

        return dummy.next;
        
    }
}