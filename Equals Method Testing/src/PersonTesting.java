import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTesting {

	@Test
	public void testComparePersonWithDefaultMethod() {
	PersonV2 p1 = new PersonV2(9);
	PersonV2 p2 = new PersonV2(9);
	
	assertFalse(p1.equals(p2));
	}

	
	@Test
	public void testComparePersonWithAdjustedMethod() {
		Person p1 = new Person(9);
		Person p2 = new Person(9);
		
		assertTrue(p1.equals(p2));
	}
}
