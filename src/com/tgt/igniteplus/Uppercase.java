package com.tgt.igniteplus;

import java.util.Scanner;

public class Uppercase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        String text = in.nextLine();
        String str = text.toUpperCase();
        System.out.println("String in upper case : "+str);
    }
}
