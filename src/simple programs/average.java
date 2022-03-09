package com.gaurav;

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter your name and marks ");
//        String str = s.nextLine();
//        int a = s.nextInt();
//        int b = s.nextInt();
//        int c = s.nextInt();
//        System.out.println(str + " " + (a+b+c)/3);


        char name = s.next().charAt(0);
        int m1,m2,m3;
        m1= s.nextInt();
        m2= s.nextInt();
        m3= s.nextInt();
        int average = (m1+m2+m3)/3;
        System.out.println(name);
        System.out.println(average);

    }
}
