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
    public ListNode[] splitListToParts(ListNode head, int k) {

        int len = 0;
        ListNode curr = head;

        while(curr != null){
            len++;
            curr = curr.next;
        }

        ListNode[] res = new ListNode[k];

        int base = len / k;
        int extra = len % k;

        curr = head;

        for(int i = 0; i < k; i++){

            res[i] = curr;

            int size = base;

            if(extra > 0){
                size++;
                extra--;
            }

            for(int j = 1; j < size; j++)  curr = curr.next;
            
            if(curr != null){
                ListNode next = curr.next;
                curr.next = null;
                curr = next;
            }
        }

        return res;
    }
}