package src.DSA_Arrays;

import java.util.Scanner;

public class MajorityElement {

    public static int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (count == 0) {
                candidate = nums[i];
            }

            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = majorityElement(nums);

        System.out.println("Majority Element = " + result);

        sc.close();
    }
}