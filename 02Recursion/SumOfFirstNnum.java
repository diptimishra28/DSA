/*
Given an integer N, return the sum of first N natural numbers. 
Try to solve this using recursion.

Example 1
Input : N = 4
Output : 10
Explanation : first four natural numbers are 1, 2, 3, 4.
Sum is 1 + 2 + 3 + 4 => 10.

Example 2
Input : N = 2
Output : 3
Explanation : first two natural numbers are 1, 2.
Sum is 1 + 2 => 3.
 */

import java.util.Scanner;

class SumOfFirstNnum {

    public static int sumOfnum(int n) {
        if(n == 1) {
            return 1;
        }
        else
        return n + sumOfnum(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = sumOfnum(n);

        System.out.println("Sum of first natural numbers: " + sum);
    }
}