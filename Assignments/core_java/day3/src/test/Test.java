package test;

import java.util.*;
import day3.Points2D;

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of points array: ");
        int size = sc.nextInt();
        Points2D[] points = new Points2D[size];

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Plot a point");
            System.out.println("2. Display all points");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Enter array index (0 to " + (size - 1) + "): ");
                    int idx = sc.nextInt();

                    //Boundary check
                    if (idx < 0 || idx >= size) {
                        System.out.println("❌ Error: Invalid index!");
                        break;
                    }

                    // Already occupied check
                    if (points[idx] != null) {
                        System.out.println("❌ Error: Point already exists at index " + idx);
                        break;
                    }

                    // Input x and y
                    System.out.print("Enter x and y: ");
                    int x = sc.nextInt();
                    int y = sc.nextInt();

                    points[idx] = new Points2D(x, y);
                    System.out.println("✅ Point plotted at index " + idx);
                    break;
                }

                case 2: {
                    System.out.println("\n--- Plotted Points ---");
                    int count = 0;
                    for (Points2D p : points) {
                        if (p != null) {
                            System.out.println(p.Show());
                            count++;
                        }
                    }
                    if (count == 0) {
                        System.out.println("No points plotted yet.");
                    }
                    break;
                }

                case 0:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("❌ Invalid choice! Try again.");
            }
        }
    }
}
