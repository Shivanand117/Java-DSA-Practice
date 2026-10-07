package src.DSA_Arrays;

import java.util.Scanner;

public class RobotMovement {

    public static int robotMovement(String instructions) {

        // Starting position of robot
        int x = 0;
        int y = 0;

        // Counts how many times robot returns to (0,0)
        int count = 0;

        // Robot has not started initially
        boolean started = false;

        // Robot has not moved initially
        boolean moved = false;

        // Read every character one by one
        for (int i = 0; i < instructions.length(); i++) {

            char c = Character.toUpperCase(instructions.charAt(i));

            // A = Start the robot
            if (c == 'A') {
                started = true;
                continue;
            }

            // Ignore characters before A
            if (!started) {
                continue;
            }

            // B = Stop the robot
            if (c == 'B') {
                break;
            }

            // North
            if (c == 'N') {
                y++;
                moved = true;
            }

            // South
            else if (c == 'S') {
                y--;
                moved = true;
            }

            // East
            else if (c == 'E') {
                x++;
                moved = true;
            }

            // West
            else if (c == 'W') {
                x--;
                moved = true;
            }

            // Check whether robot returned to starting point
            if (moved && x == 0 && y == 0) {
                count++;
            }
        }

        // If robot never moved
        if (!moved) {
            return -1;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter instructions: ");
        String instructions = sc.nextLine();

        int result = robotMovement(instructions);

        System.out.println("Result: " + result);

        sc.close();
    }
}