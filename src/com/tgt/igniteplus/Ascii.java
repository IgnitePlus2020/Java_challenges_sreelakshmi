package com.tgt.igniteplus;

import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch ;
        System.out.println("Enter the character");
        ch=in.next().charAt(0);
        int Ascii = (int) ch;
        System.out.println("The ASCII value of " + ch + " is: " + Ascii);
    }
}
