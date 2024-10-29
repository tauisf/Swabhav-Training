package com.aurionpro.adapters.test;
import com.aurionpro.adapters.model.Biscuit;
import com.aurionpro.adapters.model.Chocolate;
import com.aurionpro.adapters.model.Hat;
import com.aurionpro.adapters.model.HatAdapter;
import com.aurionpro.adapters.model.IItems;

public class Shopping {
	public static void main(String[] args) {
		
		 IItems biscuit = new Biscuit("Parle G",100);
		 System.out.println( biscuit.getName()+"--------"+biscuit.getPrice());
		
		 IItems chocolate = new  Chocolate("Silk",100);
		 System.out.println( chocolate.getName()+"--------"+chocolate.getPrice());
		 
		 
	     Hat hat =	new Hat("JK","Howling",100,10);
	     IItems HatAdapter = new  HatAdapter(hat);
	     
	     
	     
	    System.out.println( HatAdapter.getName()+"------"+HatAdapter.getPrice());
	    System.out.println("Total Price    "+(HatAdapter.getPrice()+chocolate.getPrice()+biscuit.getPrice()));
	}
}