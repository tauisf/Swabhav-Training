package com.aurionpro.test;

import com.aurionpro.dbOrganisation.TransactionDb;

public class TransactionTest {

	public static void main(String[] args) {
		TransactionDb transactionDb=new TransactionDb();
		transactionDb.connect();
		transactionDb.setOfQuery();
//		transactionDb.getMetaDataAboutDataBase();
//		System.out.println("==================================");
//		transactionDb.getMetaDataAboutEmpTable();
//		System.out.println("==================================");
//		transactionDb.getMetaDataAboutDeptTable();
//		System.out.println("==================================");

	}

}
