package src.DSA_Arrays;

import java.util.Scanner;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;

        int maxWater = 0;

        while (left < right) {

            // Calculate width
            int width = right - left;

            // Water height is decided by the shorter line
            int h = Math.min(height[left], height[right]);

            // Calculate current area
            int area = width * h;

            // Update maximum area
            maxWater = Math.max(maxWater, area);

            // Move the pointer having smaller height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] height = new int[n];

        System.out.println("Enter heights:");

        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        int result = maxArea(height);

        System.out.println("Maximum water = " + result);

        sc.close();
    }
}