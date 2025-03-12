package com;

public class MainApp {
	public int additon(int a,int b) {
		return a+b;
	}
	public int multiply(int a,int b) {
		return a*b;
	}
	public static void main(String args[]) {
		MainApp map=new MainApp();
		System.out.println(map.additon(8, 6));
	}
}
