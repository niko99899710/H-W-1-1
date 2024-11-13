package org.example;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задание 1");
        int a = 3;
        double d = 34.4;
        char c = 'c';
        double result = a + d + c;
        System.out.println(result);
    }

    public static void task2() {
        System.out.println("Задание 2");
        int a = 5;
        int b = 12;
        boolean check = (a >= b) || (a <= b);
        System.out.println(check);
    }

    public static void task3() {
        System.out.println("Задание 3");
        int a = 6;
        a += 6;
        a -= 2;
        a /= 5;
        a *= 7;
        System.out.println(a);
    }
}
