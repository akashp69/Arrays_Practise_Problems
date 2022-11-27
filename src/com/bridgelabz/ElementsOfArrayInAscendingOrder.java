package com.bridgelabz;

public class ElementsOfArrayInAscendingOrder {
    /**
    *This Method is Created For Find The  Elements of Array in Ascending Order
    */
    public static void main(String[] args) {
        int array[] = {100, 45, 60, 75, 90};
        int temp = 0;
    /**
    *Using For Loop To Arrange Elements In Ascending Order in an Array
    */

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
