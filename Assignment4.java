import java.util.Scanner;

public class Assignment4 {
    static Scanner sc = new Scanner(System.in);

    // 1. Odd and Even Numbers
    public static void oddEven() {
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number < 1) {
            System.out.println("Please enter a natural number.");
            return;
        }
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) System.out.println(i + " is Even");
            else System.out.println(i + " is Odd");
        }
    }

    // 2. Employee Bonus
    public static void employeeBonus() {
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter Years of Service: ");
        int years = sc.nextInt();
        if (years > 5) System.out.println("Bonus = " + (salary * 0.05));
        else System.out.println("No Bonus");
    }

    // 3. Multiplication Table (6–9)
    public static void multiplicationTable() {
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        for (int i = 6; i <= 9; i++)
            System.out.println(number + " * " + i + " = " + (number * i));
    }

    // 4. FizzBuzz (for loop)
    public static void fizzBuzzFor() {
        System.out.print("Enter limit: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }

    // 5. FizzBuzz (while loop)
    public static void fizzBuzzWhile() {
        System.out.print("Enter limit: ");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            if (i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
            i++;
        }
    }

    // 6. Youngest & Tallest Friend
    public static void friends() {
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3], heights = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = sc.nextInt();
        }
        int youngest = 0, tallest = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngest]) youngest = i;
            if (heights[i] > heights[tallest]) tallest = i;
        }
        System.out.println("Youngest: " + names[youngest]);
        System.out.println("Tallest: " + names[tallest]);
    }

    // 7. Factors (for loop)
    public static void factorsFor() {
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++)
            if (number % i == 0) System.out.println(i);
    }

    // 8. Factors (while loop)
    public static void factorsWhile() {
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        int i = 1;
        while (i <= number) {
            if (number % i == 0) System.out.println(i);
            i++;
        }
    }

    // 9. Greatest Factor (for loop)
    public static void greatestFactorFor() {
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        int gf = 1;
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) { gf = i; break; }
        }
        System.out.println("Greatest Factor (beside itself): " + gf);
    }

    // 10. Greatest Factor (while loop)
    public static void greatestFactorWhile() {
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        int gf = 1, counter = number - 1;
        while (counter >= 1) {
            if (number % counter == 0) { gf = counter; break; }
            counter--;
        }
        System.out.println("Greatest Factor (beside itself): " + gf);
    }

    // 11. Multiples Below 100 (for loop)
    public static void multiplesFor() {
        System.out.print("Enter number (<100): ");
        int number = sc.nextInt();
        if (number > 0 && number < 100) {
            for (int i = 100; i >= 1; i--)
                if (i % number == 0) System.out.println(i);
        }
    }

    // 12. Power (for loop)
    public static void powerFor() {
        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter power: ");
        int p = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= p; i++) result *= base;
        System.out.println("Result = " + result);
    }

    // 13. Multiples Below 100 (while loop)
    public static void multiplesWhile() {
        System.out.print("Enter number (<100): ");
        int number = sc.nextInt();
        int i = 100;
        while (i >= 1) {
            if (i % number == 0) System.out.println(i);
            i--;
        }
    }

    // 14. Power (while loop)
    public static void powerWhile() {
        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter power: ");
        int p = sc.nextInt();
        int result = 1, count = 0;
        while (count < p) {
            result *= base;
            count++;
        }
        System.out.println("Result = " + result);
    }

    // ---------- MAIN MENU WITHOUT SWITCH ----------
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Level 2 Practice Programs ---");
            System.out.println("1. Odd & Even Numbers");
            System.out.println("2. Employee Bonus");
            System.out.println("3. Multiplication Table (6–9)");
            System.out.println("4. FizzBuzz (for)");
            System.out.println("5. FizzBuzz (while)");
            System.out.println("6. Youngest & Tallest Friend");
            System.out.println("7. Factors (for)");
            System.out.println("8. Factors (while)");
            System.out.println("9. Greatest Factor (for)");
            System.out.println("10. Greatest Factor (while)");
            System.out.println("11. Multiples <100 (for)");
            System.out.println("12. Power (for)");
            System.out.println("13. Multiples <100 (while)");
            System.out.println("14. Power (while)");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            if (choice == 1) oddEven();
            else if (choice == 2) employeeBonus();
            else if (choice == 3) multiplicationTable();
            else if (choice == 4) fizzBuzzFor();
            else if (choice == 5) fizzBuzzWhile();
            else if (choice == 6) friends();
            else if (choice == 7) factorsFor();
            else if (choice == 8) factorsWhile();
            else if (choice == 9) greatestFactorFor();
            else if (choice == 10) greatestFactorWhile();
            else if (choice == 11) multiplesFor();
            else if (choice == 12) powerFor();
            else if (choice == 13) multiplesWhile();
            else if (choice == 14) powerWhile();
            else if (choice == 0) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }
    }
}