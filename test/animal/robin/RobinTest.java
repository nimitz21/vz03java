package animal.robin;

import junit.framework.TestCase;
import pair.Pair;

import java.util.HashSet;

/**
 * @author Andika Kusuma
 */
public class RobinTest extends TestCase {
    public void testGetId() throws Exception {
        Robin r = new Robin(new Pair());
        assert (r.GetId().equals("RBN"));
    }

    public void testGetWeight() throws Exception {
        Robin r = new Robin(new Pair());
        assert (r.GetWeight() == 0.06);
        r = new Robin(0.05, new Pair());
        assert (r.GetWeight() == 0.05);
    }

    public void testGetEat() throws Exception {
        Robin r = new Robin(new Pair());
        assert (r.GetEat() == 0.3);
    }

    public void testGetPos() throws Exception {
        Robin r = new Robin(new Pair());
        assert (r.GetPos().Equals(new Pair()));
    }

    public void testGetType() throws Exception {
        Robin r = new Robin(new Pair());
        assert (r.GetType() == 'O');
    }

    public void testGetLegend() throws Exception {
        Robin r = new Robin(new Pair());
        assert (r.GetLegend() == '&');
    }

    public void testGetHabitat() throws Exception {
        Robin r = new Robin(new Pair());
        HashSet<Character> habitat = new HashSet<Character>();
        habitat.add(new Character('A'));
        assert (r.GetHabitat().equals(habitat));
    }

    public void testGetCompatible() throws Exception {
        Robin r = new Robin(new Pair());
        HashSet<String> compatible = new HashSet<String>();
        compatible.add(new String("HMB"));
        compatible.add(new String("CKT"));
        compatible.add(new String("RBN"));
        compatible.add(new String("BT"));
        compatible.add(new String("PLC"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
        compatible.add(new String("DRL"));
        compatible.add(new String("CLG"));
        assert (r.GetCompatible().equals(compatible));
    }

    public void testMove() throws Exception {
        Robin r = new Robin(new Pair());
        r.Move(0);
        assert (r.GetPos().Equals(new Pair(-1, 0)));
        r.Move(1);
        assert (r.GetPos().Equals(new Pair(-1, -1)));
        r.Move(2);
        assert (r.GetPos().Equals(new Pair(-1, 0)));
        r.Move(3);
        assert (r.GetPos().Equals(new Pair(0, 0)));
    }

}