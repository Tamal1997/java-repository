package com.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Temperature {

	public static void main(String[] args) throws IOException, NumberFormatException{
		
		double c,f;
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader ob=new BufferedReader(in);
		System.out.println("Enter the celcious temperature:");
		c=Double.parseDouble(ob.readLine());
		
		f=(9*c/5)+32;
		System.out.println("Farenhait ="+f);
		
		System.out.println("Enter the farenhait temperature:");
		f=Double.parseDouble(ob.readLine());
		
		c=(5*(f-32))/9;
		System.out.println("Farenhait ="+c);// TODO Auto-generated method stub

	}

}
