package com.tgt.igniteplus;

import java.util.Scanner;

public class Concatenate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the two strings to be concatenated");
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        String concatenated_string = str1+str2;
        System.out.println("Concatenated string : "+concatenated_string);
    }
}
