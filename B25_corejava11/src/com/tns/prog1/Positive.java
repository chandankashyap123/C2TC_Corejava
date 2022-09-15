package com.tns.prog1;
import java.util.Scanner;
public class Positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
     int number =sc.nextInt();
     if(number > 0)
     {
    	 System.out.println("The give number is Positive."+number);
     }
     
     
    	 else if (number < 0) {
    	 System.out.println("The give number is negative."+number);
     }
    
     
    	 else if(number==0) {
    	 System.out.println("The give number is zero."+number);
     }
	}

}