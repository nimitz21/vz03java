package animal.hippopotamus;

import junit.framework.TestCase;
import pair.Pair;

import java.util.HashSet;

/**
 * @author Andika Kusuma
 */
public class HippopotamusTest extends TestCase {
    public void testGetId() throws Exception {
        Hippopotamus h = new Hippopotamus(new Pair());
        assert (h.GetId().equals("HPP"));
    }

    public void testGetWeight() throws Exception {
        Hippopotamus h = new Hippopotamus(new Pair());
        assert (h.GetWeight() == 1496);
        h = new Hippopotamus(1400, new Pair());
        assert (h.GetWeight() == 1400);
    }

    public void testGetEat() throws Exception {
        Hippopotamus h = new Hippopotamus(new Pair());
        assert (h.GetEat() == 0.65);
    }

    public void testGetPos() throws Exception {
        Hippopotamus h = new Hippopotamus(new Pair());
        assert (h.GetPos().Equals(new Pair()));
    }

    public void testGetType() throws Exception {
        Hippopotamus h = new Hippopotamus(new Pair());
        assert (h.GetType() == 'H');
    }

    public void testGetLegend() throws Exception {
        Hippopotamus h = new Hippopotamus(new Pair());
        assert (h.GetLegend() == ')');
    }

    public void testGetHabitat() throws Exception {
        Hippopotamus h = new Hippopotamus(new Pair());
        HashSet<Character> habitat = new HashSet<Character>();
        habitat.add(new Character('L'));
        habitat.add(new Character('W'));
        assert (h.GetHabitat().equals(habitat));
    }

    public void testGetCompatible() throws Exception {
        Hippopotamus h = new Hippopotamus(new Pair());
        HashSet<String> compatible = new HashSet<String>();
        compatible.add(new String("WF"));
        compatible.add(new String("ZBR"));
        compatible.add(new String("ELP"));
        compatible.add(new String("MCQ"));
        compatible.add(new String("HG"));
        compatible.add(new String("PNG"));
        compatible.add(new String("HPP"));
        compatible.add(new String("CLG"));
        compatible.add(new String("MRE"));
        compatible.add(new String("DGG"));
        compatible.add(new String("TRL"));
        compatible.add(new String("DLP"));
        compatible.add(new String("WHL"));
        compatible.add(new String("PLC"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
        assert (h.GetCompatible().equals(compatible));
    }

    public void testMove() throws Exception {
        Hippopotamus h = new Hippopotamus(new Pair());
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