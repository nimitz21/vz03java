package animal.pelican;

import junit.framework.TestCase;
import pair.Pair;

import java.util.HashSet;

/**
 * @author Andika Kusuma
 */
public class PelicanTest extends TestCase {
    public void testGetId() throws Exception {
        Pelican p = new Pelican(new Pair());
        assert (p.GetId().equals("PLC"));
    }

    public void testGetWeight() throws Exception {
        Pelican p = new Pelican(new Pair());
        assert (p.GetWeight() == 7);
        p = new Pelican(6, new Pair());
        assert (p.GetWeight() == 6);
    }

    public void testGetEat() throws Exception {
        Pelican p = new Pelican(new Pair());
        assert (p.GetEat() == 0.3);
    }

    public void testGetPos() throws Exception {
        Pelican p = new Pelican(new Pair());
        assert (p.GetPos().Equals(new Pair()));
    }

    public void testGetType() throws Exception {
        Pelican p = new Pelican(new Pair());
        assert (p.GetType() == 'K');
    }

    public void testGetLegend() throws Exception {
        Pelican p = new Pelican(new Pair());
        assert (p.GetLegend() == '`');
    }

    public void testGetHabitat() throws Exception {
        Pelican p = new Pelican(new Pair());
        HashSet<Character> habitat = new HashSet<Character>();
        habitat.add(new Character('A'));
        habitat.add(new Character('W'));
        assert (p.GetHabitat().equals(habitat));
    }

    public void testGetCompatible() throws Exception {
        Pelican p = new Pelican(new Pair());
        HashSet<String> compatible = new HashSet<String>();
        compatible.add(new String("WHL"));
        compatible.add(new String("MRE"));
        compatible.add(new String("DGG"));
        compatible.add(new String("PNG"));
        compatible.add(new String("HPP"));
        compatible.add(new String("TRL"));
        compatible.add(new String("DLP"));
        compatible.add(new String("PLC"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
        compatible.add(new String("HMB"));
        compatible.add(new String("CKT"));
        compatible.add(new String("RBN"));
        compatible.add(new String("BT"));
        compatible.add(new String("CLG"));
        compatible.add(new String("EGL"));
        compatible.add(new String("SGL"));
        compatible.add(new String("CLG"));
        assert (p.GetCompatible().equals(compatible));
    }

    public void testMove() throws Exception {
        Pelican p = new Pelican(new Pair());
        p.Move(0);
        assert (p.GetPos().Equals(new Pair(-1, 0)));
        p.Move(1);
        assert (p.GetPos().Equals(new Pair(-1, -1)));
        p.Move(2);
        assert (p.GetPos().Equals(new Pair(-1, 0)));
        p.Move(3);
        assert (p.GetPos().Equals(new Pair(0, 0)));
    }

}