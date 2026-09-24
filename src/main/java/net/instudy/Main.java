package net.instudy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        solution6();
    }

    //Create an array of size 10 and print its elements to the screen.
    public static void solution1() {
        int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(i + " ");
        }
    }

    //Calculate the sum and arithmetic mean of all elements in the array.
    public static void solution2() {
        int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (double) sum / numbers.length);
    }

    //Print the number of even and odd elements in the array.
    public static void solution3() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        int oddNumbersCount = 0;
        int evenNumbersCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenNumbersCount++;
            } else {
                oddNumbersCount++;
            }
        }
        System.out.println("Odd: " + oddNumbersCount);
        System.out.println("Even: " + evenNumbersCount);
    }

    //Find and print the largest and smallest elements in the array.
    public static void solution4() {
        int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

    //Print the elements of the array in reverse order.
    public static void solution5() {
        int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }

    //Ask the user to enter a number. If the number is in the array, print its index; otherwise, print "Not found".
    public static void solution6() {

        Scanner sc = new Scanner(System.in);

        int[] array = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};

        System.out.print("Enter a number: ");

        int number = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                System.out.println("Index: " + i);
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("Not found");

    }


    //Print the elements on the main diagonal of the matrix.
    public static void solution7() {
        int[][] matrix = {
                {2, 4, 6},
                {8, 10, 12},
                {14, 16, 18}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }

    //Print the elements on the secondary diagonal of the matrix.
    public static void solution8() {
        int[][] matrix = {
                {2, 4, 6},
                {8, 10, 12},
                {14, 16, 18}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i + j == matrix.length - 1) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }

    /*
    Print the following pattern using `for` loops:

    *
    **
    ***
    ****
    *****

     */
    public static void solution9() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}