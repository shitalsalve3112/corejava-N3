package org.tnsif.client;

import org.tnsif.application.MMBankFactory;
import org.tnsif.application.MMCurrentAcc;
import org.tnsif.application.MMSavingAcc;
import org.tnsif.framework.BankFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   
		 BankFactory f= new  MMBankFactory ();
		 MMSavingAcc s= new MMSavingAcc( 25426, " Shital", 7000f, true);
		 MMCurrentAcc c= new MMCurrentAcc( 35451," Sampada", 45000f, 6005f);
		 
		 
		  //SAVINF ACCOUNT
		 System.out.println("SAVING aCCOUNT ");
		 System.out.println(s);
		 s.withdraw(3000);
		
		 
		 // CURRENT ACCOUNT
		 System.out.println(" CURRENT ACCOUNT");
		 System.out.println(c);
		 c.withdraw(6000);
		 
	}

}