package com.company;

import java.util.Scanner;

/*Factorial
5!
5*4*3*2*1
you can
5=5*4!
4!=4*3!
....
 */

public class Factorial {
    public static double factRec(double num){
        //use if So that no exception occurs
        if (num ==1){
            return 1;
        }
      double result=  num *factRec(num -1);
        return result;
    }
    public static int factIter(int n){
        int result=1;
        for (int i=1;i<=n;i++){
            result *=i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Recursion ="+factRec(5));
        System.out.println("Iteration ="+factIter(5));

    }



}
