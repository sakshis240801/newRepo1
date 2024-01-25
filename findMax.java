package creatingGitRepo1;

public class findMax {
    public static void main(String[] args) {
        // Sample array
        int[] numbers = {5, 2, 8, 12, 3, 7, 1, 9};

        // Call the method to find the max number
        int maxNumber = findMaxNumber(numbers);

        // Print the result
        System.out.println("The maximum number is: " + maxNumber);
    }

    // Function to find the maximum number in an array
    public static int findMaxNumber(int[] arr) {
        // Check if the array is empty
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        // Initialize maxNumber with the first element of the array
        int maxNumber = arr[0];

        // Iterate through the array to find the maximum number
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxNumber) {
                maxNumber = arr[i];
            }
        }

        // Return the maximum number
        return maxNumber;
    }
}