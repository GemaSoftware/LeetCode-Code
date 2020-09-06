package com.agrongemajli.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ls23 {
}

//little slow 11ms faster than 28%
class Solution23 {
    public ListNode mergeKLists(ListNode[] lists) {

        ListNode head, point;
        head = point = new ListNode(0);

        List<Integer> list = new ArrayList<>();

        //add all ints to list
        for (ListNode ln :
                lists) {
            while (ln != null) {
                list.add(ln.val);
                ln = ln.next;
            }
            }

        //sort list
        Collections.sort(list);

        while (!list.isEmpty()){
            int s = list.size();
            point.next = new ListNode(list.get(0));
            point = point.next;
            list.remove(0);
        }
        return head.next;
    }

}

