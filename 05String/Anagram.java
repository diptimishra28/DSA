/*
    Q 242
Given two strings s and t, return true if t is an anagram of s, and false otherwise.


Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false

Constraints:
1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 */

import java.util.*;

class Anagram {

    public static boolean isAnagram(String s, String t) {

        // Step 1: clean strings
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        t = t.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Step 2: length check (important)
        if (s.length() != t.length()) {
            return false;
        }

        // Step 3: convert to char array
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        // Step 4: sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Step 5: compare characters
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        if (isAnagram(s, t)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
