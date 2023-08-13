package org.algorithms.linkListAlgorithms.singlyLinkedList_03;

public class SinglyLinkedList_03 {

    public ListNode head;

    public static class ListNode {

        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public boolean containsLoop(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;

        while (fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;

            if (slowPtr == fastPtr){
                return true;
            }
        }
        return false;
    }

    public void createALoopInLinkedList(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);

        head = first;
        first.next = second;
        second.next = third;
        third.next = fifth;
        fifth.next = sixth;
        sixth.next = third;
    }

    public static void main(String[] args) {
        SinglyLinkedList_03 sll_03 = new SinglyLinkedList_03();
        sll_03.createALoopInLinkedList();
        System.out.println(sll_03.containsLoop());
    }
}

