package tddjunit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TddClassTest {

	@Test
	public void test() 
	{
		TddClass t = new TddClass();
		assertEquals("BAA",t.iWillCheck("AABAA"));
	}
}
