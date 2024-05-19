package com.practice.Day107;

public class Subscription_Msg {
	public static String msg(String res) {
		if(res=="yes")
			return "Thank you for Subscribing us!";
		else if(res=="No")
			return "Subscribe Now....!";
		return "My Bad..";
	}
	public static void main(String[] args) {
		System.out.println(msg("No"));
		
	}
}
