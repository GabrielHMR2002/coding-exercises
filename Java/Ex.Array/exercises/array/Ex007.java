package exercises.array;

import java.util.Locale;
import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers are you going to type?");

        int number = sc.nextInt();

        double[] vector = new double[number];

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Type a number: ");
            vector[i] = sc.nextDouble();

        }
        double aux = vector[0];
        int position = 0;
        for (int i = 0; i < vector.length; i++) {
            if (aux < vector[i]) {
                aux = vector[i];
                position = i;
            }

        }

        System.out.println("Largest number: " + aux);
        System.out.println("Position: " + position);

        sc.close();
        ;
    }
}
