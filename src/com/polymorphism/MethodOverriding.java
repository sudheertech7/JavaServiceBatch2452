package com.polymorphism;
class Plane{
	void fly() {
		System.out.println("Plane is Flying");
	}
}
class CargoPlane extends Plane{
	
	@Override
	void fly() {
		System.out.println("CargoPlane is Flying at Low height");
	}
}
class PassengerPlane extends Plane{
	void fly() {
		System.out.println("PassengerPlane is Flying at Medium Height");
	}
}
class FighterPlane extends Plane{
	void fly() {
		System.out.println("FighterPlane is Flying Great Height");
	}
}
class Polymorphism{
	void polyMorphismTest(Plane ref) {
		ref.fly();
	}	
}

public class MethodOverriding {
	public static void main(String[] args) {
		Plane cp = new CargoPlane();
		Plane pp = new PassengerPlane();
		Plane fp = new FighterPlane();
		Polymorphism poly = new Polymorphism();
		poly.polyMorphismTest(cp);
		poly.polyMorphismTest(pp);
		poly.polyMorphismTest(fp);	
	}

}