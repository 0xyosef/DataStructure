package com.company;

import java.util.*;

public class ArrayToArrayList {

//convert array to list
    public List<String> conArray(String[] arr){
        List<String> list = new ArrayList<String>();
        for(String text:arr) {
            list.add(text);
        }
        System.out.println(list);
        return list;
    }
    //convert list to array
    public List<String> conListToArray(String[] arr,String [] arr2){
        List<String> list1 = new ArrayList<String>();
        Collections.addAll(list1, arr);
        for(String text:arr2) {
            list1.add(text);
       }
        list1.toArray();
        System.out.println(list1);
        return list1;
    }
//    public void reArray(String[]arr){
//        List<String> list2 = new ArrayList<String>();
//        for(String text:arr) {
//            list2.add(text);
//        }
//        System.out.println(list2);
//    }

    public static void main(String[] args) {
        ArrayToArrayList a=new ArrayToArrayList();
        String[] arr ={"Ahmed","Yosef","Joo","OOOOO"};
        String[] arr2 ={"Moo","lol","qq","mmm"};
        a.conArray(arr);
        a.conListToArray(arr,arr2);
       //a.reArray(arr);
    }
}
