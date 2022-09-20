package com.tns.staticthings;

public class counter {
	
		static int x=0;
		counter()
		{
			x++;
			
		}
		void display()
		{
			System.out.println(x);
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
counter c1 = new counter();
c1.display();
counter c2 = new counter();
c2.display();
counter c3 = new counter();
c3.display();


	}

}
