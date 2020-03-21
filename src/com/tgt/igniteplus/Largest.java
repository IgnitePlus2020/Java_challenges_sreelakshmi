package com.tgt.igniteplus;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter three numbers");
        Scanner in = new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        int large=a>b?(a>c?a:c):(b>c?b:c);
        System.out.print("Largest of the 3 numbers : "+large);
    }
}
