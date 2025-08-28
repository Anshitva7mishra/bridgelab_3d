import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        // A single Scanner for all user inputs
        Scanner input = new Scanner(System.in);

        // 1. Basic Calculator
        System.out.println("--- 1. Basic Calculator ---");
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        System.out.printf("The addition, subtraction, multiplication, and division value of 2 numbers %.2f and %.2f is %.2f, %.2f, %.2f, and %.2f\n",
                num1, num2, sum, difference, product, quotient);
        System.out.println("----------------------------------------");


        // 2. Area of a Triangle
        System.out.println("\n--- 2. Area of a Triangle ---");
        System.out.print("Enter the base of the triangle in cm: ");
        double baseCm = input.nextDouble();
        System.out.print("Enter the height of the triangle in cm: ");
        double heightCm = input.nextDouble();
        double areaSqCm = 0.5 * baseCm * heightCm;
        // Convert sq cm to sq inches: 1 sq inch = 2.54 * 2.54 sq cm
        double areaSqIn = areaSqCm / (2.54 * 2.54);
        System.out.printf("The Area of the triangle in sq in is %.2f and sq cm is %.2f\n", areaSqIn, areaSqCm);
        System.out.println("----------------------------------------");


        // 3. Side of a Square from Perimeter
        System.out.println("\n--- 3. Side of a Square ---");
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();
        double side = perimeter / 4.0;
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f\n", side, perimeter);
        System.out.println("----------------------------------------");


        // 4. Distance Conversion (Feet to Yards/Miles)
        System.out.println("\n--- 4. Distance Conversion ---");
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();
        double distanceInYards = distanceInFeet / 3.0;
        double distanceInMiles = distanceInYards / 1760.0;
        System.out.printf("The distance in yards is %.2f while the distance in miles is %.4f\n", distanceInYards, distanceInMiles);
        System.out.println("----------------------------------------");


        // 5. Total Purchase Price
        System.out.println("\n--- 5. Total Purchase Price ---");
        System.out.print("Enter the unit price of the item: ");
        double unitPrice = input.nextDouble();
        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();
        double totalPrice = unitPrice * quantity;
        System.out.printf("The total purchase price is INR %.2f if the quantity is %d and unit price is INR %.2f\n",
                totalPrice, quantity, unitPrice);
        System.out.println("----------------------------------------");


        // 6. Quotient and Remainder
        System.out.println("\n--- 6. Quotient and Remainder ---");
        System.out.print("Enter the first integer (dividend): ");
        int dividend = input.nextInt();
        System.out.print("Enter the second integer (divisor): ");
        int divisor = input.nextInt();
        int divisionQuotient = dividend / divisor;
        int divisionRemainder = dividend % divisor;
        System.out.printf("The Quotient is %d and Reminder is %d of two number %d and %d\n",
                divisionQuotient, divisionRemainder, dividend, divisor);
        System.out.println("----------------------------------------");


        // 7. Integer Operations (IntOperation)
        System.out.println("\n--- 7. Integer Operations ---");
        System.out.print("Enter integer value for a: ");
        int a_int = input.nextInt();
        System.out.print("Enter integer value for b: ");
        int b_int = input.nextInt();
        System.out.print("Enter integer value for c: ");
        int c_int = input.nextInt();
        int res1_int = a_int + b_int * c_int;
        int res2_int = a_int * b_int + c_int;
        int res3_int = c_int + a_int / b_int;
        int res4_int = a_int % b_int + c_int;
        System.out.printf("The results of Int Operations are %d, %d, %d, and %d\n", res1_int, res2_int, res3_int, res4_int);
        System.out.println("----------------------------------------");


        // 8. Double Operations (DoubleOpt)
        System.out.println("\n--- 8. Double Operations ---");
        System.out.print("Enter double value for a: ");
        double a_double = input.nextDouble();
        System.out.print("Enter double value for b: ");
        double b_double = input.nextDouble();
        System.out.print("Enter double value for c: ");
        double c_double = input.nextDouble();
        double res1_double = a_double + b_double * c_double;
        double res2_double = a_double * b_double + c_double;
        double res3_double = c_double + a_double / b_double;
        double res4_double = a_double % b_double + c_double;
        System.out.printf("The results of Double Operations are %.2f, %.2f, %.2f, and %.2f\n",
                res1_double, res2_double, res3_double, res4_double);
        System.out.println("----------------------------------------");
        input.close();
    }
}