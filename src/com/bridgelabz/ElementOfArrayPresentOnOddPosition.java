package com.bridgelabz;

public class ElementOfArrayPresentOnOddPosition {
    /**
    *This Method is Created For Find The  Elements of Array On Odd Position
    */
    public static void main(String[] args) {
    
        int array[] = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    /**
    *Using For loop to get Elements of Array On Odd Position
    */

        for (int i = 0; i < array.length; i = i + 2) {
            System.out.println(array[i]);
        }
    }
}
