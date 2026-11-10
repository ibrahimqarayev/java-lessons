package net.instudy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //
    }

    //Sort the given array in ascending and descending order
    public static void solution1() {
        int[] numbers = {24, 3, 31, 42, 1, 54, 71, 18, 89, 100};

        //Descending
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int swap = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = swap;
                }
            }
        }
        System.out.println("Descending: " + Arrays.toString(numbers));

        //Ascending
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int swap = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = swap;
                }
            }
        }
        System.out.println("Ascending: " + Arrays.toString(numbers));
    }

    //Swap the elements at the indexes entered by the user
    public static void solution2() {
        int[] numbers = {24, 3, 31, 42, 1, 54, 71, 18, 89, 100};

        System.out.print("Enter index 1: ");
        Scanner scanner = new Scanner(System.in);
        int index1 = scanner.nextInt();

        System.out.print("Enter index 2: ");
        int index2 = scanner.nextInt();

        int swapValue = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = swapValue;

        System.out.println(Arrays.toString(numbers));
    }

    //Keep only the even numbers in the array and remove the odd numbers.
    public static void solution3() {
        int[] numbers = {24, 3, 31, 42, 1, 54, 71, 18, 89, 100};

        int countOfEven = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                countOfEven++;
            }
        }

        int[] evenNumbers = new int[countOfEven];

        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenNumbers[index] = numbers[i];
                index++;
            }
        }

        System.out.println(Arrays.toString(evenNumbers));
    }

    //Remove duplicate elements from the array and keep each element only once
    public static void solution4() {
        int[] numbers = {24, 3, 31, 24, 42, 1, 3, 54, 71, 18, 89, 100};

        int countOfUnique = 0;

        for (int i = 0; i < numbers.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                countOfUnique++;
            }
        }

        int[] uniqueNumbers = new int[countOfUnique];
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                uniqueNumbers[index] = numbers[i];
                index++;
            }
        }

        System.out.println(Arrays.toString(uniqueNumbers));
    }

    //Find the second largest and second smallest numbers in an array
    public static void solution5() {
        int[] numbers = {1, 3, 7, 8, 12, 19, 31, 42, 56, 75, 99};

        //Descending sorting
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int swap = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = swap;
                }
            }
        }
        System.out.println("Second largest: " + numbers[numbers.length - 2]);
        System.out.println("Second smallest: " + numbers[1]);
    }

    // Calculates the factorial of the given number
    public static void solution6(int number) {
        int total = 1;
        for (int i = 1; i <= number; i++) {
            total = total * i;
        }
        System.out.println("Factorial: " + total);
    }

    // Prints the first n Fibonacci numbers
    public static void solution7(int number) {

        int first = 0;
        int second = 1;

        for (int i = 0; i < number; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    // Checks whether the given number is prime
    public static void solution8(int n) {
        if (n <= 0) {
            System.out.println(n + " is not a natural number");
            return;
        }

        if (n == 1) {
            System.out.println("1 is neither prime nor composite");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is a composite number");
        }
    }

    // Checks whether the given word is a palindrome
    public static void solution9(String word) {
        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }

        if (word.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }

    // Calculates the sum of the digits of the given number
    public static void solution10(int n) {
        int sum = 0;

        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }

        System.out.println(sum);
    }

    // Raises the base to the given exponent
    public static void solution11(int base, int exponent) {

        int result = 1;
        int count = 0;

        while (count < exponent) {
            result = result * base;
            count++;
        }

        System.out.println(result);
    }

    // Reverses the given number
    public static void solution12(int number) {
        int reversedNumber = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number = number / 10;
        }

        System.out.println(reversedNumber);
    }

    // Counts the number of digits in the given number
    public static void solution13(int number) {
        int count = 0;

        if (number == 0) {
            count = 1;
        }

        while (number != 0) {
            number = number / 10;
            count++;
        }

        System.out.println(count);
    }


    // Checks whether the given number is an Armstrong number
    public static void solution14(int number) {
        int originalNumber = number;
        int digitCount = 0;
        int sum = 0;

        for (int temp = number; temp > 0; temp /= 10) {
            digitCount++;
        }

        for (int temp = number; temp > 0; temp /= 10) {
            int digit = temp % 10;
            int power = 1;

            for (int i = 0; i < digitCount; i++) {
                power *= digit;
            }

            sum += power;
        }

        if (sum == originalNumber) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
}