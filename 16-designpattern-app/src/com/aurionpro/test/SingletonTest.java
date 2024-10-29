package com.aurionpro.test;

import com.aurionpro.model.DbConnection;

public class SingletonTest {

	public static void main(String[] args) {
		DbConnection connection = DbConnection.getConnection();
		System.out.println(connection.hashCode());

	}

}
