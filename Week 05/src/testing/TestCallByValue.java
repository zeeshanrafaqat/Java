package testing;

import CallByValue.Point;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestCallByValue {

	@Test
	public void test_Point() {
		Point p1 = new Point(3, 4);

		System.out.println("Before: " + p1.getX());
		int x = 3;
		p1.moveHorizontally(x);
		System.out.println("After: " + p1.getX());

		assertTrue(x + 3 == p1.getX());
	}

}
