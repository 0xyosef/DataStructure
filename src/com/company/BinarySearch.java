package com.company;

public class BinarySearch {




    private int binarySearch(int[] arr, int n){
        int first = 0;
        //set last to last elements in array
        int last=arr.length-1;
        //calculate mid of the array
        int mid = (first + last)/2;
        //while first and last do not overlap
        while( first <= last ){
            //if the mid < key, then key to be searched is in the first half of array
            if ( arr[mid] < n ){
                first = mid + 1;
            }else if ( arr[mid] == n ){
                //if key = element at mid, then print the location
                System.out.println("Element is found at index: " + mid);
                break;
            }else{
                //the key is to be searched in the second half of the array
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        //if first and last overlap, then key is not present in the array
        if ( first > last ){
            System.out.println("Element is not found!");
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch B=new BinarySearch();
        int arr[]={1,2,3,4,6,8,10,18,20,27};
        int n=5;
          int  r=B.binarySearch(arr,n);
    }
}
