/*Create a program that reads N integers and stores them in an array. Then, display on the screen all the even numbers, along with the count of even numbers. */
package exercises.array;

import java.util.Locale;
import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers are you going to type: ");

        int number = sc.nextInt();

        double[] vector = new double[number];

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Type a number: ");
            vector[i] = sc.nextDouble();
        }

        System.out.println("All even numbers typed: ");
        int count = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                System.out.print("  " + vector[i]);
                count++;
            }
        }
        System.out.println("\nCount: " + count);

        sc.close();
        ;

    }

}
