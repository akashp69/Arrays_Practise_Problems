package com.bridgelabz;

public class SmallestElementsInArray {
    public static void main(String[] args) {
    /**
    *This Method is Created For Find The Smallest Elements of Array 
    */

        int array[] = {150, 450,490, 100, 350 };
        int a, b, c, d, e;
        a = array[0];
        b = array[1];
        c = array[2];
        d = array[3];
        e = array[4];
        
    /**
    *Using if-else for Find The smallest Elements Of Array 
    */


        if (a< b && a < c && a < d && a < e) {
            System.out.println(a);
        }
        else
        if (b< a && b < c && b < d && b < e) {
            System.out.println(b);
        }
        else
        if (c< a && c < b && c < d && c < e) {
            System.out.println(c);
        }
        else
        if (d<a && d < b && d < c && d < e) {
            System.out.println(d);
        }
        else
        if (e<a && e < b && e < c && e < d) {
            System.out.println(e);
        }
    }

}
