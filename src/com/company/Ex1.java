package com.company;

public class Ex1 {
    public int J(int m) {
        m= 50;
        for(int i = 0; i < 5; i++)
            m=m-i;
        return m;
    }
    public static void main(String[] args) {
        Ex1 ex1 = new Ex1();
        System.out.println(ex1.J(10));
    }
}
