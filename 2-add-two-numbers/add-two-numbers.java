class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            temp.next = new ListNode(sum % 10);

            temp = temp.next;
        }

        return dummy.next;
    }
}



// class Solution {

//     int multiplier = 1;
//     public int sum(ListNode head) {

//         if (head == null) return 0;

//         int num = sum(head.next);

//         num = num + head.val * multiplier;

//         multiplier *= 10;
//         return num;
//     }

//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

//         int sum1 = sum(l1);
//         multiplier = 1;
//         int sum2 = sum(l2);

//         int sum3 = sum1 + sum2;


//         ListNode dummy = new ListNode(0);

//         ListNode temp = dummy;

//         if (sum3 == 0) return new ListNode(0);

//         while (sum3 > 0) {
//             int digit = sum3 % 10;
//             temp.next = new ListNode(digit);

//             temp = temp.next;

//             sum3 /= 10;
//         }

//         return dummy.next;
//     }
// }