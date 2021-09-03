package com.algo.util;

import java.util.Scanner;

import com.algo.pojo.InputPojo;

public class GetInputUtil {

	public static InputPojo getTwoIntFromUser() {
		int num1, num2;
		System.out.println("Enter two integers:");
		try (Scanner sc = new Scanner(System.in)) {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
		}
		InputPojo input = new InputPojo(num1, num2);
		return input;
	}
}
