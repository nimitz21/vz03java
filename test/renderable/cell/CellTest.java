package renderable.cell;

import junit.framework.TestCase;
import renderable.cell.facilities.park.Park;
import renderable.cell.facilities.restaurant.Restaurant;
import renderable.cell.facilities.road.Road;
import renderable.cell.habitat.Habitat;

/**
 * @author Reinaldo Ignatius Wijaya
 */
public class CellTest extends TestCase {
	public void testGetInitSymbol() throws Exception {
		Cell c = new Habitat('L');
		assert(c.GetInitSymbol().equals('L'));
		c = new Park();
		assert(c.GetInitSymbol().equals('P'));
		c = new Restaurant();
		assert(c.GetInitSymbol().equals('R'));
		c = new Road('N');
		assert(c.GetInitSymbol().equals('N'));
	}

	public void testGetSymbol() throws Exception {
		Cell c = new Habitat('L');
		assert(c.GetSymbol().equals('L'));
		c = new Park();
		assert(c.GetSymbol().equals('P'));
		c = new Restaurant();
		assert(c.GetSymbol().equals('R'));
		c = new Road('N');
		assert(c.GetSymbol().equals('N'));
	}

	public void testSetInitSymbol() throws Exception {
		Cell c = new Habitat('L');
		c.SetInitSymbol('A');
		assert(c.GetInitSymbol().equals('A'));
	}

	public void testSetSymbol() throws Exception {
		Cell c = new Habitat('L');
		c.SetSymbol('1');
		assert(c.GetSymbol().equals('1'));
	}

}