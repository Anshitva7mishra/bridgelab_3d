import java.util.*;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // -------------------- 1. Bonus of 10 Employees --------------------
        System.out.println("\n--- Employee Bonus Calculation ---");
        double[] salary = new double[10];
        double[] years = new double[10];
        double[] newSalary = new double[10];
        double[] bonus = new double[10];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            double s = sc.nextDouble();
            System.out.print("Enter years of service of employee " + (i + 1) + ": ");
            double y = sc.nextDouble();

            if (s <= 0 || y < 0) {
                System.out.println("Invalid input. Enter again!");
                i--;
                continue;
            }

            salary[i] = s;
            years[i] = y;

            if (y > 5)
                bonus[i] = s * 0.05;
            else
                bonus[i] = s * 0.02;

            newSalary[i] = s + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += s;
            totalNewSalary += newSalary[i];
        }

        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        // -------------------- 2. Youngest & Tallest --------------------
        System.out.println("\n--- Youngest & Tallest Among Amar, Akbar, Anthony ---");
        int[] ages = new int[3];
        int[] heights = new int[3];
        String[] names = { "Amar", "Akbar", "Anthony" };

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = sc.nextInt();
        }

        int youngestIndex = 0, tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex])
                youngestIndex = i;
            if (heights[i] > heights[tallestIndex])
                tallestIndex = i;
        }

        System.out.println("Youngest: " + names[youngestIndex]);
        System.out.println("Tallest: " + names[tallestIndex]);

        // -------------------- 3. Largest & Second Largest Digit --------------------
        System.out.println("\n--- Largest & Second Largest Digit ---");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        int tempNum = num;
        while (tempNum > 0) {
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                for (int j = 0; j < digits.length; j++)
                    temp[j] = digits[j];
                digits = temp;
            }
            digits[index++] = tempNum % 10;
            tempNum /= 10;
        }

        int largest = -1, secondLargest = -1;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        System.out.println("Largest digit: " + largest);
        System.out.println("Second Largest digit: " + secondLargest);

        // -------------------- 4. Reverse Number using Array --------------------
        System.out.println("\n--- Reverse Number ---");
        System.out.print("Enter a number: ");
        int num2 = sc.nextInt();
        String numStr = String.valueOf(num2);
        int[] digitArray = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digitArray[i] = numStr.charAt(i) - '0';
        }
        System.out.print("Reversed number: ");
        for (int i = digitArray.length - 1; i >= 0; i--) {
            System.out.print(digitArray[i]);
        }
        System.out.println();

        // -------------------- 5. BMI Calculation --------------------
        System.out.println("\n--- BMI Calculation ---");
        System.out.print("Enter number of persons: ");
        int persons = sc.nextInt();
        double[][] personData = new double[persons][3]; // weight, height, BMI
        String[] weightStatus = new String[persons];

        for (int i = 0; i < persons; i++) {
            double w, h;
            do {
                System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
                w = sc.nextDouble();
            } while (w <= 0);

            do {
                System.out.print("Enter height (m) for person " + (i + 1) + ": ");
                h = sc.nextDouble();
            } while (h <= 0);

            double bmi = w / (h * h);
            personData[i][0] = w;
            personData[i][1] = h;
            personData[i][2] = bmi;

            if (bmi < 18.5)
                weightStatus[i] = "Underweight";
            else if (bmi < 24.9)
                weightStatus[i] = "Normal";
            else if (bmi < 29.9)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        for (int i = 0; i < persons; i++) {
            System.out.println("Person " + (i + 1) + " - Weight: " + personData[i][0] +
                    ", Height: " + personData[i][1] +
                    ", BMI: " + personData[i][2] +
                    ", Status: " + weightStatus[i]);
        }

        // -------------------- 6. Percentage & Grade --------------------
        System.out.println("\n--- Student Percentage & Grade ---");
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();
        int[][] marks = new int[students][3]; // physics, chemistry, maths

        for (int i = 0; i < students; i++) {
            System.out.print("Enter Physics marks for student " + (i + 1) + ": ");
            marks[i][0] = sc.nextInt();
            System.out.print("Enter Chemistry marks for student " + (i + 1) + ": ");
            marks[i][1] = sc.nextInt();
            System.out.print("Enter Maths marks for student " + (i + 1) + ": ");
            marks[i][2] = sc.nextInt();
        }

        for (int i = 0; i < students; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double percent = total / 3.0;
            String grade;
            if (percent >= 90)
                grade = "A";
            else if (percent >= 75)
                grade = "B";
            else if (percent >= 50)
                grade = "C";
            else
                grade = "D";
            System.out.println("Student " + (i + 1) + " Percentage: " + percent + "% Grade: " + grade);
        }

        // -------------------- 7. Digit Frequency --------------------
        System.out.println("\n--- Digit Frequency ---");
        System.out.print("Enter a number: ");
        int num3 = sc.nextInt();
        int[] freq = new int[10];
        int temp = num3;
        while (temp > 0) {
            freq[temp % 10]++;
            temp /= 10;
        }
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0)
                System.out.println("Digit " + i + " occurs " + freq[i] + " times.");
        }

        sc.close();
    }
}
