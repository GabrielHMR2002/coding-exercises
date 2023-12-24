
/*
 * Create a program to read the name, age, and height of N people, following the example. Then, display on the screen the average height of the individuals and also show the percentage of people under 16 years old, along with their names if applicable.
 */

package exercises.array;

import java.util.Locale;
import java.util.Scanner;

class Person {
    private String name;
    private int age;
    private Double height;

    Person() {

    }

    Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getHeight() {
        return this.height;
    }
}

public class Ex005 {
    public static void main(String[] argd) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("How many people are you going to register? ");
        int number = sc.nextInt();

        Person[] vector = new Person[number];

        for (int i = 0; i < vector.length; i++) {

            System.out.println("Name: ");
            sc.nextLine(); // Consume the newline left by sc.nextInt()
            String name = sc.nextLine();

            System.out.println("Age: ");
            int age = sc.nextInt();

            System.out.println("Height: ");
            double height = sc.nextDouble();

            vector[i] = new Person(name, age, height);
        }

        double sumHeight = 0;
        for (int i = 0; i < vector.length; i++) {

            sumHeight += vector[i].getHeight();

        }

        double averageHeight = sumHeight / vector.length;

        System.out.println("Average Height: " + averageHeight);

        int countUnder16 = 0;

        for (int i = 0; i < vector.length; i++) {

            if (vector[i].getAge() < 16) {
                countUnder16++;
                System.out.println(vector[i].getName());

            }
        }

        double percentageUnder16 = (countUnder16 * 100) / vector.length;

        System.out.println("People under 16  = " + percentageUnder16 + "%");

        sc.close();
    }
}