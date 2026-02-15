
public class palindrome {
    public static void main(String[] args) {
        int n = 12321; // Example number to check for palindrome
        int original = n; // Store the original number
        int reversed = 0; // Variable to store the reversed number

        while (n > 0) {
            int digit = n % 10; // Extract the last digit
            reversed = reversed * 10 + digit; // Add the digit to the reversed number
            n /= 10; // Remove the last digit from the original number
        }

        if (original == reversed) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome."); 
        }
    }
}
