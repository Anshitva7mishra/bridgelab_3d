//package lev2;

import java.util.*;

public class question {

    // 1. Find length of string without using length()
    public static int stringLength(String s) {
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

    // 2. Split text into words manually
    public static String[] splitWords(String text) {
        ArrayList<String> words = new ArrayList<>();
        String word = "";
        for (int i = 0; i < stringLength(text); i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                if (!word.equals("")) {
                    words.add(word);
                    word = "";
                }
            } else {
                word += c;
            }
        }
        if (!word.equals(""))
            words.add(word);
        return words.toArray(new String[0]);
    }

    // Compare two String arrays
    public static boolean compareArrays(String[] a1, String[] a2) {
        if (a1.length != a2.length)
            return false;
        for (int i = 0; i < a1.length; i++) {
            if (!a1[i].equals(a2[i]))
                return false;
        }
        return true;
    }

    // 3. Split text and return word + length
    public static String[][] wordsWithLength(String text) {
        String[] words = splitWords(text);
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(stringLength(words[i]));
        }
        return result;
    }

    // 4. Find shortest and longest word
    public static String[] shortestAndLongest(String[][] wordLenArr) {
        String shortest = wordLenArr[0][0];
        String longest = wordLenArr[0][0];
        int min = Integer.parseInt(wordLenArr[0][1]);
        int max = Integer.parseInt(wordLenArr[0][1]);

        for (String[] wl : wordLenArr) {
            int len = Integer.parseInt(wl[1]);
            if (len < min) {
                min = len;
                shortest = wl[0];
            }
            if (len > max) {
                max = len;
                longest = wl[0];
            }
        }
        return new String[] { shortest, longest };
    }

    // 5. Check if vowel/consonant
    public static String checkCharType(char c) {
        if (c >= 'A' && c <= 'Z')
            c = (char) (c + 32); // to lowercase
        if (c >= 'a' && c <= 'z') {
            if ("aeiou".indexOf(c) != -1)
                return "Vowel";
            else
                return "Consonant";
        }
        return "Not a Letter";
    }

    // Count vowels and consonants
    public static int[] countVowelsAndConsonants(String text) {
        int v = 0, c = 0;
        for (int i = 0; i < stringLength(text); i++) {
            String type = checkCharType(text.charAt(i));
            if (type.equals("Vowel"))
                v++;
            else if (type.equals("Consonant"))
                c++;
        }
        return new int[] { v, c };
    }

    // 6. Trim leading and trailing spaces manually
    public static String trimSpaces(String text) {
        int start = 0, end = stringLength(text) - 1;

        while (start <= end && text.charAt(start) == ' ')
            start++;
        while (end >= start && text.charAt(end) == ' ')
            end--;

        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // 7. Voting eligibility
    public static int[] randomAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10; // 2-digit
        }
        return ages;
    }

    public static String[][] canVote(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] >= 18)
                result[i][1] = "true";
            else
                result[i][1] = "false";
        }
        return result;
    }

    public static void display2D(String[][] arr) {
        System.out.println("Value\tStatus");
        for (String[] row : arr) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    // 8. Rock-Paper-Scissors game
    public static String playRPS(String player, String computer) {
        if (player.equals(computer))
            return "Draw";
        if (player.equals("rock") && computer.equals("scissors") ||
                player.equals("paper") && computer.equals("rock") ||
                player.equals("scissors") && computer.equals("paper"))
            return "Player";
        return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. String length
        System.out.print("Enter a string: ");
        String s = sc.next();
        System.out.println("Manual length: " + stringLength(s));
        System.out.println("Built-in length: " + s.length());

        // 2. Split words
        sc.nextLine();
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        String[] manualWords = splitWords(sentence);
        String[] builtinWords = sentence.split(" ");
        System.out.println("Manual split == Built-in? " + compareArrays(manualWords, builtinWords));

        // 3. Words with lengths
        String[][] wordLenArr = wordsWithLength(sentence);
        System.out.println("Words with length:");
        for (String[] wl : wordLenArr) {
            System.out.println(wl[0] + " - " + wl[1]);
        }

        // 4. Shortest and longest word
        String[] sl = shortestAndLongest(wordLenArr);
        System.out.println("Shortest: " + sl[0]);
        System.out.println("Longest: " + sl[1]);

        // 5. Vowels and consonants
        int[] counts = countVowelsAndConsonants(sentence);
        System.out.println("Vowels: " + counts[0] + ", Consonants: " + counts[1]);

        // 6. Trim spaces
        System.out.print("Enter text with spaces: ");
        String spaced = sc.nextLine();
        String manualTrim = trimSpaces(spaced);
        String builtinTrim = spaced.trim();
        System.out.println("Manual trim: " + manualTrim);
        System.out.println("Built-in trim: " + builtinTrim);

        // 7. Voting eligibility
        int[] ages = randomAges(10);
        String[][] eligibility = canVote(ages);
        display2D(eligibility);

        // 8. Rock-Paper-Scissors
        String[] choices = { "rock", "paper", "scissors" };
        Random rand = new Random();
        int playerWins = 0, compWins = 0, games = 5;
        for (int i = 0; i < games; i++) {
            String player = choices[rand.nextInt(3)];
            String comp = choices[rand.nextInt(3)];
            String result = playRPS(player, comp);
            System.out.println("Game " + (i + 1) + ": Player=" + player + ", Computer=" + comp + " => " + result);
            if (result.equals("Player"))
                playerWins++;
            else if (result.equals("Computer"))
                compWins++;
        }
        System.out.println("Final Stats: Player=" + playerWins + ", Computer=" + compWins);
        double playerPerc = (playerWins * 100.0) / games;
        double compPerc = (compWins * 100.0) / games;
        System.out.println("Winning % => Player: " + playerPerc + ", Computer: " + compPerc);
    }
}
