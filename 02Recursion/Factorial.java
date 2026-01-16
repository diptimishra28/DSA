/*
Given an integer n, return the factorial of n.Factorial of a non-negative integer, is the 
multiplication of all integers smaller than or equal to n (use 64-bits to return answer).

Example 1
Input : n = 3
Output : 6
Explanation : Factorial = 1 * 2 * 3 => 6

Example 2
Input : n = 5
Output : 120
Explanation : Factorial = 1 * 2 * 3 * 4 * 5 => 120
 */

import java.util.Scanner;

class Factorial {

    public static int factorialOfNum(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        else 
        return n * factorialOfNum(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int ans = factorialOfNum(n);
        System.out.println(ans);
    }
}