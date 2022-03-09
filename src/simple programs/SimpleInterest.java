package com.gaurav;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("enter principal , rate and time ");
        Scanner s = new Scanner(System.in);
        double principal ,rate , time ;
principal = s.nextFloat();
rate = s.nextFloat();
time = s.nextFloat();

        double si = (principal * rate * time )/100;
        System.out.println(" Simple interest " + si );
    }
}
