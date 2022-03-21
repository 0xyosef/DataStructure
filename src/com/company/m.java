package com.company;

import java.util.Scanner;

public class m {


    public static void main(String[] args) {
       long n1,n2;
        Scanner s=new Scanner(System.in);
        n1=s.nextInt();
        n2=s.nextInt();
        if (n1%n2==0){
            System.out.println("0");
         }else
            System.out.println(n1);
    }
}
