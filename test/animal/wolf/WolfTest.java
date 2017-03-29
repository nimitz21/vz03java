package animal.wolf;

import junit.framework.TestCase;
import pair.Pair;

import java.util.HashSet;

/**
 * @author Andika Kusuma
 */
public class WolfTest extends TestCase {
    public void testGetId() throws Exception {
        Wolf w = new Wolf(new Pair());
        assert(w.GetId().equals("WF"));
    }

    public void testGetWeight() throws Exception {
        Wolf w = new Wolf(new Pair());
        assert(w.GetWeight() == 45);
        w = new Wolf(1, new Pair());
        assert(w.GetWeight() == 1);
    }

    public void testGetEat() throws Exception {
        Wolf w = new Wolf(new Pair());
        assert(w.GetEat() == 0.2);
    }

    public void testGetPos() throws Exception {
        Wolf w = new Wolf(new Pair());
        assert(w.GetPos().Equals(new Pair()));
    }

    public void testGetType() throws Exception {
        Wolf w = new Wolf(new Pair());
        assert(w.GetType() == 'K');
    }

    public void testGetLegend() throws Exception {
        Wolf w = new Wolf(new Pair());
        assert(w.GetLegend() == '1');
    }

    public void testGetHabitat() throws Exception {
        Wolf w = new Wolf(new Pair());
        HashSet<Character> habitat = new HashSet<Character>();
        habitat.add(new Character('L'));
        assert(w.GetHabitat().equals(habitat));
    }

    public void testGetCompatible() throws Exception {
        Wolf w = new Wolf(new Pair());
        HashSet<String> compatible = new HashSet<String>();
        compatible.add(new String("WF"));
        compatible.add(new String("ELP"));
        compatible.add(new String("HPP"));
        assert(w.GetCompatible().equals(compatible));
    }

    public void testMove() throws Exception {
        Wolf w = new Wolf(new Pair());
        w.Move(0);
        assert(w.GetPos().Equals(new Pair(-1, 0)));
        w.Move(1);
        assert(w.GetPos().Equals(new Pair(-1, -1)));
        w.Move(2);
        assert(w.GetPos().Equals(new Pair(-1, 0)));
        w.Move(3);
        assert(w.GetPos().Equals(new Pair(0, 0)));
    }

}