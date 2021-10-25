package carshowroom;

import static org.junit.Assert.*;

import org.junit.Test;

public class PriceUnitTest {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		Cars c = new Cars();
		double output = c.Total_Price_Of_Deal(5, 5);
		assertEquals(25, output);
	}
}
