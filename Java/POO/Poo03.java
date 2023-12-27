package Exercicios.Java.POO;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

abstract class Shape {

    private Color color;

    Shape() {

    }

    Shape(Color color) {
        this.color = color;
    }

    public abstract Double area();

}

enum Color {
    BLACK,
    BLUE,
    RED;

}

class Circle extends Shape {
    private Double radius;

    Circle() {

    }

    Circle(Double radius, Color color) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return this.radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private Double width;
    private Double height;

    Rectangle() {

    }

    Rectangle(Double width, Double height, Color color) {

        super(color);
        this.width = width;
        this.height = height;

    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return this.width;
    }

    public Double getHeight() {
        return this.height;
    }

    @Override
    public Double area() {
        return width * height;
    }
}

public class Poo03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        List<Shape> shape = new ArrayList<>();

        System.out.println("Enter the number of shapes: ");

        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {

            System.out.printf("SHAPE NUMBER #%d  ", i + 1, "DATA\n\n");

            System.out.println("rectangle or circle ?");
            sc.nextLine();
            String figure = sc.nextLine();
            String color;

            switch (figure) {
                case "rectangle":

                    System.out.println("COLOR: (BLACK/BLUE/RED)");


                    color = sc.nextLine();

                    System.out.println("WIDTH: ");
                    Double width = sc.nextDouble();

                    System.out.println("HEIGHT: ");
                    Double height = sc.nextDouble();

                    shape.add(new Rectangle(width, height, Color.valueOf(color)));

                    break;

                case "circle":
                    System.out.println("COLOR: (BLACK/BLUE/RED)");


                    color = sc.nextLine();

                    System.out.println("RADIUS: ");

                    Double radius = sc.nextDouble();

                    shape.add(new Circle(radius, Color.valueOf(color)));

                    break;

                default:
                    System.out.println("Invalid!");

                    break;
            }
        }

        System.out.println("SHAPE AREAS: ");

        for (Shape s : shape) {
            System.out.printf("%.2f\n", s.area());
        }

        sc.close();
    }

}
