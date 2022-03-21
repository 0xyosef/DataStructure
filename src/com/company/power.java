package com.company;
//power =base*exponent
public class power {
    public static double powerRec(double b,double e){
        if(e==0){
            return 1;
        }
        return b*powerRec(b,e-1);
    }
    public static double powerItre(double b,double e){
        double Result=1;
        while (e>0){
            Result *=b;
            e--;
        }
        return Result;
    }
    public static void main(String[] args) {
        System.out.println("Recursion ="+powerRec(5,6));
        System.out.println("Iteration ="+powerItre(5,6));

    }
}
