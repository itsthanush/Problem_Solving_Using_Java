public class factorial {
    public static void main(String[] args) {
        int n = 5; // Example number to calculate factorial
        if(n<=0) {
            System.out.println("Please enter a positive number");
        } else {
            long result = calculateFactorial(n);
            System.out.println("Factorial of " + n + " is: " + result);
        }
    }
    
    public static long calculateFactorial(int n) {
        long factorial = 1;
        for(int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}