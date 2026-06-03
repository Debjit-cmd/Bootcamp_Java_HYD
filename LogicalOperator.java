package com.JavaOperator;

public class LogicalOperator {

	public static void main(String[] args) {
		//AND
		System.out.println((5 > 3) && (8 > 5));
		System.out.println((5 > 3) && (8 < 5));
		//OR
		System.out.println((5 > 3) || (8 > 5));
		System.out.println((5 > 3) || (8 < 5));
		System.out.println((5 < 3) && (8 < 5));
		//NOT
		System.out.println(!(5==3));
		System.out.println(!(5>3));

	}

}
