package com.company;

import java.util.Scanner;

public class linearSearch {
    private Scanner scanner;
    private int LinearSearch(int arr[],int num){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==num){
               System.out.println(i);
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        linearSearch l=new linearSearch();
        int arr[]={5,6,8,1,10,100};
        int n=100;
       l.LinearSearch(arr,n);

    }
}
