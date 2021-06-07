package org.example;
public class AreaOutput extends meterConversion{
    public void outPut(double a, double b){
        System.out.println("You entered dimensions of " + a + "feet by " + b + "feet");
        System.out.println("The area is");
        double area = calcArea(a, b);
        System.out.println(area + " square feet");
        double meters = meters(area);
        System.out.println(meters + " square meters");
    }
}
