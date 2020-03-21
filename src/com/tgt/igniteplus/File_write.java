package com.tgt.igniteplus;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;
public class File_write {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            OutputStream os = new FileOutputStream("file1.txt");
            System.out.println("Enter any text");
            String text = in.nextLine();
            byte buf[] = text.getBytes();
            for (int i = 0; i < buf.length; i++)
                os.write(buf[i]);
            System.out.println("Successfully written into file");
            os.close();
        }
        catch (IOException e) {
            System.out.println("Error");
        }
    }
}
