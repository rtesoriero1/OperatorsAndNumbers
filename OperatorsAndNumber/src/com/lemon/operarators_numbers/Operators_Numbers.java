package com.lemon.operarators_numbers;

//First part of exercise 
/** Decimal to Binary
 * 1 = 0001
 * 8 = 1000
 * 33 = 0010 0001
 * 78 = 0100 1110
 * 787 = 0011 0001 0011
 * 33,987 = 1000 0100 1100 0011
 */

/** Binary to Decimal 
 * 0010 = 2
 * 1001 = 9 
 * 0011 0100 = 52
 * 0111 0010 = 114
 * 0010 0001 1111 = 543
 * 0010 1100 0110 0111 = 11,367
 */

public class Operators_Numbers {

	//calling the methods for the requested programs 
	public static void main(String[] args) {
		leftShiftedBinary(2);
		leftShiftedBinary(9);
		leftShiftedBinary(17);
		leftShiftedBinary(88);
		
		rightShiftedBinary(150);
		rightShiftedBinary(255);
		rightShiftedBinary(1555);
		rightShiftedBinary(32456);
		
		calculateBitwiseAnd();
		
		assignPostfix();
		
		incrementByOneThreeWays();
		
		solveFinalQuestion();

	}
	public static void leftShiftedBinary(int x) {
		
		//getting the decimal and binary value of the input 
		System.out.println("The decimal value is: " + x + "The binary value is: " + Integer.toBinaryString(x)); 
		
		//left shifting the parameter and printing the result in binary 
		x =x << 1; 
		/*
		 * if x = 2 
		 * Predict the result will be 0100 / 4 
		 */
		System.out.println(Integer.toBinaryString(x)); 
		
	}
	
	public static void rightShiftedBinary(int x) {
		//getting the decimal and binary value of the input 
		System.out.println("The decimal value is: " + x + "The binary value is: " + Integer.toBinaryString(x)); 
		
		//right shifting the parameter and printing the result in binary 
		x =x >> 2; 
		/*
		 * if x = 150
		 * Predict the result will be 0100 / 4 
		 */
		System.out.println(Integer.toBinaryString(x)); 
	}
	
	public static void calculateBitwiseAnd(){
		
		//setting starting value and using Bitwise with And to print
		int x = 7;
		int y = 17;
		int z = x&y; 
		System.out.println("the bitwise And value is: " + z); 
		
		//using Bitwise with Or and printing it
		z = x|y;
		System.out.println("the bitwise Or value is: " + z);
	}
	
	public static void assignPostfix(){
		int x = 7;
		
		//assigned post fix in first output to get it to increment in the second output
		System.out.println("this is the starting value: " + x++); 
		System.out.println("this is the value after post-fix: " + x); 
		
	}
	
	public static void incrementByOneThreeWays(){
		//setting and printing starting value
		int x = 7;
		System.out.println("this is the starting value: " + x); 
		
		//incrementing 1 time and printing 
		x = x+1;
		System.out.println("this is after 1 increment: " + x); 
		
		//incrementing 2nd time and printing 
		x = ++x;
		System.out.println("this is after 2 increment: " + x++);
		
		//used post-fix in previous output to increment a 3rd time
		System.out.println("this is after 3 increment: " + x); 
	}
	
	public static void solveFinalQuestion(){
		int x = 5;
		int y = 8;
		
		//adding increment x to y
		int sum = ++x + y; 
		System.out.println("this is the sum of ++x and y: " + sum);
		
		//changing from prefix to post fix
		sum = x++ +y; 
		System.out.println("this is the sum of x++ and y: " + sum);
	}
	
}
