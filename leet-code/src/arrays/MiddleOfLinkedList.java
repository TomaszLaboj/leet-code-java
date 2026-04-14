package arrays;

import java.util.ArrayList;
import java.util.List;

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        System.out.println();
        List<ListNode> list = new ArrayList<>();
        for (int i=0; i < 17; i++) {
            list.add(new ListNode(i));
        }
        for (int i = list.size() -1; i > 0; i--) {
            list.get(i - 1).next = list.get(i);
        }
        System.out.println(returnMiddleOfLinkedList(list.getFirst()).val);
        System.out.println(middleNode(list.getFirst()).val);
    }

     static public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    static ListNode returnMiddleOfLinkedList (ListNode head) {

        int size = 0;
        List<ListNode> list = new ArrayList<>();

        while(head != null) {
            list.add(head);
            head = head.next;
            size++;
        }
        int middleOfList = size / 2;
        return list.get(middleOfList);
    }

    static ListNode middleNode (ListNode head) {
        ListNode middle = head;
        ListNode end = head;
        while(end != null && end.next != null) {
            middle = middle.next;
            end = end.next.next;
        }
        return middle;
    }


}
