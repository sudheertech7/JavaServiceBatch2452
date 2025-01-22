package com.savitha.oops;
class Members{
	{
		System.out.println("Instance Block from Members Class");	
	}
	
	static{
		System.out.println("Static Block from Members Class");
	}
}

public class MainMembers {
	
	{
		System.out.println("Instance Block");
	}
	
	static{
		System.out.println("Static Block");
	}
	
	public static void main(String[] args) {
		MainMembers mainMembers = new MainMembers();
	}

}
