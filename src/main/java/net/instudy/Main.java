package net.instudy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("========== TASK 1 ==========");
        solution1();

        System.out.println("\n========== TASK 2 ==========");
        solution2();

        System.out.println("\n========== TASK 3 ==========");
        solution3();

        System.out.println("\n========== TASK 4 ==========");
        solution4();

        System.out.println("\n========== TASK 5 ==========");
        solution5();

        System.out.println("\n========== TASK 6 ==========");
        solution6();
    }

    //Daxil edilən ədədin cüt və ya tək olduğunu müəyyən et.
    public static void solution1() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

    //Daxil edilən üç ədəddən ən böyük olanı çap et.
    public static void solution2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int number3 = scanner.nextInt();

        int largest = number1;

        if (number2 > largest) {
            largest = number2;
        }

        if (number3 > largest) {
            largest = number3;
        }

        System.out.println(largest + " is the largest.");
    }

    //Proqrama daxil edilən 0–100 arası balın hərf qiymətini çap et.
    public static void solution3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your score: ");
        int score = scanner.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Invalid score");
        } else if (score >= 91) {
            System.out.println("A");
        } else if (score >= 81) {
            System.out.println("B");
        } else if (score >= 71) {
            System.out.println("C");
        } else if (score >= 61) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }

    //Daxil edilən üç kənarın üçbucaq bərabərsizliyinə uyğun olub-olmadığını müəyyən et.
    public static void solution4() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side a: ");
        int a = scanner.nextInt();

        System.out.print("Enter side b: ");
        int b = scanner.nextInt();

        System.out.print("Enter side c: ");
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Triangle is possible.");
        } else {
            System.out.println("Triangle is not possible.");
        }
    }

    //İki ədəd və əməliyyat işarəsi daxil edərək nəticəni çap et.
    public static void solution5() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = scanner.nextDouble();

        System.out.print("Select operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        if (operation == '+') {
            System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
        } else if (operation == '-') {
            System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
        } else if (operation == '*') {
            System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
        } else if (operation == '/') {
            if (number2 != 0) {
                System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
            } else {
                System.out.println("Cannot divide by zero.");
            }
        } else {
            System.out.println("Invalid operation.");
        }
    }

    //İki ədədin yerini üçüncü dəyişəndən istifadə etmədən dəyiş.
    public static void solution6() {
        int a = 10;
        int b = 20;

        a += b;
        b = a - b;
        a -= b;

        System.out.println("a = " + a + ", b = " + b);
    }

}
