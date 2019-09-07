import static org.junit.Assert.*;

import org.junit.Test;

public class CounterAutoTesting {

	@Test
	public void testFromMinValue() {
		Counter c = new Counter();
		c.setValue(Counter.MIN_INT);
		assertEquals(Counter.MIN_INT, c.getValue());
		try {
			c.decrease();
			fail("Value didnt decrease as expected");
		}
		catch(ValueTooSmallException e) {
		}
	}

	
	
	
	@Test
	public void testFromMaxValue() {
		Counter c = new Counter();
		c.setValue(Counter.MIN_INT);
		int j = Counter.MIN_INT;
	for(int i = Counter.MIN_INT; i < Counter.MAX_INT; i ++) {
		try {
			c.increase();
			j++;
		assertEquals(j , c.getValue());
	}
	catch(ValueTooLargeException e) {
		fail("Value shouldnt cause an exception");
	}
	}
	try {
		c.increase();
		fail("Value should be too high");
	}	
	catch(ValueTooLargeException e){}	
	}
	
	
	
	
	
	
	@Test
	public void testInBetweenValues() {
	Counter c = new Counter();
	c.setValue(Counter.MIN_INT);
	int j = Counter.MIN_INT;
	int k = Counter.MAX_INT;
	try {
	for(int i = Counter.MIN_INT; i < Counter.MAX_INT; i ++) {
		c.increase();
		j++;
		assertEquals(j, c.getValue());
		
	}
	for(int i = Counter.MAX_INT; i > Counter.MIN_INT; i --) {
		c.decrease();
		k --;
		assertEquals(k, c.getValue());
	}
	
	}
	
	catch(ValueTooLargeException e) {
		fail("Shouldnt be an excpetion");
	}
	catch(ValueTooSmallException e) {
		fail("Shouldnt be an excpetion");
	}	
		
	}
	
}
