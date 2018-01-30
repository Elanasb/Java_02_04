package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.print("Iveskite du skaicius");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Suma: " + (a+b));
        System.out.println("Skirtumas: " + (a-b));
    }
    public static int Suma(int a, int b){
        return a+b;
    }
    public static int Skirtumas (int a, int b){
        return a-b;
    }
}
