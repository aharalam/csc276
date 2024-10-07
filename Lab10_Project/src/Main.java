/*
Objective:
Write a Java program to estimate the value of Pi (π) using random numbers and the Monte Carlo method.

Description:
Imagine a circle with a radius of 1 unit, inscribed inside a square with side lengths of 2 units. The area of the circle is π * r² = π
(since the radius r = 1), and the area of the square is 4 (since the side length is 2). The ratio of the area of the circle to the area
of the square is π/4.

You can estimate π by randomly generating points inside the square and checking how many of them fall inside the circle.
The ratio of the points inside the circle to the total points generated should approximate the ratio of the areas, π/4. Hence,
multiplying this ratio by 4 gives an estimate for π.

Instructions:
1. Write a Java program that:
2. Generates random points (x, y) within the square of side length 2 (with the center at the origin: (0,1)). You can work with
the quarter of the circle.
3. Checks if the point lies inside the circle (i.e., x² + y² ≤ 1).
4. Counts how many points fall inside the circle.
5. Uses the formula: π ≈ (pointsinsidecircle / totalpoints) × 4.
6. Allow the user to input the number of random points to be generated.
7. Print the estimated value of Pi after all the points have been generated.
 */

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variable to store the number of points inside of the circle
        int pointsInsideCircle = 0;

        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Create a Random object
        Random gen = new Random();

        // Ask the user for the number of points to generate
        System.out.print("Enter the number of random points to generate: " );
        int numberOfRandomPoints = scanner.nextInt();

        // Generate random points and check to see if they are inside of the circle
        for (int i = 0; i < numberOfRandomPoints; i++) {
            // Generate random (x, y) coordinates between 0 and 1
            // You can use Math.random() or a Random object to calculate the points that have an x and y between 0 and 1.
            //double x = Math.random();
            //double y = Math.random();
            double x = gen.nextDouble(1);
            double y = gen.nextDouble(1);

            System.out.println("x" + (i+1) + ": " + x + "\ny" + (i+1) + ": " + y + "\n");

            // Check if the point is inside of the circle (x^2 + y^2 <= 1)
            if ((Math.pow(x, 2) + Math.pow(y, 2)) <= 1) {
                pointsInsideCircle++;
            }
        }

        // Calculate the estimated value of Pi by using the given formula
        double piEstimate = (double) pointsInsideCircle / numberOfRandomPoints * 4;

        // Print the estimated value of Pi
        System.out.println("Estimated value of Pi: " + piEstimate);

        // Close the Scanner object
        scanner.close();
    }
}