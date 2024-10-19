public class KadaneAlgorithm {

    // Function to find the maximum sum of a contiguous subarray
    public static int maxSubArraySum(int[] arr) {
        // Initialize maxSum to the lowest possible value
        int maxSum = Integer.MIN_VALUE;
        // Initialize currentSum to 0
        int currentSum = 0;

        // Loop through the array
        for (int i = 0; i < arr.length; i++) {
            // Add the current element to currentSum
            currentSum += arr[i];

            // Update maxSum if currentSum is greater than maxSum
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            // If currentSum becomes negative, reset it to 0
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        // Example usage
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = maxSubArraySum(arr);
        System.out.println("Maximum contiguous sum is: " + maxSum);
    }
}
