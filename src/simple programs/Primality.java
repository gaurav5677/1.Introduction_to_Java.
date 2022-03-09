package com.gaurav;

import java.util.Scanner;

public class Primality {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number");
//        int n = s.nextInt();
//        int div =  2 ;
//        boolean isPrime = true;
//
//        while(div <= n-1)   // n/2
//         {
//            if(n % div == 0 )
//                isPrime =false;
//            div = div+1;
//        }
//        if(isPrime){
//            System.out.println("Prime");
//        }else{
//            System.out.println("composite");
//        }
//    }
//}

        int n = s.nextInt();
        boolean isPrime = true;
        if (n % 2 == 0)
            isPrime = false;
        int i = 3;
        while (isPrime && i < n) {
            isPrime = !(n % i == 0);
            i += 2;

        }
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("composite");
        }
    }
}
