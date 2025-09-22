import java.util.*;

public class Level3Programs {

    // ------------------- 1. BMI Calculation -------------------
    static class BMICalc {
        public static String[][] computeBMI(double[][] arr) {
            String[][] res = new String[arr.length][4];
            for (int i = 0; i < arr.length; i++) {
                double weight = arr[i][0];
                double heightM = arr[i][1] / 100.0;
                double bmi = weight / (heightM * heightM);
                String status = (bmi < 18.5) ? "Underweight"
                        : (bmi < 24.9) ? "Normal" : (bmi < 29.9) ? "Overweight" : "Obese";
                res[i][0] = String.valueOf(weight);
                res[i][1] = String.valueOf(arr[i][1]);
                res[i][2] = String.format("%.2f", bmi);
                res[i][3] = status;
            }
            return res;
        }

        public static void display(String[][] arr) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight", "Height", "BMI", "Status");
            for (String[] row : arr) {
                System.out.printf("%-10s %-10s %-10s %-15s%n", row[0], row[1], row[2], row[3]);
            }
        }

        public static void run(Scanner sc) {
            double[][] data = new double[10][2];
            for (int i = 0; i < 10; i++) {
                System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
                data[i][0] = sc.nextDouble();
                System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
                data[i][1] = sc.nextDouble();
            }
            String[][] result = computeBMI(data);
            display(result);
        }
    }

    // ------------------- 2. Unique Characters -------------------
    static class UniqueChars {
        public static int getLength(String s) {
            int count = 0;
            try {
                while (true) {
                    s.charAt(count);
                    count++;
                }
            } catch (Exception e) {
                return count;
            }
        }

        public static char[] findUnique(String s, int len) {
            char[] res = new char[len];
            int index = 0;
            for (int i = 0; i < len; i++) {
                char c = s.charAt(i);
                boolean found = false;
                for (int j = 0; j < index; j++) {
                    if (res[j] == c) {
                        found = true;
                        break;
                    }
                }
                if (!found)
                    res[index++] = c;
            }
            return res;
        }

        public static void run(Scanner sc) {
            System.out.print("Enter text: ");
            String text = sc.nextLine();
            int len = getLength(text);
            char[] uniques = findUnique(text, len);
            System.out.print("Unique characters: ");
            for (char c : uniques) {
                if (c != '\0')
                    System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    // ------------------- 3. First Non-Repeating Character -------------------
    static class FirstNonRepeating {
        public static char find(String s) {
            int[] freq = new int[256];
            for (int i = 0; i < s.length(); i++)
                freq[s.charAt(i)]++;
            for (int i = 0; i < s.length(); i++) {
                if (freq[s.charAt(i)] == 1)
                    return s.charAt(i);
            }
            return '\0';
        }

        public static void run(Scanner sc) {
            System.out.print("Enter string: ");
            String text = sc.nextLine();
            char ans = find(text);
            if (ans == '\0')
                System.out.println("No non-repeating character.");
            else
                System.out.println("First non-repeating: " + ans);
        }
    }

    // ------------------- 4. Character Frequency -------------------
    static class CharFrequency {
        public static void run(Scanner sc) {
            System.out.print("Enter string: ");
            String s = sc.nextLine();
            int[] freq = new int[256];

            for (int i = 0; i < s.length(); i++)
                freq[s.charAt(i)]++;

            System.out.println("Character frequencies:");
            for (int i = 0; i < 256; i++) {
                if (freq[i] > 0) {
                    System.out.println((char) i + " -> " + freq[i]);
                }
            }
        }
    }

    // ------------------- 5. Palindrome Check -------------------
    static class Palindrome {
        public static boolean logic1(String s) {
            int start = 0, end = s.length() - 1;
            while (start < end) {
                if (s.charAt(start++) != s.charAt(end--))
                    return false;
            }
            return true;
        }

        public static boolean logic2(String s, int start, int end) {
            if (start >= end)
                return true;
            if (s.charAt(start) != s.charAt(end))
                return false;
            return logic2(s, start + 1, end - 1);
        }

        public static boolean logic3(String s) {
            char[] orig = s.toCharArray();
            char[] rev = new char[orig.length];
            for (int i = 0; i < orig.length; i++) {
                rev[i] = orig[orig.length - 1 - i];
            }
            return Arrays.equals(orig, rev);
        }

        public static void run(Scanner sc) {
            System.out.print("Enter text: ");
            String s = sc.nextLine();
            System.out.println("Logic1: " + logic1(s));
            System.out.println("Logic2: " + logic2(s, 0, s.length() - 1));
            System.out.println("Logic3: " + logic3(s));
        }
    }

    // ------------------- 6. Anagram Check -------------------
    static class Anagram {
        public static boolean check(String s1, String s2) {
            if (s1.length() != s2.length())
                return false;
            int[] freq1 = new int[256];
            int[] freq2 = new int[256];
            for (char c : s1.toCharArray())
                freq1[c]++;
            for (char c : s2.toCharArray())
                freq2[c]++;
            return Arrays.equals(freq1, freq2);
        }

        public static void run(Scanner sc) {
            System.out.print("Enter first string: ");
            String s1 = sc.nextLine();
            System.out.print("Enter second string: ");
            String s2 = sc.nextLine();
            System.out.println("Are Anagrams? " + check(s1, s2));
        }
    }

    // ------------------- 7. Calendar Display -------------------
    static class CalendarDisplay {
        static String[] months = {
                "", "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        static int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        static boolean isLeapYear(int y) {
            return (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
        }

        static int dayOfWeek(int d, int m, int y) {
            int y0 = y - (14 - m) / 12;
            int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
            int m0 = m + 12 * ((14 - m) / 12) - 2;
            return (d + x + 31 * m0 / 12) % 7;
        }

        public static void run(Scanner sc) {
            System.out.print("Enter month (1-12): ");
            int m = sc.nextInt();
            System.out.print("Enter year: ");
            int y = sc.nextInt();

            if (m == 2 && isLeapYear(y))
                days[m] = 29;
            else
                days[m] = (m == 2) ? 28 : days[m];

            System.out.println("   " + months[m] + " " + y);
            System.out.println("Su Mo Tu We Th Fr Sa");

            int d = dayOfWeek(1, m, y);

            for (int i = 0; i < d; i++)
                System.out.print("   ");
            for (int i = 1; i <= days[m]; i++) {
                System.out.printf("%2d ", i);
                if (((i + d) % 7 == 0) || (i == days[m]))
                    System.out.println();
            }
        }
    }

    // ------------------- 8. Deck of Cards -------------------
    static class DeckOfCards {
        static String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        static String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

        public static String[] initDeck() {
            String[] deck = new String[suits.length * ranks.length];
            int idx = 0;
            for (String s : suits) {
                for (String r : ranks) {
                    deck[idx++] = r + " of " + s;
                }
            }
            return deck;
        }

        public static void shuffle(String[] deck) {
            Random rand = new Random();
            for (int i = 0; i < deck.length; i++) {
                int j = i + rand.nextInt(deck.length - i);
                String temp = deck[i];
                deck[i] = deck[j];
                deck[j] = temp;
            }
        }

        public static void distribute(String[] deck, int n, int players) {
            if (n % players != 0) {
                System.out.println("Cards cannot be evenly distributed!");
                return;
            }
            int cardsEach = n / players;
            for (int i = 0; i < players; i++) {
                System.out.println("Player " + (i + 1) + ":");
                for (int j = 0; j < cardsEach; j++) {
                    System.out.println("  " + deck[i * cardsEach + j]);
                }
                System.out.println();
            }
        }

        public static void run(Scanner sc) {
            String[] deck = initDeck();
            shuffle(deck);
            System.out.print("Enter number of cards to distribute: ");
            int n = sc.nextInt();
            System.out.print("Enter number of players: ");
            int p = sc.nextInt();
            distribute(deck, n, p);
        }
    }

    // ------------------- MAIN MENU -------------------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Program:");
        System.out.println("1. BMI of 10 Persons");
        System.out.println("2. Unique Characters in String");
        System.out.println("3. First Non-Repeating Character");
        System.out.println("4. Character Frequency");
        System.out.println("5. Palindrome Check");
        System.out.println("6. Anagram Check");
        System.out.println("7. Calendar Display");
        System.out.println("8. Deck of Cards");
        System.out.print("Enter choice: ");
        int ch = sc.nextInt();
        sc.nextLine(); // consume newline

        switch (ch) {
            case 1 -> BMICalc.run(sc);
            case 2 -> UniqueChars.run(sc);
            case 3 -> FirstNonRepeating.run(sc);
            case 4 -> CharFrequency.run(sc);
            case 5 -> Palindrome.run(sc);
            case 6 -> Anagram.run(sc);
            case 7 -> CalendarDisplay.run(sc);
            case 8 -> DeckOfCards.run(sc);
            default -> System.out.println("Invalid choice");
        }
    }
}
