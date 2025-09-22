package Methods.lev2;

import java.util.Scanner;

public class quest2 {

    // 1. Factors of a number
    public static void factorsProgram(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++)
            if (number % i == 0)
                count++;
        int[] factors = new int[count];
        int idx = 0;
        for (int i = 1; i <= number; i++)
            if (number % i == 0)
                factors[idx++] = i;

        int sum = 0, sumSq = 0, product = 1;
        for (int f : factors) {
            sum += f;
            sumSq += Math.pow(f, 2);
            product *= f;
        }
        System.out.print("Factors: ");
        for (int f : factors)
            System.out.print(f + " ");
        System.out.println("\nSum = " + sum + ", SumSq = " + sumSq + ", Product = " + product);
    }

    // 2. Sum of n natural numbers (recursion vs formula)
    public static int sumRecursive(int n) {
        if (n == 0)
            return 0;
        return n + sumRecursive(n - 1);
    }

    public static void sumNaturalProgram(int n) {
        int rec = sumRecursive(n);
        int formula = n * (n + 1) / 2;
        System.out.println("Recursive sum = " + rec + ", Formula sum = " + formula);
    }

    // 3. Leap year check
    public static boolean isLeapYear(int year) {
        if (year < 1582)
            return false;
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // 4. Unit Converter (km <-> miles, meters <-> feet)
    public static double kmToMiles(double km) {
        return km * 0.621371;
    }

    public static double milesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double metersToFeet(double m) {
        return m * 3.28084;
    }

    public static double feetToMeters(double f) {
        return f * 0.3048;
    }

    // 5. Unit Converter (yards <-> feet, meters <-> inches, inches -> cm)
    public static double yardsToFeet(double y) {
        return y * 3;
    }

    public static double feetToYards(double f) {
        return f * 0.333333;
    }

    public static double metersToInches(double m) {
        return m * 39.3701;
    }

    public static double inchesToMeters(double i) {
        return i * 0.0254;
    }

    public static double inchesToCm(double i) {
        return i * 2.54;
    }

    // 6. Unit Converter (temperature, weight, volume)
    public static double fToC(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double cToF(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double poundsToKg(double p) {
        return p * 0.453592;
    }

    public static double kgToPounds(double kg) {
        return kg * 2.20462;
    }

    public static double gallonsToLiters(double g) {
        return g * 3.78541;
    }

    public static double litersToGallons(double l) {
        return l * 0.264172;
    }

    // 7. Student voting eligibility
    public static boolean canStudentVote(int age) {
        if (age < 0)
            return false;
        return age >= 18;
    }

    // 8. Youngest & tallest among 3 friends
    public static int youngest(int[] ages) {
        int idx = 0;
        for (int i = 1; i < ages.length; i++)
            if (ages[i] < ages[idx])
                idx = i;
        return idx;
    }

    public static int tallest(double[] heights) {
        int idx = 0;
        for (int i = 1; i < heights.length; i++)
            if (heights[i] > heights[idx])
                idx = i;
        return idx;
    }

    // 9. Positive/negative, even/odd, compare first & last
    public static boolean isPositive(int n) {
        return n >= 0;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int compare(int a, int b) {
        if (a > b)
            return 1;
        if (a == b)
            return 0;
        return -1;
    }

    // 10. BMI Calculator
    public static double calcBMI(double weightKg, double heightCm) {
        double hM = heightCm / 100.0;
        return weightKg / (hM * hM);
    }

    public static String bmiStatus(double bmi) {
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }

    // Main for quick testing
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quest2 Programs Ready! Test individually by calling methods.");
        sc.close();
    }
}
