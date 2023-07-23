package org.algorithms.linkListAlgorithms.singlyLinkList;

public class SinglyLinkList{
    public  ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

//    Display element of a linklist
    public void display(ListNode head){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

//    Find the length of a linkList
//    public int length(){
//        if(head == null){
//            return 0;
//        }
//        int count = 0;
//        ListNode current = head;
//        while (current != null){
//            count++;
//            current = current.next;
//        }
//        return count;
//    }
//
////    Insertion of listNode in any position of a linklist
//    public void insert(int position, int value){
//        ListNode node = new ListNode(value);
//        if(position == 1){
//            node.next = head;
//            head = node;
//        }else{
//            ListNode previous = head;
//            int count = 1;
//            while(count < position - 1){
//                previous = previous.next;
//                count++;
//            }
//            ListNode current = previous.next;
//            previous.next = node;
//            node.next = current;
//        }
//    }
//
////    Insertion of  listNode at the first position of a linkList
//    public void insertFirst(int value){
//        ListNode newNode = new ListNode(value);
//        newNode.next = head;
//        head = newNode;
//    }
//
////    Insertion of listNode at the last position of a linkList
//    public void insertLast(int value){
//        ListNode newNode = new ListNode(value);
//        if (head == null){
//            head = newNode;
//            return;
//        }
//        ListNode current = head;
//        while (null != current.next){
//            current = current.next;
//        }
//        current.next = newNode;
//    }
//
////    Deleting the first position listNode in a linkList
//    public ListNode deleteFirst(){
//        if (head == null){
//            return null;
//        }
//        ListNode temp = head;
//        head= head.next;
//        temp.next = null;
//        return temp;
//    }
//
//    public ListNode deleteLast(){
//        if (head == null || head.next == null){
//            return head;
//        }
//        ListNode current = head;
//        ListNode previous = null;
//
//        while (current.next != null){
//            previous = current;
//            current = current.next;
//        }
//        previous.next = null;
//        return current;
//    }
//
//    public void delete(int position){
//        if (position == 1){
//            head = head.next;
//        }else {
//            ListNode previous = head;
//            int count = 1;
//            while (count < position -1){
//                previous = previous.next;
//                count++;
//            }
//            ListNode current = previous.next;
//            previous.next = current.next;
//        }
//    }
//
//    public boolean find(ListNode head, int searchKey){
//        if (head == null){
//            return false;
//        }
//
//        ListNode current = head;
//        while (current != null){
//            if (current.data == searchKey){
//                return true;
//            }
//            current = current.next;
//        }
//        return false;
//    }

    public ListNode reverse(ListNode head){
        if (head == null){
            return null;
        }

        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

//    Main method
    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        ListNode second = new ListNode(4);
        ListNode third = new ListNode(6);
        ListNode fourth = new ListNode(9);

//        Chain the listNode together
        head.next = second;
        second.next = third;
        third.next = fourth;
//        fourth.next = null;

        SinglyLinkList ssl = new SinglyLinkList();
//        ssl.insertFirst(3);
//        ssl.insertFirst(7);
//        ssl.insertLast(11);
//        ssl.insertLast(12);
//        ssl.insert(1, 4);
//        ssl.deleteFirst();
        ssl.display(head);
//        System.out.println("Last node deleted : " + ssl.deleteLast().data);
//        ssl.display();
//        ssl.delete(4);
//        ssl.display();
//        if (ssl.find(head, 10)){
//            System.out.println("Search key found!!!");
//        }else {
//            System.out.println("Search key not found!!!");
//        }
        ListNode reverseListHead = ssl.reverse(head);
        ssl.display(reverseListHead);
//        System.out.println("Length: " + ssl.length());
    }
}
