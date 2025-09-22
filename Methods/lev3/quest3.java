package Methods.lev3;

import java.util.*;

public class quest3 {

    // ---------- 1. Football team heights ----------
    public static void footballHeights() {
        int[] heights = new int[11];
        Random r = new Random();
        int sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < 11; i++) {
            heights[i] = 150 + r.nextInt(101); // 150–250
            sum += heights[i];
            if (heights[i] < min)
                min = heights[i];
            if (heights[i] > max)
                max = heights[i];
        }
        double mean = sum / 11.0;
        System.out.println("Heights: " + Arrays.toString(heights));
        System.out.println("Shortest: " + min + " Tallest: " + max + " Mean: " + mean);
    }

    // ---------- 2. NumberChecker Part 1 ----------
    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    public static int[] digitsArray(int n) {
        String s = String.valueOf(n);
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++)
            arr[i] = s.charAt(i) - '0';
        return arr;
    }

    public static boolean isDuck(int[] arr) {
        for (int d : arr)
            if (d == 0)
                return true;
        return false;
    }

    public static boolean isArmstrong(int[] arr) {
        int pow = arr.length, sum = 0;
        for (int d : arr)
            sum += Math.pow(d, pow);
        int num = 0;
        for (int d : arr)
            num = num * 10 + d;
        return num == sum;
    }

    public static void largestTwo(int[] arr) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int d : arr) {
            if (d > max1) {
                max2 = max1;
                max1 = d;
            } else if (d > max2 && d != max1)
                max2 = d;
        }
        System.out.println("Largest: " + max1 + " Second Largest: " + max2);
    }

    public static void smallestTwo(int[] arr) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int d : arr) {
            if (d < min1) {
                min2 = min1;
                min1 = d;
            } else if (d < min2 && d != min1)
                min2 = d;
        }
        System.out.println("Smallest: " + min1 + " Second Smallest: " + min2);
    }

    // ---------- 3. NumberChecker Part 2 ----------
    public static int sumDigits(int[] arr) {
        int s = 0;
        for (int d : arr)
            s += d;
        return s;
    }

    public static int sumSquares(int[] arr) {
        int s = 0;
        for (int d : arr)
            s += Math.pow(d, 2);
        return s;
    }

    public static boolean isHarshad(int n, int[] arr) {
        return n % sumDigits(arr) == 0;
    }

    public static void digitFrequency(int[] arr) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++)
            freq[i][0] = i;
        for (int d : arr)
            freq[d][1]++;
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++)
            if (freq[i][1] > 0)
                System.out.println(freq[i][0] + " -> " + freq[i][1]);
    }

    // ---------- 4. Palindrome check ----------
    public static int[] reverse(int[] arr) {
        int[] rev = arr.clone();
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int t = rev[i];
            rev[i] = rev[j];
            rev[j] = t;
        }
        return rev;
    }

    public static boolean isPalindrome(int[] arr) {
        return Arrays.equals(arr, reverse(arr));
    }

    public static boolean compareArrays(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    // ---------- 5. Prime, Neon, Spy, Automorphic, Buzz ----------
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static boolean isNeon(int n) {
        int sq = n * n, sum = 0;
        while (sq > 0) {
            sum += sq % 10;
            sq /= 10;
        }
        return sum == n;
    }

    public static boolean isSpy(int n) {
        int sum = 0, prod = 1, temp = n;
        while (temp > 0) {
            int d = temp % 10;
            sum += d;
            prod *= d;
            temp /= 10;
        }
        return sum == prod;
    }

    public static boolean isAutomorphic(int n) {
        return String.valueOf(n * n).endsWith(String.valueOf(n));
    }

    public static boolean isBuzz(int n) {
        return n % 7 == 0 || n % 10 == 7;
    }

    // ---------- 6. Perfect, Abundant, Deficient, Strong ----------
    public static int sumDivisors(int n) {
        int s = 0;
        for (int i = 1; i <= n / 2; i++)
            if (n % i == 0)
                s += i;
        return s;
    }

    public static boolean isPerfect(int n) {
        return sumDivisors(n) == n;
    }

    public static boolean isAbundant(int n) {
        return sumDivisors(n) > n;
    }

    public static boolean isDeficient(int n) {
        return sumDivisors(n) < n;
    }

    public static boolean isStrong(int n) {
        int sum = 0, temp = n;
        while (temp > 0) {
            int d = temp % 10;
            sum += fact(d);
            temp /= 10;
        }
        return sum == n;
    }

    public static int fact(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++)
            f *= i;
        return f;
    }

    // ---------- 7. Factors ----------
    public static int[] factors(int n) {
        ArrayList<Integer> f = new ArrayList<>();
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                f.add(i);
        return f.stream().mapToInt(i -> i).toArray();
    }

    public static int maxFactor(int[] arr) {
        return Arrays.stream(arr).max().getAsInt();
    }

    public static int sumFactors(int[] arr) {
        return Arrays.stream(arr).sum();
    }

    public static int productFactors(int[] arr) {
        int p = 1;
        for (int x : arr)
            p *= x;
        return p;
    }

    public static double cubeProductFactors(int[] arr) {
        double p = 1;
        for (int x : arr)
            p *= Math.pow(x, 3);
        return p;
    }

    // ---------- 8. OTP ----------
    public static int generateOTP() {
        return 100000 + (int) (Math.random() * 900000);
    }

    public static boolean validateUniqueOTPs() {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++)
            set.add(generateOTP());
        return set.size() == 10;
    }

    // ---------- 9. Calendar ----------
    public static String getMonthName(int m) {
        String[] months = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        return months[m - 1];
    }

    public static int daysInMonth(int m, int y) {
        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (m == 2 && isLeap(y))
            return 29;
        return days[m - 1];
    }

    public static boolean isLeap(int y) {
        return (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0));
    }

    public static int firstDay(int m, int y) {
        // Zeller’s Congruence
        if (m < 3) {
            m += 12;
            y--;
        }
        int k = y % 100, j = y / 100;
        int h = (1 + (13 * (m + 1)) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;
        return (h + 6) % 7; // 0=Sun
    }

    public static void printCalendar(int m, int y) {
        System.out.println("\n   " + getMonthName(m) + " " + y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int start = firstDay(m, y), days = daysInMonth(m, y);
        for (int i = 0; i < start; i++)
            System.out.print("    ");
        for (int d = 1; d <= days; d++) {
            System.out.printf("%3d ", d);
            if ((d + start) % 7 == 0)
                System.out.println();
        }
        System.out.println();
    }

    // ---------- 10. Collinear ----------
    public static boolean collinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    }

    public static boolean collinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return area == 0;
    }

    // ---------- Main ----------
    public static void main(String[] args) {
        footballHeights();

        int num = 153;
        int[] arr = digitsArray(num);
        System.out.println("Duck? " + isDuck(arr));
        System.out.println("Armstrong? " + isArmstrong(arr));
        largestTwo(arr);
        smallestTwo(arr);
        System.out.println("Harshad? " + isHarshad(num, arr));
        digitFrequency(arr);
        System.out.println("Palindrome? " + isPalindrome(arr));
        System.out.println("Prime? " + isPrime(num));
        System.out.println("Neon? " + isNeon(num));
        System.out.println("Spy? " + isSpy(num));
        System.out.println("Automorphic? " + isAutomorphic(num));
        System.out.println("Buzz? " + isBuzz(num));
        System.out.println("Perfect? " + isPerfect(num));
        System.out.println("Abundant? " + isAbundant(num));
        System.out.println("Deficient? " + isDeficient(num));
        System.out.println("Strong? " + isStrong(num));

        int[] fac = factors(12);
        System.out.println("Factors of 12: " + Arrays.toString(fac));
        System.out.println("Greatest Factor: " + maxFactor(fac));
        System.out.println("Sum: " + sumFactors(fac));
        System.out.println("Product: " + productFactors(fac));
        System.out.println("Cube Product: " + cubeProductFactors(fac));

        System.out.println("Unique OTPs? " + validateUniqueOTPs());
        printCalendar(7, 2005);
        System.out.println("Collinear? slope=" + collinearSlope(2, 4, 4, 6, 6, 8)
                + " area=" + collinearArea(2, 4, 4, 6, 6, 8));
    }
}
