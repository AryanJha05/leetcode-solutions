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
    public int getDecimalValue(ListNode head) {
        

        Stack<Integer> st = new Stack<>();

        ListNode curr = head;

        while(curr != null){
            st.push(curr.val);

            curr = curr.next;
        }

        int res = 0;
        int cnt = 0;

        while(!st.isEmpty()){

            int num = st.pop();

            if(num == 0){
                cnt++;
                continue;
            }

            res += Math.pow(2, cnt);

            cnt++;
        }

        return res;
    }
}