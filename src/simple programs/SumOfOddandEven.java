package com.gaurav;
import java.util.Scanner;
public class SumOfOddandEven {




    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int num=s.nextInt();

        int soe=0,sod=0;
        while(num>0){
            int last = num % 10;
            if( last %2 == 0 ){
                soe = soe+last;
            }else{
                sod = sod + last;

            }
            num = num /10;

        }System.out.println(soe+ " " + sod);


    }
}

