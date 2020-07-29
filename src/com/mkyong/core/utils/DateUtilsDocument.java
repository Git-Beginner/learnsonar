package com.mkyong.core.utils;

import java.util.Date;

public class DateUtilsDocument {

	public static void main(String[] args) {
		

		System.out.println(getLocalCurrentDate());
		
	}

	private static Date getLocalCurrentDate() {
	
		return new Date();
		
	}

	private Date getLocalCurrentDate1() {
		int x = 0;
		return new Date();
		
	}
}
