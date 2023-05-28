package org.algorithms.linkListAlgorithms.singlyLinkList;

public class SinglyLinkList{
    public   ListNode head;

    private static class ListNode{
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

//    Find the length of a linkList
    public int length(){
        if(head == null){
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while (current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    public void insert(int position, int value){
        ListNode node = new ListNode(value);
        if(position == 1){
            node.next = head;
            head = node;
        }else{
            ListNode previous = head;
            int count = 1;
            while(count < position - 1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = node;
            node.next = current;
        }
    }

    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
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
        current.next = newNode;
    }
    public static void main(String[] args) {
        SinglyLinkList ssl = new SinglyLinkList();
        ssl.head = new ListNode(10);
        ListNode second = new ListNode(4);
        ListNode third = new ListNode(6);
        ListNode fourth = new ListNode(9);

//        Chain the listNode together
        ssl.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;

        ssl.insertFirst(3);
        ssl.insertFirst(7);
        ssl.insertLast(11);
        ssl.insertLast(12);
        ssl.insert(1, 4);
        ssl.insert(6, 12);
        ssl.insert(11, 77);
        ssl.display();
        System.out.println("Length: " + ssl.length());
    }
}
