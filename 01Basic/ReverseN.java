/*
You are given an integer n. Return the integer formed by placing the digits of n in reverse order.

Example 1
Input: n = 25
Output: 52
Explanation: Reverse of 25 is 52.

Example 2
Input: n = 123
Output: 321
Explanation: Reverse of 123 is 321.
 */

import java.util.Scanner;

public class ReverseN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed number: " + reverse);
    }
}
