package com.tns.assignment;

public class SwitchCaseinJavaint {

		public static void main(String[]args)
		{
		int x=10;
		if(x==1)
		{System.out.println("Thevalueofxis1");}
		else if
		(x==2)
		{
		System.out.println("Thevalueofxis2");}
		else if(x==3)
		{
		System.out.println("Thevalueofxis3");}
		else
		{
		System.out.println("Thevalueof xisotherthan1,2,3");
		}
		switch(x)
		{
		case 1:
		System.out.println("Thevalueof xis1");
		break;
		case 2:
		System.out.println("Thevalueof xis2");
		break;
		case 3:
		System.out.println("Thevalueof xis3");
		break;
		default:
		System.out.println("Thevalueof xisotherthan1,2,3");
		break;
		}
		// TODO Auto-generated method stub

	}

}