package com.agrongemajli.code;

public class ls1290 {
}

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
//runtime 0ms.
class Solution1290 {
    public int getDecimalValue(ListNode head) {
        StringBuilder holder = new StringBuilder();
        while(head != null){
            holder.append(head.val);
            head = head.next;
        }

        return Integer.parseInt(holder.toString(), 2);
    }
}
