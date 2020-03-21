package com.tgt.igniteplus;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_copy
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream fis = new FileInputStream("file1.txt");
        FileOutputStream fos = new FileOutputStream("file2.txt");
        int ch;
        while ((ch = fis.read()) != -1)
            fos.write(ch);
        System.out.println("Copied successfully");
        fis.close();
        fos.close();
    }
}

