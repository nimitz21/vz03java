package renderable.cell.habitat;

import junit.framework.TestCase;

/**
 * @author Reinaldo Ignatius Wijaya
 */
public class HabitatTest extends TestCase {
	public void testToggleSekat() throws Exception {
		Habitat h = new Habitat('L');
		h.ToggleSekat(0);
		h.ToggleSekat(1);
		h.ToggleSekat(2);
		h.ToggleSekat(3);
		assert(h.GetSekat(0) == true);
		assert(h.GetSekat(1) == true);
		assert(h.GetSekat(2) == true);
		assert(h.GetSekat(3) == true);
	}

	public void testGetSekat() throws Exception {
		Habitat h = new Habitat('L');
		assert(h.GetSekat(0) == false);
		assert(h.GetSekat(1) == false);
		assert(h.GetSekat(2) == false);
		assert(h.GetSekat(3) == false);
	}

}