/*
 * Create a program that reads a positive integer N (maximum = 10) and then reads N integers, storing them in an array. Afterward, display on the screen all the negative numbers that were read.
 */
package exercises.array;

import java.util.Locale;
import java.util.Scanner;

public class Ex003 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers are you going to type?");
         
        int number = sc.nextInt();

        double[] vector =  new double[number];

        for (int i = 0; i < vector.length; i++){
            System.out.println("Type a number: ");
            vector[i] = sc.nextDouble();
        }

        System.out.println("Here we are the negative numbers: ");

        for(int i = 0; i < vector.length; i++){
            if(vector[i] < 0) System.out.println(vector[i]);

            
        }

       




        sc.close();
    }

}
