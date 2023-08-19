package org.algorithms.linkListAlgorithms.doublyLinkedList;

public class DoublyLinkedList {
    private ListNode head;
    private ListNode tail;
    private int length;
    private class ListNode {
        private ListNode previous;
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
        }
    }

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public int length(){
        return length;
    }
}
