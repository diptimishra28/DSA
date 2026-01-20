import java.util.Scanner;

public class PowerOfThree {

    public static boolean isPowerOfThree(int n) {
        
        if(n <= 0) {
            return false;
        }
        //base case
        if(n == 1) {
            return true;
        }
        if(n % 3 != 0) {
            return false;
        }

        return isPowerOfThree(n / 3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        if(isPowerOfThree(n)) {
            System.out.println("It is a power of three");
        }

        else {
            System.out.println("Not a power of three");
        }
    }
}