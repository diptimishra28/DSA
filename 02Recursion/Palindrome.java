/*       Q 125
A phrase is a palindrome if, after converting all uppercase letters into lowercase 
letters and removing all non-alphanumeric characters, it reads the same forward and backward. 
Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 */

import java.util.*;

class Palindrome {

    public static boolean palindromeCheck(char[] arr, int left, int right) {
        //base case
        if(left >= right) {
            return true;
        }

        //if characters dont match
        if(arr[left] != arr[right]) {
            return false;
        }

        //recursive call
        return palindromeCheck(arr, left + 1, right - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        //removing non alphanumeric characters and convert to lowercase 
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if(Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }
        //convert to string then array
        char [] arr = sb.toString().toCharArray(); 

        //store palindrome true or false
        boolean result = palindromeCheck(arr, 0, arr.length - 1);

        if (result) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }

    }
}