package com.tgt.igniteplus;
import java.util.*;
public class Volume2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r,h,pi=3.14285714286,volume;
        System.out.println("enter radius and height of cylinder: ");
        r=in.nextDouble();
        h=in.nextDouble();
        volume=pi*(r*r)*h;
        System.out.println("Volume of the cylinder="+volume);
    }
}
