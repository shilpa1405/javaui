package com.sysintelli.model;

public class Register {
	private int userid;
	private String passid;
	private String username;
	private String address;
	public String country;
	public int zip;
	private String email;
	public String msex;
	public String fsex;
	public String en;
	public String noen;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getPassid() {
		return passid;
	}

	public void setPassid(String passid) {
		this.passid = passid;
	}

	public String getUsername() {
		return username;
	}

	public boolean setUsername(String username) {
		this.username = username;
		return false;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMsex() {
		return msex;
	}

	public void setMsex(String msex) {
		this.msex = msex;
	}

	public String getFsex() {
		return fsex;
	}

	public void setFsex(String fsex) {
		this.fsex = fsex;
	}

	public String getEn() {
		return en;
	}

	public void setEn(String en) {
		this.en = en;
	}

	public String getNoen() {
		return noen;
	}

	public void setNoen(String noen) {
		this.noen = noen;
	}

	public void save(Register register) {
		// TODO Auto-generated method stub
		
	}

}
