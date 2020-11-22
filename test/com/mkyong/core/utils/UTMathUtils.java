package com.mkyong.core.utils;

import org.junit.Assert;
import org.junit.Test;

public class UTMathUtils {

	@Test
	public void divide() {
		
		int res = MathUtil.divide(0, 5);
		Assert.assertNotNull(res);
	}
	
	@Test
	public void doMath() {
		
		int res = MathUtil.doMath(5,5);
		Assert.assertNotNull(res);
	}
}
