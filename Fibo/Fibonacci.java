package com.codingblocks.lecture_3;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int first=0;
        int second=1;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n>=0) {    // for < n write condition (first<=n)
            System.out.println(first);
            int t = first + second;
            first = second;
            second = t;
            n = n - 1;
        }
        //System.out.println(first); //if printing all number one by one than write this line within the while
        //and make condition equal to 0
    }
}
