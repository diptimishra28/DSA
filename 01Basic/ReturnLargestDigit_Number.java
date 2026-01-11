/*
You are given an integer n. Return the largest digit present in the number.

Example 1
Input: n = 25
Output: 5
Explanation: The largest digit in 25 is 5.

Example 2
Input: n = 99
Output: 9
Explanation: The largest digit in 99 is 9.
 */

import java.util.Scanner;

class ReturnLargestDigit_Number {

    public int largestDigit(int n) {
        int largestDigit = 0;

        while (n > 0) {
            int digit = n % 10;
            n = n / 10;

            if (largestDigit < digit) {
                largestDigit = digit;
            }
        }
        return largestDigit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        ReturnLargestDigit_Number obj = new ReturnLargestDigit_Number();
        int result = obj.largestDigit(n);

        System.out.println("Largest digit: " + result);
    }
}
