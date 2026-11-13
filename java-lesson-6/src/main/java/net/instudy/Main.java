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
    }

    //Calculate and print the sum of the numbers from 1 to 100.
    public static void solution1() {
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }

    //Print the even numbers from 1 to 50.
    public static void solution2() {
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    /*
    Using a do-while loop, write a program that asks the user to enter numbers until they choose to exit,
    and calculates the average of all the entered numbers.
    */
    public static void solution3() {

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        char choice;

        do {
            System.out.print("Do you want to exit? (Y/N): ");
            choice = sc.next().charAt(0);

            if (choice == 'N') {
                System.out.print("Enter a number: ");
                int number = sc.nextInt();

                sum += number;
                count++;
            }

        } while (choice == 'N');

        if (count > 0) {
            System.out.println("Average: " + (double) sum / count);
        } else {
            System.out.println("Average: 0");
        }
    }

    //Print the word "Hello" 5 times using a for loop.
    public static void solution4() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
        }
    }

    //Print the numbers from 10 to 1 in reverse order.
    public static void solution5() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

    //Ask the user to enter a number and print all the numbers from 1 to that number.
    public static void solution6() {
        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 1; i < number; i++) {
            System.out.print(i + " ");
        }
    }

    //Calculate the factorial (n!) of a number entered by the user.
    public static void solution7() {
        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int total = 1;
        for (int i = 1; i <= number; i++) {
            total = total * i;
        }
        System.out.println("Factorial: " + total);
    }

}

