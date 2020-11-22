package com.mkyong.core.utils;

public class MathUtil {
	public static int divide(int x , int y) {
		System.out.println("x=" + x + ", y = " + y);
		if(y== 0)
			throw new ArithmeticException();
		return x / y;
	}

	public static int doMath(int x, int y) {
		System.out.println("x=" + x + ", y = " + y);
		if(x == y)
			return x*2;
		else if(x < 0 && y < 0)
			return 0;
		else
			return x*y;
	}
}
