package src.DSA_Arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        // Sort the array
        Arrays.sort(nums);

        // Fix the first number
        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate values of i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Two pointers
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                // If sum is 0
                if (sum == 0) {

                    result.add(Arrays.asList(
                            nums[i],
                            nums[left],
                            nums[right]
                    ));

                    left++;
                    right--;

                    // Skip duplicate values from left
                    while (left < right &&
                            nums[left] == nums[left - 1]) {

                        left++;
                    }

                    // Skip duplicate values from right
                    while (left < right &&
                            nums[right] == nums[right + 1]) {

                        right--;
                    }

                } else if (sum < 0) {

                    // Need a bigger sum
                    left++;

                } else {

                    // Need a smaller sum
                    right--;
                }
            }
        }

        return result;
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

        List<List<Integer>> result = threeSum(nums);

        System.out.println("Triplets whose sum is 0:");

        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }

        sc.close();
    }
}