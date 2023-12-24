/*
 * Create a program to read an integer N and the data (name and price) of N products. Store the N products in an array. Then, display the average price of the products.
 */

package exercises.array;

import java.util.Locale;
import java.util.Scanner;

class Product {

    private String name;
    private double price;

    Product() {

    }

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }
}

public class Ex002 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many products are you going to type ?");
        int number = sc.nextInt();

        Product[] vector = new Product[number];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Name: ");

            sc.nextLine(); // get line
            String name = sc.nextLine();

            System.out.println("Price: ");
            double price = sc.nextDouble();

            vector[i] = new Product(name, price);
        }

        double sum = 0;
        for (int i = 0; i < vector.length; i++) {
            sum += vector[i].getPrice();
        }

        double average = sum / vector.length;

        System.out.println("Average Price: " + average);

        sc.close();
    }

}
