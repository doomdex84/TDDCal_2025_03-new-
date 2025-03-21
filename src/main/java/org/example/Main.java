package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       int a = 5;

       for (int i = 0; i < a; i++) {
           for (int j = 0; j < i; j++) {
               System.out.print(" ");
           }
           for (int j = 1; j <= (a-i); j++) {
               System.out.print(j + " ");
           }
           System.out.println();
       }


    }
}