public class Task8_NthEle {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int n = 10; // Change this value to get the nth element
        if (n > 0 && n <= arr.length) {
            System.out.println("The " + n + "rd element is: " + arr[n - 1]);
        } else {
            System.out.println("Invalid input. Please enter a value between 1 and " + arr.length);
        }   
    }
}
