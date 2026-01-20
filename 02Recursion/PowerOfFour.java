import java.util.Scanner;

public class PowerOfFour {

    public static boolean isPowerOfFour(int n) {
        if(n <= 0) {
            return false;
        }

        if(n == 1) {
            return true;
        }
        if(n % 4 != 0) {
            return false;
        }

        return isPowerOfFour(n / 4);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        if(isPowerOfFour(n)) {
            System.out.println("It is a power of Four");
        }
        else {
            System.out.println("Not a power of Four");
        }
    }
}