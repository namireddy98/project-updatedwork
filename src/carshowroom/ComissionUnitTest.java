package carshowroom;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComissionUnitTest {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		Sold_Cars sold = new Sold_Cars();
		double output = sold.Commission_Applied(10);
		assertEquals(10, output);
	}

}
