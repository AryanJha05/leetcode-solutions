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
    public ListNode oddEvenList(ListNode head) {
        
        ListNode even = new ListNode(0);
        ListNode e = even;

        ListNode odd = new ListNode(0);
        ListNode o = odd;

        ListNode curr = head;
        int idx = 1;
        while(curr != null){
            
            ListNode next = curr.next;
            curr.next = null;

            if(idx % 2 == 1){
                o.next = curr;
                o = o.next;
            }else{
                e.next = curr;
                e = e.next;
            }

            idx++;
            curr = next;
        }

        o.next = even.next;

        return odd.next;
    }
}