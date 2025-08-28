//package Java_core;

import java.util.Scanner;
import java.lang.Math;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1
        System.out.println("--- Problem 1: Harry's Age ---");
        int birthYear = 2000;
        int currentYear = 2024;
        int age = currentYear - birthYear;
        System.out.println("Harry's age in 2024 is " + age);

        // 2
        System.out.println("\n--- Problem 2: Sam’s Average Mark ---");
        int maths = 94;
        int physics = 95;
        int chemistry = 96;
        double average = (maths + physics + chemistry) / 3.0;
        System.out.printf("Sam’s average mark in PCM is %.2f\n", average);

        // 3
        System.out.println("\n--- Problem 3: Kilometers to Miles ---");
        double kmDistance = 10.8;
        double milesDistance = kmDistance * 1.6;
        System.out.printf("The distance %.1f km in miles is %.2f\n", kmDistance, milesDistance);

        // 4
        System.out.println("\n--- Problem 4: Profit Calculation ---");
        double costPrice = 129.0;
        double sellingPrice = 191.0;
        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;
        System.out.printf("The Cost Price is INR %.2f and Selling Price is INR %.2f\n" +
                          "The Profit is INR %.2f and the Profit Percentage is %.2f%%\n",
                          costPrice, sellingPrice, profit, profitPercentage);

        // 5
        System.out.println("\n--- Problem 5: Pen Distribution ---");
        int totalPens = 14;
        int studentCount = 3;
        int pensPerStudent = totalPens / studentCount;
        int remainingPens = totalPens % studentCount;
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);

        // 6
        System.out.println("\n--- Problem 6: Course Fee Discount ---");
        double fee = 125000.0;
        double discountPercent = 10.0;
        double discountAmount = fee * (discountPercent / 100.0);
        double finalFee = fee - discountAmount;
        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f\n", discountAmount, finalFee);

        // 7
        System.out.println("\n--- Problem 7: Volume of Earth ---");
        double radiusOfEarthKm = 6378.0;
        double radiusOfEarthMiles = radiusOfEarthKm / 1.60934;
        double volumeInKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusOfEarthKm, 3);
        double volumeInMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusOfEarthMiles, 3);
        System.out.printf("The volume of earth in cubic kilometers is %.2e and cubic miles is %.2e\n", volumeInKm3, volumeInMiles3);

        // 8
        System.out.println("\n--- Problem 8: User Input Km to Miles ---");
        System.out.print("Enter distance in kilometers: ");
        double kmFromUser = input.nextDouble();
        double milesFromUser = kmFromUser / 1.6;
        System.out.printf("The total miles is %.2f mile for the given %.2f km\n", milesFromUser, kmFromUser);

        // 9
        System.out.println("\n--- Problem 9: User Input Fee Discount ---");
        System.out.print("Enter the student fee: ");
        double studentFee = input.nextDouble();
        System.out.print("Enter the discount percentage: ");
        double userDiscountPercent = input.nextDouble();
        double userDiscountAmount = studentFee * (userDiscountPercent / 100.0);
        double finalUserFee = studentFee - userDiscountAmount;
        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f\n", userDiscountAmount, finalUserFee);

        // 10
        System.out.println("\n--- Problem 10: Height Conversion ---");
        System.out.print("Enter your height in cm: ");
        double heightInCm = input.nextDouble();
        double totalInches = heightInCm / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;
        System.out.printf("Your Height in cm is %.1f while in feet is %d' and inches is %.1f\"\n", heightInCm, feet, inches);

        // 11
        System.out.println("\n--- Problem 11: Basic Calculator ---");
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();
        System.out.printf("The addition, subtraction, multiplication and division value of 2 numbers %.2f and %.2f is %.2f, %.2f, %.2f, and %.2f\n",
                num1, num2, (num1 + num2), (num1 - num2), (num1 * num2), (num1 / num2));
        
        // 12
        System.out.println("\n--- Problem 12: Area of a Triangle ---");
        System.out.print("Enter the triangle's base: ");
        double base = input.nextDouble();
        System.out.print("Enter the triangle's height: ");
        double height = input.nextDouble();
        double area = 0.5 * base * height;
        System.out.printf("The area for a triangle with base %.2f and height %.2f is %.2f\n", base, height, area);

        // 13
        System.out.println("\n--- Problem 13: Side of a Square ---");
        System.out.print("Enter the perimeter: ");
        double perimeter = input.nextDouble();
        double side = perimeter / 4.0;
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f\n", side, perimeter);

        // 14
        System.out.println("\n--- Problem 14: Feet to Yards/Miles ---");
        System.out.print("Enter distance in feet: ");
        double distFeet = input.nextDouble();
        double distYards = distFeet / 3.0;
        double distMiles = distFeet / 5280.0;
        System.out.printf("A distance of %.2f feet is %.2f yards, or %.4f miles.\n", distFeet, distYards, distMiles);

        // 15
        System.out.println("\n--- Problem 15: Total Purchase Price ---");
        System.out.print("Enter the unit price: ");
        double unitPrice = input.nextDouble();
        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();
        double totalPrice = unitPrice * quantity;
        System.out.printf("The total purchase price is INR %.2f if the quantity is %d and unit price is INR %.2f\n", totalPrice, quantity, unitPrice);

        // 16
        System.out.println("\n--- Problem 16: Handshake Calculator ---");
        System.out.print("Enter the number of students: ");
        int numberOfStudentsForHandshake = input.nextInt();
        int maxHandshakes = (numberOfStudentsForHandshake * (numberOfStudentsForHandshake - 1)) / 2;
        System.out.println("The maximum number of possible handshakes is " + maxHandshakes);
        
        input.close();
    }
}