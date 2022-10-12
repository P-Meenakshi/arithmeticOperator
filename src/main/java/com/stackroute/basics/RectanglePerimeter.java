package com.stackroute.basics;


import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        new RectanglePerimeter().getValues();
    }

    //get user input from console
    public void getValues() {
        Scanner sc =new Scanner(System.in);
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        System.out.println(new RectanglePerimeter().perimeterCalculator(length,breadth));

    }

    //write logic to find perimeter of rectangle here
    public double perimeterCalculator(double length, double breadth) {
        double p = 2*(length+breadth);
        return p;
    }
}
