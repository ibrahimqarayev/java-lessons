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
    }

    // Determine whether the given year is a leap year.
    public static void solution1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not leap year");
        }

    }

    //Given a month (1–12) and a year, determine the number of days in that month.
    public static void solution2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month: ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31 days");
            case 4, 6, 9, 11 -> System.out.println("30 days");
            case 2 -> {
                if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                    System.out.println("29 days");
                } else {
                    System.out.println("28 days");
                }
            }
            default -> System.out.println("Invalid month");
        }
    }

    //Determine whether the entered character is a vowel or a consonant.
    public static void solution3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);

        switch (character) {
            case 'a', 'ı', 'o', 'u', 'e', 'ə', 'i', 'ö', 'ü' -> System.out.println("Vowel");
            default -> System.out.println("Consonant");
        }
    }

    /*
    Get a month number from 1 to 12 from the user and print the name of the month in Azerbaijani.
    If an invalid number is entered, display "Yanlış ay nömrəsi".
    */
    public static void solution4() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int month = scanner.nextInt();

        switch (month) {
            case 1 -> System.out.println("Yanvar");
            case 2 -> System.out.println("Fevral");
            case 3 -> System.out.println("Mart");
            case 4 -> System.out.println("Aprel");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("İyun");
            case 7 -> System.out.println("İyul");
            case 8 -> System.out.println("Avqust");
            case 9 -> System.out.println("Sentyabr");
            case 10 -> System.out.println("Oktyabr");
            case 11 -> System.out.println("Noyabr");
            case 12 -> System.out.println("Dekabr");
            default -> System.out.println("Yanlış ay nömrəsi");
        }
    }
}