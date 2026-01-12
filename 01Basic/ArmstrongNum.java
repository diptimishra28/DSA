/*
You are given an integer n. You need to check whether it is an armstrong number or not. 
Return true if it is an armstrong number, otherwise return false.
An armstrong number is a number which is equal to the sum of the digits of the number, 
raised to the power of the number of digits.

Example 1
Input: n = 153
Output: true
Explanation: Number of digits : 3.
13 + 53 + 33 = 1 + 125 + 27 = 153.
Therefore, it is an Armstrong number.

Example 2
Input: n = 12
Output: false
Explanation: Number of digits : 2.
12 + 22 = 1 + 4 = 5.
Therefore, it is not an Armstrong number.
 */

import java.util.Scanner;

class ArmstrongNum {

    public static boolean isArmstrong(int n) {
        int sum = 0;
        int original = n;

        int temp = n;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, count);
            n /= 10;
        }

        return original == sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("write any Number:- ");
        int n = sc.nextInt();

        if (isArmstrong(n))
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }
}
