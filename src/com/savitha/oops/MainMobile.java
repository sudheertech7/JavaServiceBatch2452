package com.savitha.oops;

class Mobile{
	String mobileCompany;
	int mobileRam;
	int mobileRom;
	public Mobile(String mobileCompany, int mobileRam, int mobileRom) {
		this.mobileCompany = mobileCompany;
		this.mobileRam = mobileRam;
		this.mobileRom = mobileRom;
	}
	
	public void printMobileInfo(){
		System.out.println(mobileCompany + "  " + mobileRam + "  " + mobileRom);
	}	
}
public class MainMobile {
	
	public static void main(String[] args) {
		Mobile pixel = new Mobile("pixel",8,128);
		System.out.println(pixel.mobileCompany);
		pixel.printMobileInfo();
		
	}
}
