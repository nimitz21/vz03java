package animal.colugo;

import junit.framework.TestCase;
import pair.Pair;

import java.util.HashSet;

/**
 * @author Andika Kusuma
 */
public class ColugoTest extends TestCase {
    public void testGetId() throws Exception {
        Colugo c = new Colugo(new Pair());
        assert (c.GetId().equals("CLG"));
    }

    public void testGetWeight() throws Exception {
        Colugo c = new Colugo(new Pair());
        assert (c.GetWeight() == 0.035);
        c = new Colugo(0.033, new Pair());
        assert (c.GetWeight() == 0.033);
    }

    public void testGetEat() throws Exception {
        Colugo c = new Colugo(new Pair());
        assert (c.GetEat() == 0.25);
    }

    public void testGetPos() throws Exception {
        Colugo c = new Colugo(new Pair());
        assert (c.GetPos().Equals(new Pair()));
    }

    public void testGetType() throws Exception {
        Colugo c = new Colugo(new Pair());
        assert (c.GetType() == 'H');
    }

    public void testGetLegend() throws Exception {
        Colugo c = new Colugo(new Pair());
        assert (c.GetLegend() == '<');
    }

    public void testGetHabitat() throws Exception {
        Colugo c = new Colugo(new Pair());
        HashSet<Character> habitat = new HashSet<Character>();
        habitat.add(new Character('L'));
        habitat.add(new Character('A'));
        assert (c.GetHabitat().equals(habitat));
    }

    public void testGetCompatible() throws Exception {
        Colugo c = new Colugo(new Pair());
        HashSet<String> compatible = new HashSet<String>();
        compatible.add(new String("ZBR"));
        compatible.add(new String("MCQ"));
        compatible.add(new String("HG"));
        compatible.add(new String("PNG"));
        compatible.add(new String("HPP"));
        compatible.add(new String("DRL"));
        compatible.add(new String("CLG"));
        compatible.add(new String("SGL"));
        compatible.add(new String("HMB"));
        compatible.add(new String("CKT"));
        compatible.add(new String("RBN"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
        assert (c.GetCompatible().equals(compatible));
    }

    public void testMove() throws Exception {
        Colugo c = new Colugo(new Pair());
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