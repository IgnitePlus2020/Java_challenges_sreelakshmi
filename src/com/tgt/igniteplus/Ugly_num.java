package com.tgt.igniteplus;
import java.util.*;
public class Ugly_num {
    public static void main(String[] args){
        System.out.print("Enter the number");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n<=0)
            System.out.print("Invalid");
        int flag=0;
        while(n!=1){
            if(n%2==0)
                n/=2;
            else if(n%3==0)
                n/=3;
            else if(n%5==0)
                n/=5;
            else
            {
                System.out.print("Ugly number");
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("Not an ugly number");
    }
}
