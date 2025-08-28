

import java.util.Scanner;

public class Assignment3 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Write a program to check if a number is divisible by 5
        System.out.println("--- Program 1: Divisible by 5 ---");
        System.out.print("Enter a number: ");
        int numDivisible = input.nextInt();
        boolean isDivisible = numDivisible % 5 == 0;
        System.out.println("Is the number " + numDivisible + " divisible by 5? " + isDivisible);

        System.out.println("\n" + "=".repeat(30) + "\n");

        // 2. Write a program to check if the first is the smallest of the 3 numbers.
        System.out.println("--- Program 2: Smallest of Three ---");
        System.out.print("Enter the first number: ");
        double num1Smallest = input.nextDouble();
        System.out.print("Enter the second number: ");
        double num2Smallest = input.nextDouble();
        System.out.print("Enter the third number: ");
        double num3Smallest = input.nextDouble();
        boolean isSmallest = num1Smallest < num2Smallest && num1Smallest < num3Smallest;
        System.out.println("Is the first number the smallest? " + isSmallest);

        System.out.println("\n" + "=".repeat(30) + "\n");

        // 3. Write a program to check if the first, second, or third number is the largest of the three.
        System.out.println("--- Program 3: Largest of Three ---");
        System.out.print("Enter the first number: ");
        double num1Largest = input.nextDouble();
        System.out.print("Enter the second number: ");
        double num2Largest = input.nextDouble();
        System.out.print("Enter the third number: ");
        double num3Largest = input.nextDouble();
        System.out.println("Is the first number the largest? " + (num1Largest > num2Largest && num1Largest > num3Largest));
        System.out.println("Is the second number the largest? " + (num2Largest > num1Largest && num2Largest > num3Largest));
        System.out.println("Is the third number the largest? " + (num3Largest > num1Largest && num3Largest > num2Largest));

        System.out.println("\n" + "=".repeat(30) + "\n");

        // 4. Write a program to check for the natural number and write the sum of n natural numbers
        System.out.println("--- Program 4: Sum of N Natural Numbers ---");
        System.out.print("Enter a number: ");
        int numNatural = input.nextInt();
        if (numNatural > 0) {
            long sumNatural = (long) numNatural * (numNatural + 1) / 2;
            System.out.println("The sum of " + numNatural + " natural numbers is " + sumNatural);
        } else {
            System.out.println("The number " + numNatural + " is not a natural number");
        }

        System.out.println("\n" + "=".repeat(30) + "\n");

        // 5. Write a program to check whether a person can vote
        System.out.println("--- Program 5: Voting Eligibility ---");
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        System.out.println("\n" + "=".repeat(30) + "\n");

        // 6. Write a program to check whether a number is positive, negative, or zero.
        System.out.println("--- Program 6: Positive, Negative, or Zero ---");
        System.out.print("Enter a number: ");
        double numCheck = input.nextDouble();
        if (numCheck > 0) {
            System.out.println("The number is positive.");
        } else if (numCheck < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        System.out.println("\n" + "=".repeat(30) + "\n");

        // 7. Write a program for Spring Season
        System.out.println("--- Program 7: Spring Season ---");
        System.out.print("Enter the month (as a number 1-12): ");
        int month = input.nextInt();
        System.out.print("Enter the day: ");
        int day = input.nextInt();
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }

        System.out.println("\n" + "=".repeat(30) + "\n");

        // 8. Write a program to count down using a while loop
        System.out.println("--- Program 8: Countdown (while loop) ---");
        System.out.print("Enter a number to countdown from: ");
        int counterWhile = input.nextInt();
        while (counterWhile >= 1) {
            System.out.println(counterWhile);
            counterWhile--;
        }
        System.out.println("Launch!");

        System.out.println("\n" + "=".repeat(30) + "\n");

        // 9. Rewrite program 8 to do the countdown using the for-loop
        System.out.println("--- Program 9: Countdown (for loop) ---");
        System.out.print("Enter a number to countdown from: ");
        int counterFor = input.nextInt();
        for (int i = counterFor; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Launch!");

        System.out.println("\n" + "=".repeat(30) + "\n");

        // 10. Write a program to find the sum of numbers until the user enters 0
        System.out.println("--- Program 10: Sum until 0 ---");
        double total10 = 0.0;
        while (true) {
            System.out.print("Enter a number (enter 0 to stop): ");
            double entry10 = input.nextDouble();
            if (entry10 == 0) {
                break;
            }
            total10 += entry10;
        }
        System.out.println("The total sum is: " + total10);

        System.out.println("\n" + "=".repeat(30) + "\n");

        // 11. Rewrite program 10 to find the sum until the user enters 0 or a negative number
        System.out.println("--- Program 11: Sum until 0 or negative ---");
        double total11 = 0.0;
        while (true) {
            System.out.print("Enter a positive number (0 or negative to stop): ");
            double entry11 = input.nextDouble();
            if (entry11 <= 0) {
                break;
            }
            total11 += entry11;
        }
        System.out.println("The total sum is: " + total11);

        System.out.println("\n" + "=".repeat(30) + "\n");

        // 12. Write a program to find the sum of n natural numbers using while loop and compare with formula
        System.out.println("--- Program 12: Sum of N (while loop vs formula) ---");
        System.out.print("Enter a natural number: ");
        int numSumWhile = input.nextInt();
        if (numSumWhile > 0) {
            long formulaSum = (long) numSumWhile * (numSumWhile + 1) / 2;
            long loopSum = 0;
            int i = 1;
            while (i <= numSumWhile) {
                loopSum += i;
                i++;
            }
            System.out.println("Sum from formula: " + formulaSum);
            System.out.println("Sum from while loop: " + loopSum);
            if (formulaSum == loopSum) {
                System.out.println("The results from both computations are correct.");
            } else {
                System.out.println("There was a discrepancy in the computations.");
            }
        } else {
            System.out.println("The number " + numSumWhile + " is not a natural number.");
        }

        System.out.println("\n" + "=".repeat(30) + "\n");

        // 13. Rewrite the program number 12 with the for loop
        System.out.println("--- Program 13: Sum of N (for loop vs formula) ---");
        System.out.print("Enter a natural number: ");
        int numSumFor = input.nextInt();
        if (numSumFor > 0) {
            long formulaSumFor = (long) numSumFor * (numSumFor + 1) / 2;
            long loopSumFor = 0;
            for (int i = 1; i <= numSumFor; i++) {
                loopSumFor += i;
            }
            System.out.println("Sum from formula: " + formulaSumFor);
            System.out.println("Sum from for loop: " + loopSumFor);
            if (formulaSumFor == loopSumFor) {
                System.out.println("The results from both computations are correct.");
            } else {
                System.out.println("There was a discrepancy in the computations.");
            }
        } else {
            System.out.println("The number " + numSumFor + " is not a natural number.");
        }

        System.out.println("\n" + "=".repeat(30) + "\n");

        // 14. Write a Program to find the factorial of an integer using a while loop
        System.out.println("--- Program 14: Factorial (while loop) ---");
        System.out.print("Enter a positive integer: ");
        int numFactWhile = input.nextInt();
        if (numFactWhile >= 0) {
            long factorial = 1;
            int i = 1;
            while (i <= numFactWhile) {
                factorial *= i;
                i++;
            }
            System.out.println("The factorial of " + numFactWhile + " is " + factorial);
        } else {
            System.out.println("Factorial is not defined for negative numbers.");
        }

        System.out.println("\n" + "=".repeat(30) + "\n");

        // 15. Rewrite program 14 using for loop
        System.out.println("--- Program 15: Factorial (for loop) ---");
        System.out.print("Enter a positive integer: ");
        int numFactFor = input.nextInt();
        if (numFactFor >= 0) {
            long factorialFor = 1;
            for (int i = 1; i <= numFactFor; i++) {
                factorialFor *= i;
            }
            System.out.println("The factorial of " + numFactFor + " is " + factorialFor);
        } else {
            System.out.println("Factorial is not defined for negative numbers.");
        }

        System.out.println("\n" + "=".repeat(30) + "\n");

        // 16. Create a program to print odd and even numbers
        System.out.println("--- Program 16: Odd and Even Numbers ---");
        System.out.print("Enter a natural number: ");
        int numOddEven = input.nextInt();
        if (numOddEven > 0) {
            for (int i = 1; i <= numOddEven; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number.");
                } else {
                    System.out.println(i + " is an odd number.");
                }
            }
        } else {
            System.out.println("Please enter a natural number (greater than 0).");
        }

        System.out.println("\n" + "=".repeat(30) + "\n");

        // 17. Create a program to find the bonus of employees
        System.out.println("--- Program 17: Employee Bonus ---");
        System.out.print("Enter employee's salary: ");
        double salary = input.nextDouble();
        System.out.print("Enter years of service: ");
        int serviceYears = input.nextInt();
        if (serviceYears > 5) {
            double bonus = salary * 0.05;
            System.out.printf("The bonus amount is: %.2f%n", bonus);
        } else {
            System.out.println("No bonus is awarded for 5 years or less of service.");
        }

        System.out.println("\n" + "=".repeat(30) + "\n");

        // 18. Create a program to find the multiplication table of a number from 6 to 9
        System.out.println("--- Program 18: Multiplication Table (6-9) ---");
        System.out.print("Enter a number for the multiplication table: ");
        int numTable = input.nextInt();
        System.out.println("Multiplication table for " + numTable + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(numTable + " * " + i + " = " + (numTable * i));
        }

        input.close();
    }
}