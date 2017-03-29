package animal.dugong;

import junit.framework.TestCase;
import pair.Pair;

import java.util.HashSet;

/**
 * @author Andika Kusuma
 */
public class DugongTest extends TestCase {
    public void testGetId() throws Exception {
        Dugong d = new Dugong(new Pair());
        assert (d.GetId().equals("DGG"));
    }

    public void testGetWeight() throws Exception {
        Dugong d = new Dugong(new Pair());
        assert (d.GetWeight() == 294);
        d = new Dugong(300, new Pair());
        assert (d.GetWeight() == 300);
    }

    public void testGetEat() throws Exception {
        Dugong d = new Dugong(new Pair());
        assert (d.GetEat() == 0.7);
    }

    public void testGetPos() throws Exception {
        Dugong d = new Dugong(new Pair());
        assert (d.GetPos().Equals(new Pair()));
    }

    public void testGetType() throws Exception {
        Dugong d = new Dugong(new Pair());
        assert (d.GetType() == 'K');
    }

    public void testGetLegend() throws Exception {
        Dugong d = new Dugong(new Pair());
        assert (d.GetLegend() == '9');
    }

    public void testGetHabitat() throws Exception {
        Dugong d = new Dugong(new Pair());
        HashSet<Character> habitat = new HashSet<Character>();
        habitat.add(new Character('W'));
        assert (d.GetHabitat().equals(habitat));
    }

    public void testGetCompatible() throws Exception {
        Dugong d = new Dugong(new Pair());
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
        assert (d.GetCompatible().equals(compatible));
    }

    public void testMove() throws Exception {
        Dugong d = new Dugong(new Pair());
        d.Move(0);
        assert (d.GetPos().Equals(new Pair(-1, 0)));
        d.Move(1);
        assert (d.GetPos().Equals(new Pair(-1, -1)));
        d.Move(2);
        assert (d.GetPos().Equals(new Pair(-1, 0)));
        d.Move(3);
        assert (d.GetPos().Equals(new Pair(0, 0)));
    }

}