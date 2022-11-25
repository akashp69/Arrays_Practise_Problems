package com.bridgelabz;

public class LargestElementInArray {
    public static void main(String[] args) {
        int array[] = {10, 45, 60, 75, 90};
        int a, b, c, d, e;
        a = array[0];
        b = array[1];
        c = array[2];
        d = array[3];
        e = array[4];


        if (a> b && a > c && a > d && a > e) {
            System.out.println(a);
        }
        else
        if (b> a && b > c && b > d && b > e) {
            System.out.println(b);
        }
        else
        if (c> a && c > b && c > d && c > e) {
            System.out.println(c);
        }
        else
        if (d> a && d > b && d > c && d > e) {
            System.out.println(d);
        }
        else
        if (e> a && e > b && e > c && e > d) {
            System.out.println(e);
        }



    }
}


