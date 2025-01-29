package com.Abstraction;

import java.util.Scanner;


interface Flipkart{
	void pay(int orderAmount);
}

class PhonePay implements Flipkart{

	@Override
	public void pay(int orderAmount) {
		System.out.println("Transaction Done Through PhonePay Order Bill : "+ orderAmount);

	}

}


class GooglePay implements Flipkart{

	@Override
	public void pay(int orderAmount) {
		System.out.println("Transaction Done Through GooglePay Order Bill : "+ orderAmount);

	}
	
}

class Paytm implements Flipkart{

	@Override
	public void pay(int orderAmount) {
		System.out.println("Transaction Done Through Paytm Order Bill : "+ orderAmount);

	}
	
}

class CardPayments implements Flipkart{

	@Override
	public void pay(int orderAmount) {
		System.out.println("Transaction Done Through CardPayments Order Bill : "+ orderAmount);
		
	}
	
}

class CashOnDelivery implements Flipkart{

	@Override
	public void pay(int orderAmount) {
		System.out.println("Transaction Done Through CashOnDelivery Order Bill : "+ orderAmount);
		
	}
	
}


class PaymentType{
	void payment(Flipkart paymentGateWay, int orderAmount) {
		System.out.println("------------------------------------------------------------------");
		paymentGateWay.pay(orderAmount);
	}
}

public class AbstractionFlipkartTask {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Payment Type : \nphonepay  \ngooglepay \npaytm \ncardpayments \ncashondelivery \nchoose : ");
		String paymentType = sc.nextLine();
		System.out.print("Enter the OderAmmount : ");
		int amount = sc.nextInt();
		
		Flipkart gateway;
		
		switch(paymentType) {
		
		case "phonepay" -> gateway = new PhonePay();
		case "googlepay" -> gateway = new GooglePay();
		case "paytm" -> gateway = new Paytm();
		case "cardpayments" -> gateway = new CardPayments();
		case "cashondelivery" -> gateway = new CashOnDelivery();
		default -> gateway = null;
		}
		
		if(gateway == null) {
			System.out.println("Enter the Valid Bank SBI OR HDFC or IPPB");
		}
		else {
			PaymentType poly = new PaymentType();
			poly.payment(gateway,amount);
		}
		
	}

}
