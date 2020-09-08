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
        while(head.next != null){
            holder.append(head.val);
            head = head.next;
        }
        holder.append(head.val);

        return Integer.parseInt(holder.toString(), 2);
    }
}
