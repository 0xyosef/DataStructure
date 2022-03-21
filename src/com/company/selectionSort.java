package com.company;

import java.util.Arrays;

public class selectionSort {
    public static void sort(int []arr){
       int n= arr.length;
       //Determine the quality within array
        for (int i=0;i<n-1;i++){
            //find the minimum element
            int min=i;
            for (int j=i+1;j<n;j++)
            {
                if (arr[j]<min){
                    min=j;
                }
                // Swap the found minimum element
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }


    public static void main(String[] args) {
        selectionSort ob = new selectionSort();
        int arr[] = {64,25,12,22,11};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
