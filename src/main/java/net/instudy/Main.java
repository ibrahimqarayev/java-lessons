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

        System.out.println("\n========== TASK 7 ==========");
        solution7();

        System.out.println("\n========== TASK 8 ==========");
        solution8();

        System.out.println("\n========== TASK 9 ==========");
        solution9();

        System.out.println("\n========== TASK 10 ==========");
        solution10();

    }

    public static void solution1() {
        byte byteNumber = 10;
        short shortNumber = 100;
        int intNumber = 1000;
        long longNumber = 10000L;
        float floatNumber = 10.5f;
        double doubleNumber = 20.5;
        char character = 'A';
        boolean isActive = true;

        System.out.println(byteNumber);
        System.out.println(shortNumber);
        System.out.println(intNumber);
        System.out.println(longNumber);
        System.out.println(floatNumber);
        System.out.println(doubleNumber);
        System.out.println(character);
        System.out.println(isActive);
    }

    public static void solution2() {
        int number = 10;
        double doubleNumber = number;

        double anotherNumber = 10.5;
        int intNumber = (int) anotherNumber;

        System.out.println("Implicit casting: " + doubleNumber);
        System.out.println("Explicit casting: " + intNumber);

        /*
         * Implicit casting zamanı informasiya itkisi baş vermir,
         * Çünki int tipi daha kiçik olduğu üçün double tipinə avtomatik çevrilir.
         *
         * Explicit casting zamanı informasiya itkisi baş verə bilər.
         * Məsələn, 20.5 double tipindən int tipinə çevriləndə
         * 0.5 hissəsi itir və nəticə 20 olur.
         */
    }

    public static void solution3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter character: ");
        char character = scanner.next().charAt(0);

        int asciiCode = character;
        System.out.println("ASCII code: " + asciiCode);

        System.out.print("Enter ASCII code: ");
        int number = scanner.nextInt();

        char result = (char) number;
        System.out.println("Character: " + result);
    }

    public static void solution4() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.println("Hello " + name + ", you are " + age + " years old.");
    }

    public static void solution5() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("+: " + (firstNumber + secondNumber));
        System.out.println("-: " + (firstNumber - secondNumber));
        System.out.println("*: " + (firstNumber * secondNumber));
        System.out.println("/: " + (firstNumber / secondNumber));
        System.out.println("%: " + (firstNumber % secondNumber));
    }

    public static void solution6() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("first > second: " + (firstNumber > secondNumber));
        System.out.println("first < second: " + (firstNumber < secondNumber));
        System.out.println("first == second: " + (firstNumber == secondNumber));
        System.out.println("first != second: " + (firstNumber != secondNumber));
        System.out.println("first >= second: " + (firstNumber >= secondNumber));
        System.out.println("first <= second: " + (firstNumber <= secondNumber));
    }

    public static void solution7() {
        boolean isActive = true;

        System.out.println("Active: " + isActive);
        System.out.println("Not active: " + !isActive);
    }

    public static void solution8() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first grade: ");
        int firstGrade = scanner.nextInt();

        System.out.print("Enter second grade: ");
        int secondGrade = scanner.nextInt();

        System.out.print("Enter third grade: ");
        int thirdGrade = scanner.nextInt();

        double average = (firstGrade + secondGrade + thirdGrade) / 3.0;

        System.out.println("Average: " + average);
    }

    public static void solution9() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter width: ");
        double width = scanner.nextDouble();

        System.out.print("Enter length: ");
        double length = scanner.nextDouble();

        double area = width * length;
        double perimeter = 2 * (width + length);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }

    public static void solution10() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();

        double pi = 3;
        double area = pi * radius * radius;
        double circumference = 2 * pi * radius;

        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }

}