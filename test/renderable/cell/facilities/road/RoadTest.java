package renderable.cell.facilities.road;

import junit.framework.TestCase;

/**
 * @author Andika Kusuma
 */
public class RoadTest extends TestCase {
    public void testGetSymbol() throws Exception {
        Road p = new Road('r');
        assert (p.GetSymbol().equals('r'));
    }

    public void testGetInitSymbol() throws Exception {
        Road p = new Road('X');
        assert (p.GetInitSymbol().equals('X'));
    }
}