/*
 *
 * Create a program to read an integer N and the height of N people.
  Store the N heights in an array. Then, display the average height of
these people.
 */

 package exercises.array;

import java.util.Locale;
import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
         Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many heights are you going to type? ");
        int number = sc.nextInt();
        double[] vect = new double[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Type a height: ");
            vect[i] = sc.nextDouble();
        }

        double height = 0;

        for (int i = 0; i < vect.length; i++) {

            height = height + vect[i];

        }

        System.out.println("Average height: " + height / vect.length);

        sc.close();
    }
}