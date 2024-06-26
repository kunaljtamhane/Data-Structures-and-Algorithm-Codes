public class ReverseInteger {
    public static void main(String[] args) {
        int num = 28479;
        int ans = 0;

        while (num > 0) {
            int rem = num % 10; // Get the last digit
            ans = ans * 10 + rem; // Append the digit to the reversed number
            num = num / 10; // Remove the last digit from the original number
        }

        System.out.println(ans); // Print the reversed number
    }
}
