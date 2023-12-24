
/*
 * Create a program that reads N real numbers and stores them in an array. Then:
- Print all elements of the array.
- Display on the screen the sum and the average of the elements in the array.
 */
package exercises.array;

import java.util.Locale;
import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers are you going to tyoe? ");

        int number = sc.nextInt();

        double[] vector = new double[number];

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Type a number to position " + i);

            vector[i] = sc.nextDouble();

        }
        System.out.print("Vector = ");
        for (int i = 0; i < vector.length; i++) {
            System.out.printf("  %.2f", vector[i]);
        }

        // sum all the numbers:
        double sum = 0;

        for (int i = 0; i < vector.length; i++) {
            sum += vector[i];
        }

        System.out.println("\nSum = " + sum);

        // now the average

        double average = sum / vector.length;
        System.out.println("Average: " + average);
        sc.close();
    }
}