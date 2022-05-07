package Linkedlist;

import java.util.Scanner;

public class LinkedList {
    Scanner sc=new Scanner(System.in);
    Node newNode;
    Node head=null; //first node
    Node tail=null;//list node
    int size =0;
    //add last
    public void add(int val){
        if (size ==0){
             newNode=new Node(val);
             newNode.data=val;
             head=tail=newNode;
             size++;
        }else {
            newNode=new Node(val);
            newNode.data=val;
            tail.next=newNode;
            tail=newNode;
            size++;
        }
    }
    public void ad_First(int val){
        newNode=new Node(val);
        newNode.data=val;
        newNode.next=head;
        head=newNode;
    }
    public void print(){
        Node node=head;
        while (node!=null){
            System.out.print(node.data+" -> ");
            node=node.next;
        }
    }
    public void find(int val) {
        Node node = head;
        while (node != null) {
            if (node.data == val) {
                System.out.println(node+ " is found");
            }
                node = node.next;
        }
    }
    public void delete(int val){
     // if linked list is empty
        if (head==null)
            return ;
        //store head node
        Node temp=head;
        if (val==0){
            head=head.next;
            return;
        }
        //find previous node of the node to delete
        while (temp.next!=null && temp.next.data!=val){
            temp=temp.next;
        }
        //if position is more than size of list
        if (temp.next == null){
           System.out.println("element not found");
        return;
        }
        //Node ->next is the node to be deleted
        //store pointer to next of node to be deleted
        temp.next= temp.next.next;
    }
    //take input from user
    public void takeInput(){
        String ser="\n"+
                "1-add element\t\t" +
                "2-add element first\t\t " +
                "3-print \t\t" +
                "4-find element\t\t" +
                "5-delete element\t\t" +
                "6-exit\t\t";
        System.out.println(ser);
        int choice=sc.nextInt();
        switch (choice) {
            case 1 -> {
                    System.out.println("Enter size element number ");
                    int size = sc.nextInt();
                    for (int i = 0; i < size; i++) {
                        int val = sc.nextInt();
                        add(val);
                    }
                System.out.println("Done");
                    takeInput();
            }
            case 2 -> {
                System.out.println("Enter the value to add in first");
                int val1 = sc.nextInt();
                ad_First(val1);
                takeInput();
            }
            case 3 -> {
                print();
                takeInput();
            }
            case 4 -> {
                System.out.println("Enter the value to find");
                int val2 = sc.nextInt();
                find(val2);
                takeInput();
            }
            case 5 -> {
                System.out.println("Enter the value to delete");
                int val3 = sc.nextInt();
                //Node node2 = find(val3);
                delete(val3);
                System.out.println("Done");
                takeInput();
            }
            case 6 -> {
                System.out.println("Exiting");
                System.exit(0);
            }
        }
    }
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.takeInput();
    }
}
