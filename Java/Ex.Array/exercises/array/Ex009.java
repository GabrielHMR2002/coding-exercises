
/*Create a program to read an integer N and then an array of N real numbers. Next, display on the screen the arithmetic mean of all elements with three decimal places. After that, display all elements of the array that are below the mean, with one decimal place each. */

package exercises.array;

import java.util.Locale;
import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers are you going to type? ");
        int number = sc.nextInt();

        double[] vector = new double[number];

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Type a number: ");
            vector[i] = sc.nextDouble();

        }

        double sum = 0;
        for (double vet : vector) {
            sum += vet;
        }

        double avg = (sum / vector.length);

        System.out.println("Average Vector: " + avg);

        System.out.println("Elements under average: ");

        for (double vet : vector) {
            if (vet < avg) {
                System.out.println(vet);
            }
        }

        sc.close();
    }

}
