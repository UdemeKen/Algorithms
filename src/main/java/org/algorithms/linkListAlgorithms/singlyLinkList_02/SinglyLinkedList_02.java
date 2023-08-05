package org.algorithms.linkListAlgorithms.singlyLinkList_02;

import java.util.List;

public class SinglyLinkedList_02 {

    public ListNode head;

    public static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtBeginning(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void printLinkedList(){
        if (head == null){
            System.out.println("null");
        }
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    public ListNode getMiddleNode(){
        if (head == null){
            return null;
        }
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while(fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    public static void main(String[] args) {
        SinglyLinkedList_02 sll_02 = new SinglyLinkedList_02();
//        insert Element
        sll_02.insertAtBeginning(19);
        sll_02.insertAtBeginning(95);
        sll_02.insertAtBeginning(5);
        sll_02.insertAtBeginning(4);
        sll_02.insertAtBeginning(28);

        sll_02.printLinkedList();

        ListNode middleNode = sll_02.getMiddleNode();
        System.out.println("Middle node is - " + middleNode.data);

    }
}
