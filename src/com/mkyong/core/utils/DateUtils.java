package com.mkyong.core.utils;

import java.util.Date;

public class DateUtils {

	public static Date getLocalCurrentDate() {
		return new Date();
	}

	public static long toMilliSeconds(Date date) {
		System.out.print(date);
		return date.getTime();
	}
}
