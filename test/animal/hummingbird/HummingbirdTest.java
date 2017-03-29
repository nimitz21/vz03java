package animal.hummingbird;

import junit.framework.TestCase;
import pair.Pair;

import java.util.HashSet;

/**
 * @author Andika Kusuma
 */
public class HummingbirdTest extends TestCase {
    public void testGetId() throws Exception {
        Hummingbird h = new Hummingbird(new Pair());
        assert (h.GetId().equals("HMB"));
    }

    public void testGetWeight() throws Exception {
        Hummingbird h = new Hummingbird(new Pair());
        assert (h.GetWeight() == 0.0002);
        h = new Hummingbird(0.0001, new Pair());
        assert (h.GetWeight() == 0.0001);
    }

    public void testGetEat() throws Exception {
        Hummingbird h = new Hummingbird(new Pair());
        assert (h.GetEat() == 0.3);
    }

    public void testGetPos() throws Exception {
        Hummingbird h = new Hummingbird(new Pair());
        assert (h.GetPos().Equals(new Pair()));
    }

    public void testGetType() throws Exception {
        Hummingbird h = new Hummingbird(new Pair());
        assert (h.GetType() == 'H');
    }

    public void testGetLegend() throws Exception {
        Hummingbird h = new Hummingbird(new Pair());
        assert (h.GetLegend() == '%');
    }

    public void testGetHabitat() throws Exception {
        Hummingbird h = new Hummingbird(new Pair());
        HashSet<Character> habitat = new HashSet<Character>();
        habitat.add(new Character('A'));
        assert (h.GetHabitat().equals(habitat));
    }

    public void testGetCompatible() throws Exception {
        Hummingbird h = new Hummingbird(new Pair());
        HashSet<String> compatible = new HashSet<String>();
        compatible.add(new String("HMB"));
        compatible.add(new String("CKT"));
        compatible.add(new String("RBN"));
        compatible.add(new String("BT"));
        compatible.add(new String("PLC"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
        compatible.add(new String("CLG"));
        compatible.add(new String("SGL"));
        assert (h.GetCompatible().equals(compatible));
    }

    public void testMove() throws Exception {
        Hummingbird h = new Hummingbird(new Pair());
        h.Move(0);
        assert (h.GetPos().Equals(new Pair(-1, 0)));
        h.Move(1);
        assert (h.GetPos().Equals(new Pair(-1, -1)));
        h.Move(2);
        assert (h.GetPos().Equals(new Pair(-1, 0)));
        h.Move(3);
        assert (h.GetPos().Equals(new Pair(0, 0)));
    }

}