package renderable.cell.facilities.restaurant;

import junit.framework.TestCase;

/**
 * @author Reinaldo Ignatius Wijaya
 */
public class RestaurantTest extends TestCase {
	public void testGetFood() throws Exception {
		Restaurant r = new Restaurant();
		assert(r.GetFood().equals(""));
		r = new Restaurant("Makanan", false);
		assert(r.GetFood().equals("Makanan"));
	}

	public void testGetOpen() throws Exception {
		Restaurant r = new Restaurant();
		assert(!r.GetOpen());
		r = new Restaurant("", true);
		assert(r.GetOpen());
	}

	public void testSetFood() throws Exception {
		Restaurant r = new Restaurant();
		r.SetFood("Makanan");
		assert(r.GetFood().equals("Makanan"));
	}

	public void testToggleOpen() throws Exception {
		Restaurant r = new Restaurant();
		r.ToggleOpen();
		assert(r.GetOpen());
	}

}