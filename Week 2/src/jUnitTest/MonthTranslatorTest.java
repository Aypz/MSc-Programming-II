/**
 * 
 */
package jUnitTest;

import static org.junit.Assert.*;
import jUnit.MonthTranslator;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Adam
 *
 */
public class MonthTranslatorTest {

	// Test data
	String one, two, three, four, unknown;
	MonthTranslator mt;

	@Before
	public void setUp() throws Exception {
		one = "Jan";
		two = "Feb";
		three = "Mar";
		four = "Apr";
		unknown = "Unknown";
		mt = new MonthTranslator();
	}

	@Test
	public void testTrans() {

		assertEquals(one, mt.trans(1));
		assertEquals(two, mt.trans(2));
		assertEquals(three, mt.trans(3));
		assertEquals(four, mt.trans(4));
		assertEquals(unknown, mt.trans(-1));

	}

}
