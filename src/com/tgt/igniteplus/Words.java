package com.tgt.igniteplus;

import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = in.nextLine();
        int count = 1;

        for (int i = 0; i < str.length() - 1; i++)
        {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
            {
                count++;

            }
        }
        System.out.println("Number of words in a string = " + count);

    }
}
