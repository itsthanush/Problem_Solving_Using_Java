public class assecs {
    public static void main(String[] args) {
    // Example: access and print element at a given index in an array
        int[] arr = {10, 20, 30, 40, 50};
        int index = 2; // default index
        if (args.length > 0) {// Check if an argument is provided
            try {
                index = Integer.parseInt(args[0]);//
            } catch (NumberFormatException e) {
                System.out.println("\nProvided argument is not a valid integer. Using default index 2.");
            }
        }

        System.out.println();
        if (index >= 0 && index < arr.length) {
            System.out.println("Element at index " + index + " is: " + arr[index]);
        } else {
            System.out.println("Index out of bounds. Valid range: 0 to " + (arr.length - 1));
        }
    }
}

