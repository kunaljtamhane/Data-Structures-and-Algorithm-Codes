import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the position of the Fibonacci number to find: ");
        int n = in.nextInt();

        // Edge cases
        if (n == 0) {
            System.out.println("The 0th Fibonacci number is 0.");
            return;
        } else if (n == 1) {
            System.out.println("The 1st Fibonacci number is 1.");
            return;
        }

        int p = 0;
        int i = 1;
        int count = 2;

        while (count <= n) {
            int temp = i;
            i = i + p;
            p = temp;
            count++;
        }

        System.out.println("The " + n + "th Fibonacci number is " + i);
    }
}
