package animal.penguin;

import junit.framework.TestCase;
import pair.Pair;

import java.util.HashSet;

/**
 * @author Andika Kusuma
 */
public class PenguinTest extends TestCase {
    public void testGetId() throws Exception {
        Penguin p = new Penguin(new Pair());
        assert (p.GetId().equals("PNG"));
    }

    public void testGetWeight() throws Exception {
        Penguin p = new Penguin(new Pair());
        assert (p.GetWeight() == 22);
        p = new Penguin(20, new Pair());
        assert (p.GetWeight() == 20);
    }

    public void testGetEat() throws Exception {
        Penguin p = new Penguin(new Pair());
        assert (p.GetEat() == 0.3);
    }

    public void testGetPos() throws Exception {
        Penguin p = new Penguin(new Pair());
        assert (p.GetPos().Equals(new Pair()));
    }

    public void testGetType() throws Exception {
        Penguin p = new Penguin(new Pair());
        assert (p.GetType() == 'K');
    }

    public void testGetLegend() throws Exception {
        Penguin p = new Penguin(new Pair());
        assert (p.GetLegend() == '(');
    }

    public void testGetHabitat() throws Exception {
        Penguin p = new Penguin(new Pair());
        HashSet<Character> habitat = new HashSet<Character>();
        habitat.add(new Character('L'));
        habitat.add(new Character('W'));
        assert (p.GetHabitat().equals(habitat));
    }

    public void testGetCompatible() throws Exception {
        Penguin p = new Penguin(new Pair());
        HashSet<String> compatible = new HashSet<String>();
        compatible.add(new String("ZBR"));
        compatible.add(new String("ELP"));
        compatible.add(new String("PNG"));
        compatible.add(new String("HPP"));
        compatible.add(new String("DRL"));
        compatible.add(new String("CLG"));
        compatible.add(new String("SGL"));
        compatible.add(new String("TRL"));
        compatible.add(new String("DGG"));
        compatible.add(new String("DLP"));
        compatible.add(new String("WHL"));
        compatible.add(new String("PLC"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
        assert (p.GetCompatible().equals(compatible));
    }

    public void testMove() throws Exception {
        Penguin p = new Penguin(new Pair());
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