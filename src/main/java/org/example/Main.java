package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {


            Scanner sc = new Scanner(System.in);
            double a = sc.nextDouble();
            char c = sc.next().charAt(0);
            double b = sc.nextDouble();

            switch (c) {
                case '+' -> System.out.println(a + b);
                case '-' -> System.out.println(a - b);
                case '*' -> System.out.println(a * b);
                case '/' -> System.out.println(a / b);
            }
        }
    }
}