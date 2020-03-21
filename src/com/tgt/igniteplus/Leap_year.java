package com.tgt.igniteplus;
import java.util.*;
public class Leap_year {
    public static void main(String[] args) {
        int year;
        boolean leap = false;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter year: ");
        year=in.nextInt();
        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                // year is divisible by 400, hence the year is a leap year
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;

        if(leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}
