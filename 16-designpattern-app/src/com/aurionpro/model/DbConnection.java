package com.aurionpro.model;

public class DbConnection {
	// for singleton design pattern

	// make a static variable for same instance class
	private static DbConnection connection;

	// make the constructor private
	private DbConnection() { // private so cannot be accesses by driver directly

	}

	public static DbConnection getConnection() {
		// add a condition if the variable is null then only create the object
		// this will create only one object
		if (connection == null)
			connection = new DbConnection();

		return connection;
	}
}
