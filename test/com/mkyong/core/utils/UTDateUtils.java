package com.mkyong.core.utils;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

public class UTDateUtils {

	@Test
	public void testGetLocalCurrentDate() {
		
		Date res = DateUtils.getLocalCurrentDate();
		
		Assert.assertNotNull(res);
	}
}
