package com.test.java;

public class testmath {
	public static void main(String[] args){
		int num = 999;
		int count = 0;

		if(num>=0&&num<=9999){
		    while(num!=0){
		        count++;
		    num = num/10;
		    }
		}
		System.out.println("它是个"+count+"位的数!");
		}

}