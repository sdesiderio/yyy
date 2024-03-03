package com.sistemi.informativi.singleton;

public enum DbParameters {
	
	
	dbUrl  ("jdbc:mysql://localhost:3306/openjobmetis"),
	dbUser ("root"),
	dbPass ("");
	
	private String value;

	private DbParameters(String value) {
		
		this.value=value;
		
	}
	
	public String getValue() {
		
		return value;
	}
	
	
	

}
