package org.algorithms.linkListAlgorithms.singlyLinkList;


public class SinglyLinkList {
    private ListNode head;

    public static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        SinglyLinkList ssl = new SinglyLinkList();
        ssl.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

//          Chain creation between list nodes.
        ssl.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;
        ssl.display();
    }
}
