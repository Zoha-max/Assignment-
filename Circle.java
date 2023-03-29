package com.cognizant.shapes;
import java.util.Scanner;

public class Circle {
	float radius =1.5f;
	static float pi=3.5f;
	Circle(){
		radius=1.5f;	
	}
	Circle(float radius)
	{
		this.radius=radius;
		
	}
	Circle(float radius,float pi)
	{
		this.radius=radius;
	}
	static float Areaofcircle(float radius)
	{
	return pi*radius*radius;	
	}
	static float Circumferenceofcircle(float radius) 
	{
		return 2*pi*radius;
	}
public static void main(String[] args) {
	Circle obj=new Circle();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Radius:");
	float radius=sc.nextFloat();
	System.out.println("The Area of circle is:"+Areaofcircle(radius));
	System.out.println("The Circumference of Circle is:"+ Circumferenceofcircle( radius) );
	
}
}
