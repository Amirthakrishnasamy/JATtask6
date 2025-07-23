package JATtask6;

import java.util.Scanner;

public class Circle {
	private double radius;
	public Circle() {
		System.out.println("Program to calculate cirumference");
	}
	public Circle(double radius) {
		this.radius=radius;
	}
 public double getCircumference() {
	 return 2*Math.PI*radius;
 }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		double radius=sc.nextDouble();
		Circle circum=new Circle();
		Circle circum1=new Circle(radius);
		System.out.println("The circumference of the circle is " +circum1.getCircumference());		

	}

}
