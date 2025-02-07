package control_flows;

import java.util.Arrays;

public class ControlFlows {
    public static void main(String[] args) {
        printStarPattern(5);
        checkPalindrome();
        countDigits(539298);
        printFibonacci(-4);
        printFibonacci(1);
        printFibonacci(2);
        printFibonacci(6);
        reverseNumber(123456789);
        printMultiplicationTable(7);
        printIsPrime(51);
        printIsPrime(3);
        sumNaturalNumbers(100);
        printFactorial(10);
        printFactorial(4);
        printIsEven(3463579);
        printIsEven(4648);
    }

    public static void printExerciseFormat(String question) {
        System.out.println("#################### Exercise ####################");
        System.out.println(question);
        System.out.println("#################### Answer ####################");
    }

    public static void printStarPattern(int numRows) {
        printExerciseFormat("Write a program to print an incremental star pattern.");
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void checkPalindrome() {
        printExerciseFormat("Write a program to check if a number is a palindrome.");
        isPalindrome(874478);
        isPalindrome(123456);
    }

    public static void isPalindrome(int number) {
        String numberString = String.valueOf(number);
        String reversedString = "";
        int length = numberString.length();
        for (int i = 0; i < length; i++) {
            reversedString = reversedString.concat(String.valueOf(numberString.charAt(length - i - 1)));
        }
        if (numberString.equals(reversedString)) {
            System.out.println(numberString + " is a palinfrome.");
            return;
        }
        System.out.println(numberString + " is not a palindrome.");
    }

    public static void countDigits(int number) {
        printExerciseFormat("Write a program to count the number of digits in a number");
        String numberString = String.valueOf(number);
        System.out.println(numberString + " is " + numberString.length() + " digits.");
    }

    public static void printFibonacci(int terms) {
        if (terms < 1) {
            System.out.println("Terms must be a positive integer, unlike " + terms);
            return;
        }
        int[] fibonacciSeries = new int[terms];
        fibonacciSeries[0] = 1;
        if (terms > 1) fibonacciSeries[1] = 1;
        for (int i = 2; i < fibonacciSeries.length; i++) {
            fibonacciSeries[i] = fibonacciSeries[i -1] + fibonacciSeries[i - 2];
        }
        System.out.println(Arrays.toString(fibonacciSeries));
    }

    public static void reverseNumber(int number) {
        printExerciseFormat("Write a program to reverse a number.");
        String stringNumber = String.valueOf(number);
        int numberLength = stringNumber.length();
        String reversedNumber = "";
        for (int i = 0; i < numberLength; i++) reversedNumber = reversedNumber.concat(String.valueOf(stringNumber.charAt(numberLength - i - 1)));
        System.out.println(reversedNumber);
    }

    public static void printMultiplicationTable(int number) {
        printExerciseFormat("Write a program to print the multiplication table of a number");
        for (int i = 0; i < 10; i++) System.out.print(i * number + " ");
        System.out.println();
    }

    public static void printIsPrime(int number) {
        printExerciseFormat("Write a program to check if a number is prime");
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println(number + " is not a prime number.");
                return;
            }
        }
        System.out.println(number + " is a prime number.");
    }

    public static void sumNaturalNumbers(int maximum) {
        printExerciseFormat("Write a program to find the sum of the first n natural numbers");
        int sum = 0;
        for (int i = 0; i <= maximum; i++) sum += i;
        System.out.println("The sum of the first " + maximum + " natural numbers is " + sum);
    }

    public static void printFactorial(int number) {
        printExerciseFormat("Write a program to calculate the factorial of a number using a loop");
        long factorial = 1;
        for (int i = 1; i <= number; i++) factorial *= i;
        System.out.println("Factorial of " + number + ": " + factorial);
    }

    public static void printIsEven(int number) {
        printExerciseFormat("Write a program that checks if a number is even or odd.");
        String type = "odd";
        if (number %  2 == 0) type = "even";
        System.out.println(number + " is " + type + ".");
    }

}
