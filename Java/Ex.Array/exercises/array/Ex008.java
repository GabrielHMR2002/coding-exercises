/*Create a program to read two arrays A and B, each containing N elements. Then, generate a third array C where each element of C is the sum of the corresponding elements from A and B. Print the generated array C. */
package exercises.array;

import java.util.Locale;
import java.util.Scanner;

public class Ex008 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a size to the vectors: ");
        int number = sc.nextInt();

        double[] vectorOne = new double[number];
        double[] vectorTwo = new double[number];
        double[] vectorThree = new double[number];

        System.out.println("Type numbers to the first vector: ");

        for (int i = 0; i < vectorOne.length; i++) {
            System.out.println("Type a number: ");
            vectorOne[i] = sc.nextDouble();
        }

        System.out.println("Type numbers to the second vector: ");
        for (int i = 0; i < vectorTwo.length; i++) {
            System.out.println("Type a number: ");
            vectorTwo[i] = sc.nextDouble();

        }

        for (int i = 0; i < vectorOne.length; i++) {
            vectorThree[i] = vectorOne[i] + vectorTwo[i];
        }

        System.out.println("Vector: ");
        for (int i = 0; i < vectorThree.length; i++) {
            System.out.print("  " + vectorThree[i]);
        }
        sc.close();
    }
}
