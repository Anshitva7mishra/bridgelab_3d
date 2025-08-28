import java.util.Scanner;

public class Assignment5 {
    static Scanner sc = new Scanner(System.in);

    // 1. Leap Year (multiple if-else)
    public static void leapYear1() {
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        if (year < 1582) {
            System.out.println("Invalid Year. Gregorian calendar started from 1582.");
        } else {
            if (year % 400 == 0) System.out.println(year + " is a Leap Year");
            else if (year % 100 == 0) System.out.println(year + " is NOT a Leap Year");
            else if (year % 4 == 0) System.out.println(year + " is a Leap Year");
            else System.out.println(year + " is NOT a Leap Year");
        }
    }

    // 2. Leap Year (single if with logical operators)
    public static void leapYear2() {
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        if (year >= 1582 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)))
            System.out.println(year + " is a Leap Year");
        else
            System.out.println(year + " is NOT a Leap Year");
    }

    // 3. Marks, Percentage, Grade
    public static void gradeCalc() {
        System.out.print("Enter Physics marks: ");
        int p = sc.nextInt();
        System.out.print("Enter Chemistry marks: ");
        int c = sc.nextInt();
        System.out.print("Enter Maths marks: ");
        int m = sc.nextInt();

        double avg = (p + c + m) / 3.0;
        System.out.println("Average = " + avg);

        if (avg >= 90) System.out.println("Grade: A (Excellent)");
        else if (avg >= 75) System.out.println("Grade: B (Very Good)");
        else if (avg >= 60) System.out.println("Grade: C (Good)");
        else if (avg >= 40) System.out.println("Grade: D (Pass)");
        else System.out.println("Grade: F (Fail)");
    }
    // 4. Prime Number
    public static void primeCheck() {
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        if (n <= 1) {
            System.out.println("Not Prime");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "Prime Number" : "Not Prime Number");
    }

    // 5. Armstrong Number
    public static void armstrongCheck() {
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int original = num, sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }
        if (sum == original) System.out.println(original + " is Armstrong");
        else System.out.println(original + " is NOT Armstrong");
    }

    // 6. Count Digits
    public static void digitCount() {
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int count = 0;
        int temp = Math.abs(num);
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        System.out.println("Number of digits = " + count);
    }

    // 7. BMI Calculator
    public static void bmiCalc() {
        System.out.print("Enter weight (kg): ");
        double weight = sc.nextDouble();
        System.out.print("Enter height (cm): ");
        double heightCm = sc.nextDouble();
        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);
        System.out.println("BMI = " + bmi);

        if (bmi < 18.5) System.out.println("Underweight");
        else if (bmi < 25) System.out.println("Normal weight");
        else if (bmi < 30) System.out.println("Overweight");
        else System.out.println("Obese");
    }

    // 8. Harshad Number
    public static void harshadCheck() {
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int sum = 0, temp = num;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        if (num % sum == 0) System.out.println(num + " is Harshad Number");
        else System.out.println(num + " is NOT Harshad Number");
    }

    // 9. Abundant Number
    public static void abundantCheck() {
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) sum += i;
        }
        if (sum > num) System.out.println(num + " is Abundant Number");
        else System.out.println(num + " is NOT Abundant Number");
    }

    // 10. Calculator (using if-else instead of switch)
    public static void calculator() {
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter operator (+,-,*,/): ");
        String op = sc.next();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        if (op.equals("+")) System.out.println("Result = " + (a + b));
        else if (op.equals("-")) System.out.println("Result = " + (a - b));
        else if (op.equals("*")) System.out.println("Result = " + (a * b));
        else if (op.equals("/")) {
            if (b != 0) System.out.println("Result = " + (a / b));
            else System.out.println("Cannot divide by zero");
        } else System.out.println("Invalid Operator");
    }

    // 11. Day of Week (Zeller’s Congruence formula)
    public static void dayOfWeek() {
        System.out.print("Enter month (1=Jan..12=Dec): ");
        int m = sc.nextInt();
        System.out.print("Enter day: ");
        int d = sc.nextInt();
        System.out.print("Enter year: ");
        int y = sc.nextInt();

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31*m0/12) % 7;

        System.out.println("Day of week (0=Sunday..6=Saturday): " + d0);
    }
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Level 3 Practice Programs ---");
            System.out.println("1. Leap Year (if-else)");
            System.out.println("2. Leap Year (logical)");
            System.out.println("3. Marks & Grade");
            System.out.println("4. Prime Number");
            System.out.println("5. Armstrong Number");
            System.out.println("6. Count Digits");
            System.out.println("7. BMI Calculator");
            System.out.println("8. Harshad Number");
            System.out.println("9. Abundant Number");
            System.out.println("10. Calculator");
            System.out.println("11. Day of Week");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            if (choice == 1) leapYear1();
            else if (choice == 2) leapYear2();
            else if (choice == 3) gradeCalc();
            else if (choice == 4) primeCheck();
            else if (choice == 5) armstrongCheck();
            else if (choice == 6) digitCount();
            else if (choice == 7) bmiCalc();
            else if (choice == 8) harshadCheck();
            else if (choice == 9) abundantCheck();
            else if (choice == 10) calculator();
            else if (choice == 11) dayOfWeek();
            else if (choice == 0) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }
    }
}