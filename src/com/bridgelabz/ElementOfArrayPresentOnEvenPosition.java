package com.bridgelabz;

public class ElementOfArrayPresentOnEvenPosition {
    /**
    *This Method Created For Print The Elements Present on Even Position
    */
    public static void main(String[] args) {
        int array[]=new int[]{10,20,30,40,50,60,70,80,90,100};
    /**
    *Using For loop to get Elements of Array On Odd Position
    */

        for(int i=1;i< array.length;i=i+2){
            System.out.println(array[i]);
        }

    }
}
