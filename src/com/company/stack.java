package com.company;

import java.util.Scanner;
import java.util.Stack;

public class stack {
    private Scanner sc=new Scanner(System.in);
    private String[] stack;
    private int top;
    private int size;

    public stack() {
        this.size = size;
        //initialize top to -1 indicating empty stack
        this.top = -1;
        this.stack = new String[size];
    }
    //push an element into the stack
    public void push(String item) {
        if (top == size - 1) {
            System.out.println("Stack is full");
        } else {
            top++;
        }
    }
   //pop an element from the stack
    public String pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return null;
        } else {
            return stack[top--];
        }
    }

    public String peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return null;
        } else {
            return stack[top];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }
    public void print(stack s){
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
    public void takeInput() {
        System.out.println("Enter the size of the stack");
        int size = sc.nextInt();
        stack s = new stack();
        s.size = size;
        System.out.println("Enter the number of elements to be pushed");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element to be pushed");
            String item = sc.next();
            s.push(item);
           print(s);
        }
    }
    public static void main(String[] args) {
        stack s = new stack();
        s.takeInput();


    }
}
