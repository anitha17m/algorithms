package com.algo;

import com.algo.pojo.InputPojo;
import com.algo.util.GetInputUtil;

public class GCD {
	public static void main(String[] args) {
		InputPojo input = GetInputUtil.getTwoIntFromUser();
		if (input.getNum1() > input.getNum2())
			System.out.println("GCD :" + performGCD(input.getNum1(), input.getNum2()));
		else
			System.out.println("GCD :" + performGCD(input.getNum2(), input.getNum1()));
	}

	private static int performGCD(int num1, int num2) {
		int temp;
		while (num2 != 0) {
			temp = num1;
			num1 = num2;
			num2 = temp % num1;
		}
		return num1;
	}
}
