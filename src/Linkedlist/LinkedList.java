package Linkedlist;

import java.util.Scanner;

public class LinkedList {
    Scanner sc=new Scanner(System.in);
    Node newNode;
    Node head=null;
    Node tail=null;
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
            System.out.print(node.data+" ");
            node=node.next;
        }
    }
    public Node find(int val) {
        Node node = head;
        while (node != null) {
            if (node.data == val) {
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public void delete(Node node){
        Node temp=head;
        while (temp !=node){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;

    }
    //take input from user
    public void takeInput(){
        String ser="To add element press 1" +
                "To add element in first press2  " +
                "To print press 3" +
                "To find element press 4" +
                "To delete element press 5" +
                "To exit press 6";
        System.out.println(ser);
        int choice=sc.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("Enter the value to add");
                int val = sc.nextInt();
                add(val);
            }
            case 2 -> {
                System.out.println("Enter the value to add in first");
                int val1 = sc.nextInt();
                ad_First(val1);
            }
            case 3 -> print();
            case 4 -> {
                System.out.println("Enter the value to find");
                int val2 = sc.nextInt();
                Node node1 = find(val2);
            }
            case 5 -> {
                System.out.println("Enter the value to delete");
                int val3 = sc.nextInt();
                Node node2 = find(val3);
                delete(node2);
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
