package com.booleanuk.core;

public class Author {
	String name;
	String contactInformation;
	String website;
	public  Author(String name){
		this.name=name;

	}

	public String getContactInformation() {
		return contactInformation;
	}

	public void setContactInformation(String contactInformation) {
		this.contactInformation = contactInformation;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}
}
