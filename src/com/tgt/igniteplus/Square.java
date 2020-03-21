package com.tgt.igniteplus;

import java.util.Scanner;
import java.lang.Math;
public class Square {
    static boolean isPerfectSquare(double x)
    {

        double sr = Math.sqrt(x);
        return ((sr - Math.floor(sr)) == 0);
    }

    // Driver code
    public static void main(String[] args)
    {
        double x ;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        x=in.nextDouble();

        if (isPerfectSquare(x))
            System.out.print("Perfect square");
        else
            System.out.print("Not Perfect square");
    }
}



