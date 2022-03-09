package com.gaurav;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
      int ans = 1 ;
      while( n>0){
          ans = ans*x;
          n--;

      }
        System.out.println(ans);
    }
}

