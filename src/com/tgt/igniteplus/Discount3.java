package com.tgt.igniteplus;

import java.util.Scanner;

public class Discount3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float cp,sp,discount,dis_cost;
        System.out.println("Enter cost price and discount percentage : ");
        cp=in.nextInt();
        discount=in.nextInt();
        dis_cost=cp*(discount/100);
        System.out.println("Discount Amount = "+dis_cost);
        sp=cp-discount;
        System.out.println("Selling Price = "+sp);
    }
}
