package com.tgt.igniteplus;
import java.util.*;
public class Replace {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String str="I am always ready to learn although I do not always like being taught.";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a')
                str = str.replace('a', '$');
        }
        System.out.println("Replaced string: " + str);
    }
}
