package Methods.lev1;

import java.util.Scanner;

public class quest {

    // 1. Simple Interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    // 2. Handshakes
    public static int calculateHandshakes(int students) {
        return (students * (students - 1)) / 2;
    }

    // 3. Athlete rounds
    public static int calculateRounds(int a, int b, int c) {
        int perimeter = a + b + c;
        return (5000 / perimeter);
    }

    // 4. Check number sign
    public static int checkNumber(int num) {
        if (num > 0)
            return 1;
        else if (num < 0)
            return -1;
        else
            return 0;
    }

    // 5. Spring season
    public static boolean isSpringSeason(int month, int day) {
        if ((month == 3 && day >= 20) || (month == 6 && day <= 20) || (month > 3 && month < 6)) {
            return true;
        }
        return false;
    }

    // 6. Sum of N natural numbers
    public static int sumNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += i;
        return sum;
    }

    // 7. Smallest and Largest of 3 numbers
    public static int[] findSmallestAndLargest(int n1, int n2, int n3) {
        int smallest = Math.min(n1, Math.min(n2, n3));
        int largest = Math.max(n1, Math.max(n2, n3));
        return new int[] { smallest, largest };
    }

    // 8. Quotient and Remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[] { quotient, remainder };
    }

    // 9. Chocolates distribution
    public static int[] distributeChocolates(int chocolates, int children) {
        int perChild = chocolates / children;
        int remaining = chocolates % children;
        return new int[] { perChild, remaining };
    }

    // 10. Wind Chill
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature +
                (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    // Testing all methods
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example runs:
        System.out.println("Simple Interest: " + calculateSimpleInterest(1000, 5, 2));
        System.out.println("Handshakes: " + calculateHandshakes(10));
        System.out.println("Rounds in park: " + calculateRounds(100, 200, 300));
        System.out.println("Check Number (5): " + checkNumber(5));
        System.out.println("Spring Season (3,21): " + isSpringSeason(3, 21));
        System.out.println("Sum of N Natural (10): " + sumNaturalNumbers(10));
        int[] sl = findSmallestAndLargest(10, 20, 5);
        System.out.println("Smallest: " + sl[0] + ", Largest: " + sl[1]);
        int[] qr = findRemainderAndQuotient(17, 3);
        System.out.println("Quotient: " + qr[0] + ", Remainder: " + qr[1]);
        int[] choc = distributeChocolates(53, 6);
        System.out.println("Per Child: " + choc[0] + ", Remaining: " + choc[1]);
        System.out.println("Wind Chill (temp=10, wind=5): " + calculateWindChill(10, 5));

        sc.close();
    }
}
