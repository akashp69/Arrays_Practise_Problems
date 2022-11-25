package com.bridgelabz;

public class PrintElementsOfArrayInReverseOrder {
    public static void main(String[] args) {
        int array[]=new int[]{10,20,30,40,50,60,70,80,90,100};

        for(int i=9;array.length-1>=0;i--){
            System.out.println(array[i]);

        }
    }
}
