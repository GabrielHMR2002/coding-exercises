/*A company has its own employees and outsourced employees.
For each employee, it is desired to record the name, hours worked, and hourly rate. Outsourced employees also have an additional expense.
The payment for employees corresponds to the hourly rate multiplied by the hours worked, with outsourced employees receiving a bonus equivalent to 110% of their additional expense.
Create a program to read data for N employees (N provided by the user) and store them in a list. After reading all the data, display the name and payment of each employee in the same order they were entered.
Build the program according to the project on the side. See an example on the next page. */


package Exercicios.Java.POO;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

class Employee {
    protected String name;
    protected Integer hours;
    protected double valuePerHour;

    Employee() {

    }

    Employee(String name, Integer hours, double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;

    }

    public double payment() {
        double amount = this.hours * this.valuePerHour;

        return amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHour(Integer hour) {
        this.hours = hour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return this.name;
    }

    public Integer getHour() {
        return this.hours;
    }

    public double getValuePerHour() {
        return this.valuePerHour;
    }
}

class OutSourceEmployee extends Employee {

    private Double additionalCharge;

    OutSourceEmployee() {

    }

    OutSourceEmployee(String name, Integer hours, double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;

    }

    @Override
    public double payment() {
        double amount = hours * valuePerHour + 1.1 * additionalCharge;

        return amount;
    }

    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    public double getAdditionalCharge() {
        return additionalCharge;
    }
}

public class Poo01 {

    public static void main(String[] args) {

        List<Employee> employee = new ArrayList<>();
        List<Employee> outSourceEmployee = new ArrayList<>();

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("How many employees are you going to register? ");

        int number = sc.nextInt();
        String yes = "y";
        String no = "n";

        for (int i = 0; i < number; i++) {

            System.out.println("EMPLOYEE # " + i + " DATA: \n");
            System.out.println("OutSourced (y or n)?");
            sc.nextLine();
            String option = sc.nextLine();

            System.out.println("Name: ");
            String name = sc.nextLine();

            System.out.println("Hours: ");
            Integer hours = sc.nextInt();

            System.out.println("Value per Hour: ");
            double valuePerHour = sc.nextDouble();

            switch (option) {
                case "y":
                    System.out.println("AdditionalCharge: ");

                    double additionalCharge = sc.nextDouble();

                    Employee e = new OutSourceEmployee(name, hours, valuePerHour, additionalCharge);

                    outSourceEmployee.add(e);

                    break;
                case "n":
                    Employee e1 = new Employee(name, hours, valuePerHour);
                    employee.add(e1);

                    break;

                default:
                    System.out.println("Invalid Option!");
                    break;
            }

        
        }

        System.out.println("PAYMENTS: \n");

        for (Employee e : employee) {
            System.out.println(e.getName());
            System.out.println(e.payment());
            System.out.println();
        }

        for (Employee e : outSourceEmployee) {
            System.out.println(e.getName());
            System.out.println(e.payment());
            System.out.println();
        }

        sc.close();
    }

}
