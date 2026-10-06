package src.DSA_Arrays;

import java.util.Scanner;

public class KadaneAlgorithm {

    public static int maxSubArray(int[] arr) {

        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            // Either start a new subarray
            // or continue the previous subarray
            currentSum = Math.max(arr[i], currentSum + arr[i]);

            // Update maximum sum
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = maxSubArray(arr);

        System.out.println("Maximum Subarray Sum = " + result);

        sc.close();
    }
}