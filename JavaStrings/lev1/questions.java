//package lev1;

import java.util.*;

public class questions {

    // 1. Compare two strings using charAt()
    public static boolean compareStringsCharAt(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }
        return true;
    }

    // 2. Substring using charAt()
    public static String substringCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // 3. Convert String to char array manually
    public static char[] toCharArrayManual(String text) {
        char[] arr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    }

    // Compare two char arrays
    public static boolean compareCharArrays(char[] a1, char[] a2) {
        if (a1.length != a2.length)
            return false;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i])
                return false;
        }
        return true;
    }

    // 4. Demonstrate NullPointerException
    public static void generateNPE() {
        String text = null;
        System.out.println(text.length()); // Will throw NPE
    }

    public static void handleNPE() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException: " + e);
        }
    }

    // 5. Demonstrate StringIndexOutOfBoundsException
    public static void generateSIOOBE(String s) {
        System.out.println(s.charAt(s.length())); // Invalid index
    }

    public static void handleSIOOBE(String s) {
        try {
            System.out.println(s.charAt(s.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled StringIndexOutOfBoundsException: " + e);
        }
    }

    // 6. Demonstrate IllegalArgumentException
    public static void generateIAE(String s) {
        System.out.println(s.substring(5, 2)); // invalid start > end
    }

    public static void handleIAE(String s) {
        try {
            System.out.println(s.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Handled IllegalArgumentException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Handled RuntimeException: " + e);
        }
    }

    // 7. Demonstrate NumberFormatException
    public static void generateNFE(String s) {
        int num = Integer.parseInt(s); // will fail if s is not numeric
        System.out.println(num);
    }

    // 8. Demonstrate ArrayIndexOutOfBoundsException
    public static void generateAIOOBE(String[] arr) {
        System.out.println(arr[arr.length]); // invalid index
    }

    public static void handleAIOOBE(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled ArrayIndexOutOfBoundsException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Handled RuntimeException: " + e);
        }
    }

    // 9. Convert text to uppercase manually
    public static String toUpperCaseManual(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                result += (char) (c - 32);
            } else {
                result += c;
            }
        }
        return result;
    }

    // 10. Convert text to lowercase manually
    public static String toLowerCaseManual(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                result += (char) (c + 32);
            } else {
                result += c;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Compare two strings
        System.out.print("Enter first string: ");
        String s1 = sc.next();
        System.out.print("Enter second string: ");
        String s2 = sc.next();
        System.out.println("Manual compare: " + compareStringsCharAt(s1, s2));
        System.out.println("equals() compare: " + s1.equals(s2));

        // 2. Substring
        System.out.print("Enter text: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        String sub1 = substringCharAt(text, start, end);
        String sub2 = text.substring(start, end);
        System.out.println("Manual substring: " + sub1);
        System.out.println("Built-in substring: " + sub2);
        System.out.println("Are they equal? " + compareStringsCharAt(sub1, sub2));

        // 3. toCharArray
        System.out.print("Enter text for toCharArray: ");
        String arrText = sc.next();
        char[] manualArr = toCharArrayManual(arrText);
        char[] builtinArr = arrText.toCharArray();
        System.out.println("Manual array == Builtin? " + compareCharArrays(manualArr, builtinArr));

        // 4. NullPointerException
        // generateNPE(); // will crash
        handleNPE();

        // 5. StringIndexOutOfBoundsException
        // generateSIOOBE("hello"); // crash
        handleSIOOBE("hello");

        // 6. IllegalArgumentException
        // generateIAE("abcdef");
        handleIAE("abcdef");

        // 7. NumberFormatException
        try {
            generateNFE("abc"); // invalid
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException: " + e);
        }

        // 8. ArrayIndexOutOfBoundsException
        String[] names = { "A", "B", "C" };
        // generateAIOOBE(names);
        handleAIOOBE(names);

        // 9. To UpperCase
        System.out.print("Enter text for uppercase conversion: ");
        sc.nextLine(); // clear buffer
        String upText = sc.nextLine();
        String manualUp = toUpperCaseManual(upText);
        String builtinUp = upText.toUpperCase();
        System.out.println("Manual uppercase: " + manualUp);
        System.out.println("Built-in uppercase: " + builtinUp);
        System.out.println("Are they equal? " + compareStringsCharAt(manualUp, builtinUp));

        // 10. To LowerCase
        System.out.print("Enter text for lowercase conversion: ");
        String lowText = sc.nextLine();
        String manualLow = toLowerCaseManual(lowText);
        String builtinLow = lowText.toLowerCase();
        System.out.println("Manual lowercase: " + manualLow);
        System.out.println("Built-in lowercase: " + builtinLow);
        System.out.println("Are they equal? " + compareStringsCharAt(manualLow, builtinLow));
    }
}
