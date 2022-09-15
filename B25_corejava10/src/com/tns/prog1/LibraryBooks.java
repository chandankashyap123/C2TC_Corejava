package com.tns.prog1;
import java.util.Scanner;
public class LibraryBooks {

	public static void main(String[] args) {
		int N;
		int days; 
		float F;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of days the book is returned late:");
		N=sc.nextInt();
		if(N<=5)
                   F=0.1f*N;
		else if (N<=5)
			    F=0.1f*5+0.5f*5+(N-10)*0.10f;
		System.out.println("fine=");
		
		// TODO Auto-generated method stub

	}

}