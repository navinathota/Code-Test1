package com.zensar.model.figure;

public class Picture {
	Parallelogram arr[];
	Picture(){
		arr=new Parallelogram[4];
	}
	
	//Parallelogram[] arr=new Parallelogram[4];
	
	public boolean add (Parallelogram pgm) {
		
		for(int i=3;i>=0;i--) {
		
			if(arr[i]==null) {
				arr[i]=pgm;
				return true;
			}
		}
		return false;
		
	}
}
