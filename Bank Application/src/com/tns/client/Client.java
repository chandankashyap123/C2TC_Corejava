package com.tns.client;
import com.tns.Application.MMCurrentAcc;
import com.tns.Application.MMSavingAcc;
import com.tns.Application.MMBankFactory;
import com.tns.Framework.BankFactory;
import com.tns.Framework.CurrentAcc;
import com.tns.Framework.SavingAcc;

public class Client {

	public static void main(String[] args) throws Exception {
		
		BankFactory s = new MMBankFactory();
		SavingAcc p = new MMSavingAcc( 140622000,"chandan",250,true);
		CurrentAcc n = new MMCurrentAcc (140622001, "Lokesh", 600, 20);
		
		System.out.println("Saving Account ");
		p.withdraw(p.getAccBal());
		
		System.out.println("Current Account ");
		n.withdraw(n.getAccBal());
		
		System.out.println(s.getNewSavingAcc(12222, "cv", 1355, true));
		System.out.println(s.getNewCurrentAcc(1555, "cvc", 800, 40));
		
		System.out.println(p);
		System.out.println(n);

	}

}