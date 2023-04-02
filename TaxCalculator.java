package com.cognizant.tax;

import java.util.Scanner;


public class TaxCalculator {
   static float basicSalary=15000;
    static boolean citizenship=false;
    static  float tax;

    // Constructor for initializing instance variables
    public TaxCalculator(float basicSalary, boolean citizenship) {
        this.basicSalary = basicSalary;
        this.citizenship = citizenship;
    }

    public void BasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }


    public void Citizenship(boolean citizenship) {
        this.citizenship = citizenship;
    }

  

    public void Tax(float tax) {
        this.tax = tax;
    }

    // Method to calculate tax and print message
    public void calculateTax() {
        tax = 30 * basicSalary / 100;
        System.out.println("The Tax of the employee for the " + basicSalary + " is " + tax);
    }
    public static void main(String[] args) {
    	TaxCalculator obj=new TaxCalculator (basicSalary,false);
    	 obj.calculateTax();
	}
}
