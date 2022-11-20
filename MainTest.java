/**
 * 
 */
package Students;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Patelia
 *
 */
public class MainTest {

	/**
	 * Test method for {@link Students.Main#getAverage(double[], int)}.
	 */
	@Test
	public void testGetAverage() {

		double[] nums2 = new double[]{25, 45, 50};
		double result = Main.getAverage(nums2, 3);
		assertTrue(result == 40);
	}
}
