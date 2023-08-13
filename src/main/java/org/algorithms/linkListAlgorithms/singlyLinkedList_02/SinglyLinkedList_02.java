package org.algorithms.linkListAlgorithms.singlyLinkedList_02;

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

    public ListNode getNthNodeFromEnd(int n){
        if (head == null){
            return null;
        }
        if (n <= 0){
            throw  new IllegalArgumentException("Invalid value n: " + n);
        }
        ListNode mainPtr = head;
        ListNode refPtr = head;

        int count = 0;
        while (count < n){
            if(refPtr == null){
                throw  new IllegalArgumentException(n + "is greater than the number of nodes in the list");
            }
            refPtr = refPtr.next;
            count++;
        }
        while (refPtr != null){
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }

    public void removeDuplicate(){
        if (head == null){
            return;
        }

        ListNode current = head;
        while (current != null && current.next != null){
            if (current.data == current.next.data){
                current.next = current.next.next;
            }else {
                current = current.next;
            }
        }
    }

    public ListNode insertInSortedList(int value){
        ListNode newNode = new ListNode(value);

        ListNode current = head;
        ListNode temp = null;
        while(current != null && current.data < newNode.data){
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
        return  head;
    }

    public void deleteNode(int key){
        ListNode current = head;
        ListNode temp = null;

        if(current != null && current.data == key){
            head = current.next;
            return;
        }

        while (current != null && current.data != key){
            temp = current;
            current = current.next;
        }

        if (current == null){
            return;
        }

        temp.next = current.next;
    }

    public static void main(String[] args) {
        SinglyLinkedList_02 sll_02 = new SinglyLinkedList_02();
//        insert Element
        sll_02.insertAtBeginning(6);
        sll_02.insertAtBeginning(4);
        sll_02.insertAtBeginning(4);
        sll_02.insertAtBeginning(2);
        sll_02.insertAtBeginning(2);

//        print elements
        sll_02.printLinkedList();
        sll_02.removeDuplicate();
        sll_02.printLinkedList();
        sll_02.insertInSortedList(5);
        sll_02.printLinkedList();
        sll_02.deleteNode(5);
        sll_02.printLinkedList();


//        ListNode nthNodeFromEnd = sll_02.getNthNodeFromEnd(2);
//        System.out.println("Nth node from end is - " + nthNodeFromEnd.data);

//        ListNode middleNode = sll_02.getMiddleNode();
//        System.out.println("Middle node is - " + middleNode.data);

    }
}
