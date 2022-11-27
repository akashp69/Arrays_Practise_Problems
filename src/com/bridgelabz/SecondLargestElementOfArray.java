package com.bridgelabz;



public class SecondLargestElementOfArray {
    /**
     * This Method is Created For Find 2nd largest Elements Of Array
     */
    public static void main(String args[]){
        int temp, size;
        int array[] = {102, 104, 25, 63, 960, 57};
        size = array.length;

        /**
         * Using For and if Loop For Storing Elements in Ascending Order in Array
         */

        for(int i = 0; i<size; i++ ){
            for(int j = i+1; j<size; j++){

                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        /**
         * Print the 2Nd  Largest Element in Array
         */
        System.out.println(array[size-2]);
    }
}
