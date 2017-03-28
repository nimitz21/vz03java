package pair;

import junit.framework.TestCase;

/**
 * @author Reinaldo Ignatius Wijaya
 */
public class PairTest extends TestCase {
	public void testEquals() throws Exception {
		Pair p1 = new Pair();
		Pair p2 = new Pair();
		assert(p1.Equals(p2));
	}

}