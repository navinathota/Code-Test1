package com.zensar.model.figure;

//import java.util.Scanner;
//import java.lang.Math.*;

public class Parallelogram {
	
	public double dimension1;
	
	public double dimension2;
	
	public double angle=90.00;
		//step3
	public double getDimension1() {
		return dimension1;
	}
	public void setDimension1(double dimension1) {
		this.dimension1 = dimension1;
	}
	public double getDimension2() {
		return dimension2;
	}
	public void setDimension2(double dimension2) {
		this.dimension2 = dimension2;
	}
	public double getAngle() {
		return angle;
	}
	public void setAngle(double angle) {
		this.angle = angle;
	}
	//step4constructors based on step4 is to get 3 constructors of 
	public Parallelogram(double dimension1) {
			super();
			this.dimension1 = dimension1;
			this.dimension2 = dimension1;
			this.angle = 90;
		}
	public Parallelogram(double dimension1, double dimension2) {
		super();
		this.dimension1 = dimension1;
		this.dimension2 = dimension2;
		this.angle = 90;
	}
	public Parallelogram(double dimension1, double dimension2, double angle) {
		super();
		this.dimension1 = dimension1;
		this.dimension2 = dimension2;
		this.angle = angle;
	}
	//step5 logic for area
	public double area() {
		//area=dimension1*dimension2*Math.sin(angle);
		return this.dimension1*this.dimension2*Math.sin(angle);
		//return area;
		 //System.out.println("Area of Parallelogram is: " + area);
		 }

		}
	

	

