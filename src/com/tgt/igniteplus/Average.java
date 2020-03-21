package com.tgt.igniteplus;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int a[], i;
        boolean leap = false;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = in.nextInt();
        a=new int[n];
        float avg=0,sum=0;
        System.out.println("Enter the elements");
        for(i=0;i<n;i++)
            a[i] = in.nextInt();
        for(i=0;i<n;i++)
            sum=sum+a[i];
        avg=sum/n;
        System.out.println("Average = "+avg);
    }

}
