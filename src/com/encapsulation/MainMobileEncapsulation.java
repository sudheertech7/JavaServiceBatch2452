package com.encapsulation;


class Mobile{
	
	private String wallpaper = "god wallpaper";
	private String ringtone = "movie Ringtone";
	private int password = 9999;
	
	public String getWallpaper() {
		return wallpaper;
	}
	
	
	public void setWallpaper(String wallpaper) {
		if (wallpaper.equals("badwallpaper")) {
			System.out.println("Wallpaper Not Updated");
		}
		else {
			this.wallpaper = wallpaper;
			System.out.println("Wallpaper updated Successfully");
		}
	}
	
	
	public String getRingtone() {
		return ringtone;
	}
	public void setRingtone(String ringtone) {
		if (ringtone.equals("badringtone")) {
			System.out.println("ringtone Not Updated");
		}
		else {
			this.ringtone = ringtone;
			System.out.println("Ringtone updated successfully");
		}
	}
	public int getPassword() {
		return password;
	}
	
	public void setPassword(int password, int newPassword) {
		if(this.password == password) {
			this.password = newPassword;
			System.out.println("Password Updated Successfully");
		}
		else {
			System.out.println("Invalid Password");
		}
	}
	
}

public class MainMobileEncapsulation {
	
	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		mobile.setPassword(9999,1234);
		System.out.println(mobile.getPassword());
		System.out.println("----------------------");
		mobile.setWallpaper("moviewallpaper");
		System.out.println(mobile.getWallpaper());
		
		System.out.println("----------------------");
		mobile.setRingtone("movieringtone");
		System.out.println(mobile.getRingtone());
		
		
	}

}
