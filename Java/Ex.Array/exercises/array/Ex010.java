/*Create a program to read an array of N integers. Then, display on the screen the arithmetic mean only of the even numbers read, with one decimal place. If no even number is entered, display the message "NO EVEN NUMBERS." */

package exercises.array;

import java.util.Locale;
import java.util.Scanner;

public class Ex010 {

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
        int count = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                sum += vector[i];
                count++;
            }
        }
        double avg = sum / count;
        if (sum == 0) {
            avg = 0;
        }

        if (avg != 0) {
            System.out.println("Average: " + avg);
        } else {
            System.out.println("No even numbers were entered");
        }

        sc.close();
    }

}
