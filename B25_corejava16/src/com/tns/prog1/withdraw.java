package com.tns.prog1;
class withdraw 
{
	int amt_withdraw=2000;
}

public class inheritance extends withdraw {
	int amt_left=5000;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
inheritance ob1= new inheritance();
System.out.println("amountwithdraw"+ ob1.amt_withdraw);
	}

}