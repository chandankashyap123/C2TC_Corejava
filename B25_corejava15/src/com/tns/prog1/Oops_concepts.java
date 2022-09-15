package com.tns.prog1;


public class Oops_concepts {
	int year_ofpurchase;
	String make;
	int model;
	double cost;
	public void display1()
	{
		System.out.println("yearof purs"+2008);
		System.out.println("make"+"Audi");
		
	}
	void disp2()
	{
		System.out.println("model"+1999);
		System.out.println("make"+500000);
	}
	 public static void main(String[] args) {
		 // TODO Auto-generated method stub
       Oops_concepts ob1 = new Oops_concepts();
       
       ob1.display1();
       ob1.disp2();
	}

}