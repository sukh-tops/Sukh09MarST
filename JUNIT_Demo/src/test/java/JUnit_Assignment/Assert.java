package JUnit_Assignment;

import static org.junit.Assert.*;

import org.junit.Test;

public class Assert {
	
	@Test
	public void testAddition() {
//		Addition a = new Addition();
//		int actual = a.add(250,450);
//		int expected = 600;
//		assertEquals(expected,actual);
//		assertTrue(false);
//		assertNull(null);
		
		int x[]= {50,60,70,80,90};
		int y[]= {50,60,70,80,90};
		assertArrayEquals(x, y);
  }
}