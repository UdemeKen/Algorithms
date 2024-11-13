package org.algorithms.linkListAlgorithms.circularSinglyLinkedList;

public class CircularSinglyLinkedList {
    private ListNode last;
    private int length;

    public class ListNode {
        private int data;
        private ListNode next;

        public ListNode (int data) {
            this.data = data;
        }
    }

    public CircularSinglyLinkedList () {
        last = null;
        length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void createCircularLinkedList() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(10);
        ListNode fourth = new ListNode(15);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        last = first;
    }

    public void display() {
        if (last == null) {
            return;
        }
         ListNode first  = last.next;
        while (first != last) {
            System.out.print(first.data + "=>");
            first = first.next;
        }
        System.out.println(first.data);
    }

    public void insertFirst(int data) {
        ListNode temp = new ListNode(data);
        if (last == null) {
            last = temp;
        } else {
            temp.next = last.next;
        }
        last.next = temp;
        length++;
    }

    public static  void main(String[] args) {
        CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();
        circularSinglyLinkedList.createCircularLinkedList();
        circularSinglyLinkedList.display();
        circularSinglyLinkedList.insertFirst(20);
        circularSinglyLinkedList.display();
    }
}
