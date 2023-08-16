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

    public void display(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if (head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while (null != current.next){
            current = current.next;
        }
        current.next =newNode;
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

    public ListNode startNodeInALoop(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;

        while (fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;

            if (slowPtr == fastPtr){
                return getStartNodeInALoop(slowPtr);
            }
        }
        return null;
    }

    private ListNode getStartNodeInALoop(ListNode slowPtr) {
        ListNode temp = head;
        while (temp != slowPtr){
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        return temp;
    }

    public void removeLoop(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;

        while (fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;

            if (fastPtr == slowPtr){
                removeLoop(slowPtr);
                return;
            }
        }
    }

    private void removeLoop(ListNode slowPtr){
        ListNode temp =head;
        while (temp.next != slowPtr.next){
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        slowPtr .next= null;
    }

    public static ListNode merge(ListNode a, ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (a != null && b != null){
            if (a.data <= b.data){
                tail.next = a;
                a = a.next;
            }else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        if (a == null){
            tail.next = b;
        }else {
            tail.next = a;
        }

        return dummy.next;
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
        SinglyLinkedList_03 sll_03a = new SinglyLinkedList_03();
        sll_03a.createALoopInLinkedList();
//        System.out.println(sll_03.containsLoop());
//        System.out.println(sll_03.startNodeInALoop().data);
        sll_03a.removeLoop();
        sll_03a.display();

        SinglyLinkedList_03 sll_03b = new SinglyLinkedList_03();
        sll_03b.insertLast(4);
        sll_03b.insertLast(7);
        sll_03b.insertLast(8);
        sll_03b.insertLast(9);

        sll_03b.display();

        SinglyLinkedList_03 result = new SinglyLinkedList_03();
        result.head = merge(sll_03a.head, sll_03b.head);
        result.display();
    }
}

