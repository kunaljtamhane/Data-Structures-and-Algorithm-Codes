import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Enter a fruit Name: ");
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        switch (fruit) {
            case "Mango":
                System.out.println("Maharashtra");
            break;
            case "Apple":
                System.out.println("Jammu and Kashmir");
            break;
            case "Orange":
                System.out.println("Nagpur");
            break;
            case "Grapes":
                System.out.println("Nashik");
            break;
            default:
                System.out.println("Enter Valid Fruit");


        }

    }
}
