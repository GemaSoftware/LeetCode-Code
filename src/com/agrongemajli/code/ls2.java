package com.agrongemajli.code;

public class ls2 {
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
class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode headOfNode = new ListNode();
        ListNode referenceHead = headOfNode;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int sum = 0;

            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            sum+=carry;

            int cv = sum % 10;
            carry = sum / 10;

            ListNode temp = new ListNode(cv);

            headOfNode.next = temp;
            headOfNode = temp;
        }
        return referenceHead.next;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}