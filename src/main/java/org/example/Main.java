package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       int a = 10;

       int num1 = 0;
       int num2 = 1;
       int sum =  1;

       for (int j=0; j < a; j++) {
           System.out.println(sum+" ");
           sum = num1 + num2;
           num1 = num2;
           num2 = sum;

       }


    }
}