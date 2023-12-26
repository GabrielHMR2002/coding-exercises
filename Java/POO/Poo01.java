package Exercicios.Java.POO;

class Employee{
    protected String name;
    protected Integer hours;
    protected double valuePerHour;

    public double payment(){
        double amount = this.hours * this.valuePerHour;

        return amount;
    }
}

class OutSourceEmployee extends Employee{

    private Double additionalCharge;

    @Override
    public double payment(){
        double amount = this.hours + this.valuePerHour;

        return amount;
    }
}

public class Poo01 {


    
}
