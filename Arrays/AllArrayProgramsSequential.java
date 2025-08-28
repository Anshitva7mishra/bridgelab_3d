import java.util.*;

public class AllArrayProgramsSequential {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ---------------- 1. Voting Eligibility ----------------
        System.out.println("\n=== 1. Voting Eligibility ===");
        int[] ages = new int[10];
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }
        for (int age : ages) {
            if (age < 0)
                System.out.println("Invalid age: " + age);
            else if (age >= 18)
                System.out.println("The student with age " + age + " can vote.");
            else
                System.out.println("The student with age " + age + " cannot vote.");
        }

        // ---------------- 2. Positive/Negative/Zero ----------------
        System.out.println("\n=== 2. Number Analysis ===");
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }
        for (int n : nums) {
            if (n > 0) {
                if (n % 2 == 0)
                    System.out.println(n + " is Positive and Even");
                else
                    System.out.println(n + " is Positive and Odd");
            } else if (n < 0)
                System.out.println(n + " is Negative");
            else
                System.out.println("Zero");
        }
        if (nums[0] == nums[4])
            System.out.println("First and last elements are Equal");
        else if (nums[0] > nums[4])
            System.out.println("First element is Greater");
        else
            System.out.println("First element is Less");

        // ---------------- 3. Multiplication Table ----------------
        System.out.println("\n=== 3. Multiplication Table (1 to 10) ===");
        System.out.print("Enter a number: ");
        int n1 = sc.nextInt();
        int[] table1 = new int[10];
        for (int i = 1; i <= 10; i++)
            table1[i - 1] = n1 * i;
        for (int i = 1; i <= 10; i++)
            System.out.println(n1 + " * " + i + " = " + table1[i - 1]);

        // ---------------- 4. Store Numbers ----------------
        System.out.println("\n=== 4. Store Numbers until 0/negative or max 10 ===");
        int[] arr = new int[10];
        int count = 0, sum = 0;
        while (count < 10) {
            System.out.print("Enter a number (0/negative to stop): ");
            int val = sc.nextInt();
            if (val <= 0)
                break;
            arr[count++] = val;
            sum += val;
        }
        System.out.print("You entered: ");
        for (int i = 0; i < count; i++)
            System.out.print(arr[i] + " ");
        System.out.println("\nSum = " + sum);

        // ---------------- 5. Multiplication Table (6 to 9) ----------------
        System.out.println("\n=== 5. Multiplication Table (6 to 9) ===");
        System.out.print("Enter a number between 6 and 9: ");
        int n2 = sc.nextInt();
        if (n2 < 6 || n2 > 9) {
            System.out.println("Number must be between 6 and 9!");
        } else {
            int[] table2 = new int[10];
            for (int i = 1; i <= 10; i++)
                table2[i - 1] = n2 * i;
            for (int i = 1; i <= 10; i++)
                System.out.println(n2 + " * " + i + " = " + table2[i - 1]);
        }

        // ---------------- 6. Mean Height ----------------
        System.out.println("\n=== 6. Mean Height of 11 Players ===");
        double[] heights = new double[11];
        double hSum = 0;
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            hSum += heights[i];
        }
        System.out.println("Mean height = " + (hSum / heights.length));

        // ---------------- 7. Odd/Even Arrays ----------------
        System.out.println("\n=== 7. Odd and Even Arrays ===");
        System.out.print("Enter a natural number: ");
        int n3 = sc.nextInt();
        if (n3 <= 0) {
            System.out.println("Error: Enter natural number > 0");
        } else {
            int[] odd = new int[n3 / 2 + 1], even = new int[n3 / 2 + 1];
            int oddIdx = 0, evenIdx = 0;
            for (int i = 1; i <= n3; i++) {
                if (i % 2 == 0)
                    even[evenIdx++] = i;
                else
                    odd[oddIdx++] = i;
            }
            System.out.print("Odd: ");
            for (int i = 0; i < oddIdx; i++)
                System.out.print(odd[i] + " ");
            System.out.print("\nEven: ");
            for (int i = 0; i < evenIdx; i++)
                System.out.print(even[i] + " ");
            System.out.println();
        }

        // ---------------- 8. Factors ----------------
        System.out.println("\n=== 8. Factors of a Number ===");
        System.out.print("Enter a number: ");
        int n4 = sc.nextInt();
        int[] fact = new int[n4];
        int idx = 0;
        for (int i = 1; i <= n4; i++)
            if (n4 % i == 0)
                fact[idx++] = i;
        System.out.print("Factors of " + n4 + ": ");
        for (int i = 0; i < idx; i++)
            System.out.print(fact[i] + " ");
        System.out.println();

        // ---------------- 9. Copy 2D -> 1D ----------------
        System.out.println("\n=== 9. Copy 2D Array to 1D Array ===");
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter cols: ");
        int cols = sc.nextInt();
        int[][] mat = new int[rows][cols];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat[i][j] = sc.nextInt();
        int[] arr1D = new int[rows * cols];
        int idx2 = 0;
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                arr1D[idx2++] = mat[i][j];
        System.out.print("1D Array: ");
        for (int x : arr1D)
            System.out.print(x + " ");
        System.out.println();

        // ---------------- 10. FizzBuzz ----------------
        System.out.println("\n=== 10. FizzBuzz ===");
        System.out.print("Enter a positive number: ");
        int n5 = sc.nextInt();
        if (n5 <= 0) {
            System.out.println("Error: Enter positive integer!");
        } else {
            String[] fb = new String[n5 + 1];
            for (int i = 0; i <= n5; i++) {
                if (i % 3 == 0 && i % 5 == 0 && i != 0)
                    fb[i] = "FizzBuzz";
                else if (i % 3 == 0 && i != 0)
                    fb[i] = "Fizz";
                else if (i % 5 == 0 && i != 0)
                    fb[i] = "Buzz";
                else
                    fb[i] = String.valueOf(i);
            }
            for (int i = 0; i < fb.length; i++) {
                System.out.println("Position " + i + " = " + fb[i]);
            }
        }

        sc.close();
    }
}
