package com.savitha.oops;
class Marker{
	String color;
	int price;
	String company;
	//Default Constructor
	public Marker() {
		System.out.println("Default Constructor");
	}
	//parameterized Constructor
	public Marker(String markerColor, int markerPrice, String markerCompany) {
		color = markerColor;
		price = markerPrice;
		company = markerCompany;
		
	}
	//Method
	public void printInfo() {
		System.out.println(color + " " + price + " " + company);
	}
}


public class MainMarker {
	
	public static void main(String[] args) {
		Marker marker1 = new Marker("black", 50, "artLine");
		System.out.println(marker1.color);
		System.out.println(marker1.price);
		System.out.println(marker1.company);
		marker1.printInfo();
		Marker marker2 = new Marker();
	}

}
