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

    public void reverse(ArrayList<ListNode> list, int start, int end){

        while(start < end){

            ListNode temp = list.get(start);

            list.set(start, list.get(end));
            list.set(end, temp);

            start++;
            end--;
        }
    }

    public ListNode reverseEvenLengthGroups(ListNode head) {
        
        ArrayList<ListNode> list = new ArrayList<>();

        ListNode temp = head;

        while(temp != null){
            list.add(temp);
            temp = temp.next;
        }

        //Reverse Logic :
        int start = 1;
        int size = 2;

        while(start < list.size()){

            int end = Math.min(start + size - 1, list.size() - 1);
            int len = end - start + 1;

            if(len % 2 == 0) reverse(list, start, end);

            start += size;
            size++;
        }

        ListNode dummy = new ListNode(0);
        temp = dummy;

        for(ListNode node : list){

            temp.next = node;
            temp = temp.next;
        }

        // break old connection
        temp.next = null;

        return dummy.next;
    }
}