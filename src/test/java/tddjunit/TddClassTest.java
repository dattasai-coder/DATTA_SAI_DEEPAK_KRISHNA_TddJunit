package tddjunit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TddClassTest {

	@Test
	public void test() 
	{
		TddClass t = new TddClass();
		assertEquals("BCD",t.iWillCheck("ABCD"));
		assertEquals("CD",t.iWillCheck("AACD"));
		assertEquals("BCD",t.iWillCheck("BACD"));
		assertEquals("BBAA",t.iWillCheck("BBAA"));
		assertEquals("BAA",t.iWillCheck("AABAA"));
	}
}
