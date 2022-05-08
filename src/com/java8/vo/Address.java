package com.java8.vo;

public class Address {

	private String presAddr;
	private String permAddr;
	
	
	public Address(String presAddr, String permAddr) {
		super();
		this.presAddr = presAddr;
		this.permAddr = permAddr;
	}


	public String getPresAddr() {
		return presAddr;
	}


	public void setPresAddr(String presAddr) {
		this.presAddr = presAddr;
	}


	public String getPermAddr() {
		return permAddr;
	}


	public void setPermAddr(String permAddr) {
		this.permAddr = permAddr;
	}


	@Override
	public String toString() {
		return "Address [presAddr=" + presAddr + ", permAddr=" + permAddr + "]";
	}
	
	
}
