package com.bridgelabz;

public class ElementOfArrayPresentOnOddPosition {
    public static void main(String[] args) {
        int array[] = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        for (int i = 0; i < array.length; i = i + 2) {
            System.out.println(array[i]);
        }
    }
}
