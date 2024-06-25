// Input 3 numbers from the user and check which one is the largest out of the three

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        System.out.println("Enter 3 Numbers: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int max = a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        System.out.println("The Largest Number is: " +max);
    }
}
