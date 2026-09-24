package src.DSA_Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    public static char firstNonRepeating(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Count frequency of each character
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Find the first character with frequency 1
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (map.get(ch) == 1) {
                return ch;
            }
        }

        // No non-repeating character
        return '-';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        char result = firstNonRepeating(s);

        if (result == '-') {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("First non-repeating character = " + result);
        }

        sc.close();
    }
}