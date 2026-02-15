public class Task5_count_digit {
    public static void main(String[] args) {
        int number = 12345;
        int count = countDigits(number);
        System.out.println("Number of digits in " + number + " is: " + count);
    }

    public static int countDigits(int num) {
        if (num == 0) {
            return 1; // Special case for 0
        }
        
        int count = 0;
        while (num != 0) {
            num /= 10; // Remove the last digit
            count++; // Increment the count
        }
    
        return count;
    }
    
}