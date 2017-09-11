/**
 * 
 */
package saumya.test;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import saumya.dev.Problem2;

/**
 * @author Saumya
 *
 */
public class Problem2Test {

	/**
	 * Test method for {@link saumya.dev.Problem2#find(int)}.
	 */
	@Test
	public void testFind() {
		Assert.assertEquals("12", Problem2.find(3));
		try {
			Assert.assertEquals("", Problem2.find(0));
			Assert.fail("Test Failed");
		} catch(Exception e) {
			Assert.assertTrue(e instanceof RuntimeException);
		}
		
	}

}
