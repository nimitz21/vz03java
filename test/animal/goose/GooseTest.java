package animal.goose;

import junit.framework.TestCase;
import pair.Pair;

import java.util.HashSet;

/**
 * @author Andika Kusuma
 */
public class GooseTest extends TestCase {
    public void testGetId() throws Exception {
        Goose g = new Goose(new Pair());
        assert (g.GetId().equals("GSE"));
    }

    public void testGetWeight() throws Exception {
        Goose g = new Goose(new Pair());
        assert (g.GetWeight() == 4);
        g = new Goose(4.1, new Pair());
        assert (g.GetWeight() == 4.1);
    }

    public void testGetEat() throws Exception {
        Goose g = new Goose(new Pair());
        assert (g.GetEat() == 0.3);
    }

    public void testGetPos() throws Exception {
        Goose g = new Goose(new Pair());
        assert (g.GetPos().Equals(new Pair()));
    }

    public void testGetType() throws Exception {
        Goose g = new Goose(new Pair());
        assert (g.GetType() == 'H');
    }

    public void testGetLegend() throws Exception {
        Goose g = new Goose(new Pair());
        assert (g.GetLegend() == '+');
    }

    public void testGetHabitat() throws Exception {
        Goose g = new Goose(new Pair());
        HashSet<Character> habitat = new HashSet<Character>();
        habitat.add(new Character('A'));
        habitat.add(new Character('W'));
        assert (g.GetHabitat().equals(habitat));
    }

    public void testGetCompatible() throws Exception {
        Goose g = new Goose(new Pair());
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
        compatible.add(new String("CLG"));
        compatible.add(new String("SGL"));
        assert (g.GetCompatible().equals(compatible));
    }

    public void testMove() throws Exception {
        Goose g = new Goose(new Pair());
        g.Move(0);
        assert (g.GetPos().Equals(new Pair(-1, 0)));
        g.Move(1);
        assert (g.GetPos().Equals(new Pair(-1, -1)));
        g.Move(2);
        assert (g.GetPos().Equals(new Pair(-1, 0)));
        g.Move(3);
        assert (g.GetPos().Equals(new Pair(0, 0)));
    }

}