package com.tns.exception;
public class TryExceptionEx2 { 
public static void main(String[] args) 
{
		System.out.println("111");
		try
		{
			int x = 12/0;
			System.out.println("Result of:"+x);
			System.out.println("333");
		}
			catch(ArithmeticException ae)
			{
				System.out.println("A Hello world");
			}
				System.out.println("444");
			}
      }
		
