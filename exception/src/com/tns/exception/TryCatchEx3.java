package com.tns.exception;

public class TryCatchEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =100, y = 0;
		try
		{
			System.out.println("111");
			int z = x/y;
			System.out.println("Result of z:"+z);
		
		}
			catch(ArithmeticException ae)
			{
				System.out.println("A Hello world");
			}
				System.out.println("333");

	}

}