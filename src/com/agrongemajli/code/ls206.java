package com.agrongemajli.code;

public class ls206 {
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
class Solution206 {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode newhead = null;

        if(curr == null){
            return null;
        }

        while(curr.next != null){
            ListNode newNode = new ListNode(curr.val);
            newNode.next = newhead;
            newhead = newNode;
            curr = curr.next;
        }
        ListNode newNode = new ListNode(curr.val);
        newNode.next = newhead;
        newhead = newNode;

        return newhead;
    }
}