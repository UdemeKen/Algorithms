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

        ssl.display();
        System.out.println("Length: " + ssl.length());
    }
}
