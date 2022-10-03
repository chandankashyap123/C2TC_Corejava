package com.tns.exception;
import java.util.Scanner;
public class InvalidAgeExceptionextendsException {

	private static String age;
	static void validate() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		age = sc.nextLine();
		System.out.println("Welcome to vote");
	}
	// TODO Auto-generated method stub

	public static void main(String[] args)
	{
		try {
			validate();
		}
		catch(Exception e)
		{
			System.out.println("Caught an Exception: \n "+e);
		}
	}

}