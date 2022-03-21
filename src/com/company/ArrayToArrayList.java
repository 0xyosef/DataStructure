package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToArrayList {


    public List<String> conArray(String[] arr){
        List<String> list = Arrays.asList(arr);
        System.out.println(list);
       return list;
    }
    public List<String> conListToArray(String[] arr){
        List<String> list1 = new ArrayList<String>();
        Collections.addAll(list1, arr);
        System.out.println(list1);
        return list1;
    }
   public void reArray(String[]arr){
       List<String> list2 = new ArrayList<String>();
       for(String text:arr) {
           list2.add(text);
   }
       System.out.println(list2);
}

    public static void main(String[] args) {
        ArrayToArrayList a=new ArrayToArrayList();
        String[] arr ={"Ahmed","Yosef","Joo","OOOOO"};
        a.conArray(arr);
        a.conListToArray(arr);
        a.reArray(arr);
    }
}
