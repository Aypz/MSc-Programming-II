package jUnitTest;

import static org.junit.Assert.*;
import jUnit.NumberCruncher;

import org.junit.Before;
import org.junit.Test;

public class NumberCruncherTest {

	// Test data
	int num1, num2, num3;
	NumberCruncher nc;

	@Before
	public void setUp() throws Exception {
		num1 = 2;
		num2 = 4;
		num3 = 6;
		nc = new NumberCruncher();
	}

	@Test
	public void testAddNumbers(){
		assertEquals(num1 + num2, nc.addNumbers(num1, num2));
	}
	
	
	
	@Test
	public void divNormal(){
		try {
			assertEquals(num3/num1, nc.divideNumbers(num3, num1));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Test (expected=Exception.class)
	public void divByZero() throws Exception {
		nc.divideNumbers(num1, 0);
	}
	

}
