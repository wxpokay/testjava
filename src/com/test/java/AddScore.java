package com.test.java;

import java.util.Scanner;
public class AddScore {
	public static void main(String[] arc){
		Scanner input = new Scanner(System.in);
		System.out.println("ÇëÊäÈë·ÖÊı");
		int score = input.nextInt();
		int count = 0;
		System.out.println(score);
		while (score<60){
			score++;
			count++;
		}
		System.out.println(score);
		System.out.print(count);
		
		
	}

}
