package com.bridgelabz;

public class PrintElementsOfArrayInReverseOrder {
    /**
    *This Method is Created For arrange The  Elements of Array in Reverse Order
    */
    public static void main(String[] args) {
        int array[]=new int[]{10,20,30,40,50,60,70,80,90,100};
      
    /**
    *Used For Loop For Print The Elements in Array In Reverse Order
    */

        for(int i=9;array.length-1>=0;i--){
            System.out.println(array[i]);

        }
    }
}
