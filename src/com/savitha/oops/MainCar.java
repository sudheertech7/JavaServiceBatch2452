package com.savitha.oops;
class Car{
	String carCompany;
	int carPrice;
	String carType;
	
	public Car(String carCompany, int carPrice,String carType ) {
		this.carCompany = carCompany;
		this.carPrice = carPrice;
		this.carType = carType;
	}
	
	public void printCarInfo() {
		System.out.println(carCompany + "  " + carPrice + "  " + carType);
	}
}

public class MainCar {
	public static void main(String[] args) {
		Car tata = new Car("Tata", 100000, "Electric");
		System.out.println(tata.carCompany);
		tata.printCarInfo();
	}
}
