package renderable.cell.facilities.park;

import junit.framework.TestCase;

/**
 * @author Reinaldo Ignatius Wijaya
 */
public class ParkTest extends TestCase {
	public void testGetPlant() throws Exception {
		Park p = new Park();
		assert(p.GetPlant().equals(""));
		p = new Park("Bunga");
		assert(p.GetPlant().equals("Bunga"));
	}

	public void testSetPlant() throws Exception {
		Park p = new Park();
		p.SetPlant("Bunga");
		assert(p.GetPlant().equals("Bunga"));
	}

}