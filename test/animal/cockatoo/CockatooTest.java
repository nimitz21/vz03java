package animal.cockatoo;

import junit.framework.TestCase;
import pair.Pair;

import java.util.HashSet;

/**
 * @author Andika Kusuma
 */
public class CockatooTest extends TestCase {
    public void testGetId() throws Exception {
        Cockatoo c = new Cockatoo(new Pair());
        assert (c.GetId().equals("CKT"));
    }

    public void testGetWeight() throws Exception {
        Cockatoo c = new Cockatoo(new Pair());
        assert (c.GetWeight() == 0.09);
        c = new Cockatoo(0.09, new Pair());
        assert (c.GetWeight() == 0.09);
    }

    public void testGetEat() throws Exception {
        Cockatoo c = new Cockatoo(new Pair());
        assert (c.GetEat() == 0.3);
    }

    public void testGetPos() throws Exception {
        Cockatoo c = new Cockatoo(new Pair());
        assert (c.GetPos().Equals(new Pair()));
    }

    public void testGetType() throws Exception {
        Cockatoo c = new Cockatoo(new Pair());
        assert (c.GetType() == 'H');
    }

    public void testGetLegend() throws Exception {
        Cockatoo c = new Cockatoo(new Pair());
        assert (c.GetLegend() == '^');
    }

    public void testGetHabitat() throws Exception {
        Cockatoo c = new Cockatoo(new Pair());
        HashSet<Character> habitat = new HashSet<Character>();
        habitat.add(new Character('A'));
        assert (c.GetHabitat().equals(habitat));
    }

    public void testGetCompatible() throws Exception {
        Cockatoo c = new Cockatoo(new Pair());
        HashSet<String> compatible = new HashSet<String>();
        compatible.add(new String("HMB"));
        compatible.add(new String("CKT"));
        compatible.add(new String("RBN"));
        compatible.add(new String("BT"));
        compatible.add(new String("PLC"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
        compatible.add(new String("CLG"));
        assert (c.GetCompatible().equals(compatible));
    }

    public void testMove() throws Exception {
        Cockatoo c = new Cockatoo(new Pair());
        c.Move(0);
        assert (c.GetPos().Equals(new Pair(-1, 0)));
        c.Move(1);
        assert (c.GetPos().Equals(new Pair(-1, -1)));
        c.Move(2);
        assert (c.GetPos().Equals(new Pair(-1, 0)));
        c.Move(3);
        assert (c.GetPos().Equals(new Pair(0, 0)));
    }

}