
package src.DSA_Arrays;

import java.util.Scanner;

public class SecondLargest {

    public static int findSecondLargest(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        boolean foundSecond = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                second = largest;
                foundSecond = (largest != Integer.MIN_VALUE);
                largest = arr[i];

            } else if (arr[i] < largest &&
                       (!foundSecond || arr[i] > second)) {
                second = arr[i];
                foundSecond = true;
            }
        }

        if (foundSecond) {
            return second;
        }

        return 0; // Used only when no second largest exists
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid array size");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = findSecondLargest(arr);

        if (result == 0 && allEqual(arr)) {
            System.out.println("No second largest element");
        } else {
            System.out.println("Second largest = " + result);
        }

        sc.close();
    }

    public static boolean allEqual(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[0]) {
                return false;
            }
        }
        return true;
    }
}