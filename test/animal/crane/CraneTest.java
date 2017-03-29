package animal.crane;

import junit.framework.TestCase;
import pair.Pair;

import java.util.HashSet;

/**
 * @author Andika Kusuma
 */
public class CraneTest extends TestCase {
    public void testGetId() throws Exception {
        Crane c = new Crane(new Pair());
        assert (c.GetId().equals("CRN"));
    }

    public void testGetWeight() throws Exception {
        Crane c = new Crane(new Pair());
        assert (c.GetWeight() == 2);
        c = new Crane(1.5, new Pair());
        assert (c.GetWeight() == 1.5);
    }

    public void testGetEat() throws Exception {
        Crane c = new Crane(new Pair());
        assert (c.GetEat() == 0.3);
    }

    public void testGetPos() throws Exception {
        Crane c = new Crane(new Pair());
        assert (c.GetPos().Equals(new Pair()));
    }

    public void testGetType() throws Exception {
        Crane c = new Crane(new Pair());
        assert (c.GetType() == 'K');
    }

    public void testGetLegend() throws Exception {
        Crane c = new Crane(new Pair());
        assert (c.GetLegend() == '$');
    }

    public void testGetHabitat() throws Exception {
        Crane c = new Crane(new Pair());
        HashSet<Character> habitat = new HashSet<Character>();
        habitat.add(new Character('A'));
        habitat.add(new Character('W'));
        assert (c.GetHabitat().equals(habitat));
    }

    public void testGetCompatible() throws Exception {
        Crane c = new Crane(new Pair());
        HashSet<String> compatible = new HashSet<String>();
        compatible.add(new String("MRE"));
        compatible.add(new String("DGG"));
        compatible.add(new String("TRL"));
        compatible.add(new String("DLP"));
        compatible.add(new String("WHL"));
        compatible.add(new String("PNG"));
        compatible.add(new String("HPP"));
        compatible.add(new String("PLC"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
        compatible.add(new String("HMB"));
        compatible.add(new String("CKT"));
        compatible.add(new String("RBN"));
        compatible.add(new String("BT"));
        compatible.add(new String("DRL"));
        compatible.add(new String("CLG"));
        compatible.add(new String("SGL"));
        assert (c.GetCompatible().equals(compatible));
    }

    public void testMove() throws Exception {
        Crane c = new Crane(new Pair());
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