package com.seed;

public class Test1 {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3};
		int  [] barr = {10,20,30,40};
		
		display(arr);
		display(barr);
		
	}
	
	public static void display(int[] arr) {
		for(int x: arr) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
	
	

}
