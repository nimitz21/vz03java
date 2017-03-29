package animal.eagle;

import junit.framework.TestCase;
import pair.Pair;

import java.util.HashSet;

/**
 * @author Andika Kusuma
 */
public class EagleTest extends TestCase {
    public void testGetId() throws Exception {
        Eagle e = new Eagle(new Pair());
        assert (e.GetId().equals("EGL"));
    }

    public void testGetWeight() throws Exception {
        Eagle e = new Eagle(new Pair());
        assert (e.GetWeight() == 4);
        e = new Eagle(4, new Pair());
        assert (e.GetWeight() == 4);
    }

    public void testGetEat() throws Exception {
        Eagle e = new Eagle(new Pair());
        assert (e.GetEat() == 0.4);
    }

    public void testGetPos() throws Exception {
        Eagle e = new Eagle(new Pair());
        assert (e.GetPos().Equals(new Pair()));
    }

    public void testGetType() throws Exception {
        Eagle e = new Eagle(new Pair());
        assert (e.GetType() == 'K');
    }

    public void testGetLegend() throws Exception {
        Eagle e = new Eagle(new Pair());
        assert (e.GetLegend() == '#');
    }

    public void testGetHabitat() throws Exception {
        Eagle e = new Eagle(new Pair());
        HashSet<Character> habitat = new HashSet<Character>();
        habitat.add(new Character('A'));
        assert (e.GetHabitat().equals(habitat));
    }

    public void testGetCompatible() throws Exception {
        Eagle e = new Eagle(new Pair());
        HashSet<String> compatible = new HashSet<String>();
        compatible.add(new String("EGL"));
        compatible.add(new String("OW"));
        compatible.add(new String("PLC"));
        assert (e.GetCompatible().equals(compatible));
    }

    public void testMove() throws Exception {
        Eagle e = new Eagle(new Pair());
        e.Move(0);
        assert (e.GetPos().Equals(new Pair(-1, 0)));
        e.Move(1);
        assert (e.GetPos().Equals(new Pair(-1, -1)));
        e.Move(2);
        assert (e.GetPos().Equals(new Pair(-1, 0)));
        e.Move(3);
        assert (e.GetPos().Equals(new Pair(0, 0)));
    }

}