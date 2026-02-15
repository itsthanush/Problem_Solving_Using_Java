public class Task6_palindrome_string {
    public static boolean isPalindrome(String str) {
        // Convert to lowercase to ensure case-insensitive comparison
        String cleanStr = str.toLowerCase();
        
        // Create a StringBuilder object with the cleaned string
        StringBuilder sb = new StringBuilder(cleanStr);
        
        // Reverse the StringBuilder and convert back to a String
        String reversedStr = sb.reverse().toString();
        
        // Compare the original and reversed strings
        return cleanStr.equals(reversedStr);
    }

    public static void main(String[] args) {
        String testString = "Madam";
        if (isPalindrome(testString)) {
            System.out.println("\"" + testString + "\" is a palindrome.");
        } else {
            System.out.println("\"" + testString + "\" is not a palindrome.");
        }
    }
}
