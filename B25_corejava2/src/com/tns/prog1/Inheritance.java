package com.tns.prog1;
class withdraw
{
	int amt_withdraw=2000;
}
public class Inheritance extends withdraw{
	int amt_left=5000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Inheritance obj1= new Inheritance();
          System.out.println("amountwithdraw"+obj1.amt_withdraw);
	}

}
