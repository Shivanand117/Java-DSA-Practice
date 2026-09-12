package src.DSA_Arrays;

import java.util.Scanner;

public class TwoSumTarget {
       public static int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {

            int sum = numbers[left] + numbers[right];

            if (sum == target) {

                // +1 because the problem wants 1-indexed positions
                return new int[]{left + 1, right + 1};

            } else if (sum < target) {

                // Sum is too small, move left forward
                left++;

            } else {

                // Sum is too big, move right backward
                right--;
            }
        }

        return new int[]{};
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter sorted array elements:");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int[] result = twoSum(numbers, target);

        System.out.println("Indices are:");

        for (int index : result) {
            System.out.print(index + " ");
        }

        sc.close();
    }
}
