package net.instudy;

import java.util.Arrays;
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
    }


    /*
    127 Integer cache diapazonunda (-128..127) olduğu üçün a və b eyni obyektə işarə edir,
    ona görə == true verir. 128 isə bu diapazondan kənarda olduğu üçün c və d fərqli obyektlərdir,
    ona görə == false verir.
    .equals() isə hər zaman dəyəri müqayisə etdiyi üçün hər iki halda true qayıdır.
     */
    public static void solution1() {

        Integer a = 127;
        Integer b = 127;

        Integer c = 128;
        Integer d = 128;

        System.out.println(a == b);
        System.out.println(a.equals(b));

        System.out.println(c == d);
        System.out.println(c.equals(d));
    }

    //Write a Java program that takes a string from the user and checks whether it is a palindrome or not.
    public static void solution2() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = scanner.nextLine();

        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }

        if (text.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }

    //Write a Java program that takes a string from the user and reverses the string.
    public static void solution3() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = scanner.nextLine();

        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }

        System.out.println(reversed);
    }

    /*
    Write a Java program that takes two words from the user and checks whether they are anagrams of each other.
    Two words are anagrams if they contain the same letters with the same frequency,
    but the order of the letters can be different.
     */
    public static void solution4() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first word:");
        String firstWord = scanner.nextLine();

        System.out.println("Enter second word:");
        String secondWord = scanner.nextLine();

        char[] firstLetters = firstWord.toCharArray();
        char[] secondLetters = secondWord.toCharArray();

        Arrays.sort(firstLetters);
        Arrays.sort(secondLetters);

        if (Arrays.equals(firstLetters, secondLetters)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not anagrams");
        }
    }

    //Write a Java program that takes a sentence from the user and reverses the order of its words.
    public static void solution5() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = scanner.nextLine();

        String[] words = text.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }

    /*
    Write a Java program that takes a string from the user.
    Find the characters that appear more than once and
    print each repeated character together with its number of occurrences.
     */
    public static void solution6() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = scanner.nextLine();

        String printed = "";

        for (int i = 0; i < text.length(); i++) {

            char character = text.charAt(i);
            int count = 0;

            for (int j = 0; j < text.length(); j++) {

                if (text.charAt(j) == character) {
                    count++;
                }
            }

            if (count > 1 && !printed.contains(String.valueOf(character))) {
                System.out.println(character + "=" + count);
                printed = printed + character;
            }
        }
    }

    /*
    Write a Java program that takes a sentence as input from the user.
    Convert the first letter of each word to uppercase and print the resulting sentence.
     */
    public static void solution7() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text:");
        String text = scanner.nextLine();

        text = Character.toUpperCase(text.charAt(0)) + text.substring(1);

        for (int index = 0; index < text.length(); index++) {

            if (text.charAt(index) == ' ') {

                char nextCharacter = text.charAt(index + 1);
                char uppercaseCharacter = Character.toUpperCase(nextCharacter);

                text = text.substring(0, index + 1)
                        + uppercaseCharacter
                        + text.substring(index + 2);
            }
        }

        System.out.println(text);
    }

    /*
    Take an input from the user and check if it is a number.
     Print the appropriate message based on the result.
    */
    public static void solution8() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter input: ");
        String input = sc.nextLine();

        try {
            Integer.parseInt(input);
            System.out.println("The input is a number.");
        } catch (NumberFormatException e) {
            System.out.println("The input is not a number.");
        }
    }
}