package com.savitha.oops;

class Mobile{
	String mobileCompany;
	int mobileRam;
	int mobileRom;
	
	public Mobile(String mComapny, int mRam, int mRom) {
		mobileCompany = mComapny;
		mobileRam = mRam;
		mobileRom = mRom;
	}
	
	public void printMobileInfo(){
		System.out.println(mobileCompany + "  " + mobileRam + "  " + mobileRom);
	}	
}
public class MainMobile {
	
	public static void main(String[] args) {
		Mobile pixel = new Mobile("pixel",8,128);
		Mobile iphone = new Mobile("iphone", 6, 256);
		System.out.println(pixel.mobileCompany);
		pixel.printMobileInfo();
		System.out.println("----------------------");
		System.out.println(iphone.mobileCompany);
		iphone.printMobileInfo();
		
	}
}
