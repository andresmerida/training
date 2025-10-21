package org.andres.leetcode.add_two_numbers;

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        // Loop until both lists ae exhausted and there's no carry
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            // Add digit from l1 if available
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            // Add digit from l2 if available
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            // Calculate the digit for the current node and new carry
            current.next = new ListNode(sum % 10);
            carry = sum / 10;

            // Move to the next node in the result list
            current = current.next;
        }

        return dummyHead.next;
    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        ListNode(int x, ListNode next) {
            this.val = x;
            this.next = next;
        }
    }
}
