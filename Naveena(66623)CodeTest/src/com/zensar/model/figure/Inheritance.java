package com.zensar.model.figure;

import java.util.Scanner;

public class Inheritance  {

	/*public void main(String[] args) {
		Parallelogram p1=new Parallelogram(10,20,90);
		System.out.println(p1.area());
}*/
	public static void main (String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter input");
		double dimension1=s.nextDouble();
		System.out.println("dimension1 of parallelogram is:"+dimension1);
		double dimension2=s.nextDouble();
		System.out.println("dimension2 of parallelogram is:"+dimension2);
		
		Parallelogram p=new Parallelogram(dimension1,dimension2);
		System.out.println("Area of parallelogram is:"+p.area());
		Picture pc=new Picture();
		
		boolean result=pc.add(p);
		System.out.println(result);
	}
}