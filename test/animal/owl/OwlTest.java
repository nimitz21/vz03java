package animal.owl;

import junit.framework.TestCase;
import pair.Pair;

import java.util.HashSet;

/**
 * @author Andika Kusuma
 */
public class OwlTest extends TestCase {
    public void testGetId() throws Exception {
        Owl o = new Owl(new Pair());
        assert (o.GetId().equals("OW"));
    }

    public void testGetWeight() throws Exception {
        Owl o = new Owl(new Pair());
        assert (o.GetWeight() == 2);
        o = new Owl(1, new Pair());
        assert (o.GetWeight() == 1);
    }

    public void testGetEat() throws Exception {
        Owl o = new Owl(new Pair());
        assert (o.GetEat() == 0.3);
    }

    public void testGetPos() throws Exception {
        Owl o = new Owl(new Pair());
        assert (o.GetPos().Equals(new Pair()));
    }

    public void testGetType() throws Exception {
        Owl o = new Owl(new Pair());
        assert (o.GetType() == 'K');
    }

    public void testGetLegend() throws Exception {
        Owl o = new Owl(new Pair());
        assert (o.GetLegend() == '$');
    }

    public void testGetHabitat() throws Exception {
        Owl o = new Owl(new Pair());
        HashSet<Character> habitat = new HashSet<Character>();
        habitat.add(new Character('A'));
        assert (o.GetHabitat().equals(habitat));
    }

    public void testGetCompatible() throws Exception {
        Owl o = new Owl(new Pair());
        HashSet<String> compatible = new HashSet<String>();
        compatible.add(new String("EGL"));
        compatible.add(new String("OW"));
        compatible.add(new String("PLC"));
        compatible.add(new String("DRL"));
        assert (o.GetCompatible().equals(compatible));
    }

    public void testMove() throws Exception {
        Owl o = new Owl(new Pair());
        o.Move(0);
        assert (o.GetPos().Equals(new Pair(-1, 0)));
        o.Move(1);
        assert (o.GetPos().Equals(new Pair(-1, -1)));
        o.Move(2);
        assert (o.GetPos().Equals(new Pair(-1, 0)));
        o.Move(3);
        assert (o.GetPos().Equals(new Pair(0, 0)));
    }

}