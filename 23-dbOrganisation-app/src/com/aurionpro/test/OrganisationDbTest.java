package com.aurionpro.test;

import com.aurionpro.dbOrganisation.OrganisationDB;

public class OrganisationDbTest {

	public static void main(String[] args) {
		OrganisationDB organisationdb = new OrganisationDB();
		organisationdb.connect();
//		organisationdb.getEmpData();
//		organisationdb.getDeptData();
		organisationdb.Query();
	}
}
