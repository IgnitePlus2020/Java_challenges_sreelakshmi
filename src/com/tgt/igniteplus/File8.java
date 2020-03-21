package com.tgt.igniteplus;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class File8 {
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the file to be created");
        String file = in.nextLine();
        try {
            File file1 = new File(file);
            boolean fvar = file1.createNewFile();
            if (fvar){
                System.out.println("File has been created successfully");
            }
            else{
                System.out.println("File already present at the specified location");
            }
        } catch (IOException e) {
            System.out.println("Exception Occurred:");
            e.printStackTrace();
        }
    }
}
