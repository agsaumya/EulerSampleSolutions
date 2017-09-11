package saumya.test;

import org.junit.Test;

import junit.framework.Assert;
import saumya.dev.Problem3;

@SuppressWarnings("deprecation")
public class Problem3Test {

	@Test
	public void testFind() {
		Assert.assertEquals("27", Problem3.find(10));
	}

	@Test
	public void testFactorial() {
		
		Assert.assertEquals(1, Problem3.factorial(0).intValue());
		Assert.assertEquals(2, Problem3.factorial(2).intValue());
		Assert.assertEquals(6, Problem3.factorial(3).intValue());
	}
	
	@Test
	public void testFacttorialWithException() {
		try {
			Assert.assertEquals(0, Problem3.factorial(-1));
		} catch(Exception e) {
			Assert.assertTrue(e instanceof IllegalArgumentException);
		}
	}

}
