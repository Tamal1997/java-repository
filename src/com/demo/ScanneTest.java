package com.demo;

import java.util.Scanner;

public class ScanneTest {

	public static void main(String[] args) {
		
		
		Scanner ob=new Scanner(System.in);
		int a,b;
		
		System.out.println("Enter the value of a:");
		a=ob.nextInt();
		
		System.out.println("Enter the value of b:");
		b=ob.nextInt();
		
		System.out.println("Addition="+(a+b));
		ob.close();
	}

}
