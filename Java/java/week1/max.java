public class max {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 4};
        int max = 0 ;// Initialize max to the first element

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if current element is greater
            }
        }

        System.out.println("The maximum value in the array is: " + max);
    }
}
