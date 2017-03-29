package animal.sugar_glider;

import junit.framework.TestCase;
import pair.Pair;

import java.util.HashSet;

/**
 * @author Andika Kusuma
 */
public class SugarGliderTest extends TestCase {
    public void testGetId() throws Exception {
        SugarGlider s = new SugarGlider(new Pair());
        assert (s.GetId().equals("SGL"));
    }

    public void testGetWeight() throws Exception {
        SugarGlider s = new SugarGlider(new Pair());
        assert (s.GetWeight() == 0.12);
        s = new SugarGlider(0.15, new Pair());
        assert (s.GetWeight() == 0.15);
    }

    public void testGetEat() throws Exception {
        SugarGlider s = new SugarGlider(new Pair());
        assert (s.GetEat() == 0.4);
    }

    public void testGetPos() throws Exception {
        SugarGlider s = new SugarGlider(new Pair());
        assert (s.GetPos().Equals(new Pair()));
    }

    public void testGetType() throws Exception {
        SugarGlider s = new SugarGlider(new Pair());
        assert (s.GetType() == 'O');
    }

    public void testGetLegend() throws Exception {
        SugarGlider s = new SugarGlider(new Pair());
        assert (s.GetLegend() == '>');
    }

    public void testGetHabitat() throws Exception {
        SugarGlider s = new SugarGlider(new Pair());
        HashSet<Character> habitat = new HashSet<Character>();
        habitat.add(new Character('L'));
        habitat.add(new Character('A'));
        assert (s.GetHabitat().equals(habitat));
    }

    public void testGetCompatible() throws Exception {
        SugarGlider s = new SugarGlider(new Pair());
        HashSet<String> compatible = new HashSet<String>();
        compatible.add(new String("ZBR"));
        compatible.add(new String("HMB"));
        compatible.add(new String("MCQ"));
        compatible.add(new String("HG"));
        compatible.add(new String("PNG"));
        compatible.add(new String("GSE"));
        compatible.add(new String("DRL"));
        compatible.add(new String("CLG"));
        compatible.add(new String("SGL"));
        compatible.add(new String("CRN"));
        assert (s.GetCompatible().equals(compatible));
    }

    public void testMove() throws Exception {
        SugarGlider s = new SugarGlider(new Pair());
        s.Move(0);
        assert (s.GetPos().Equals(new Pair(-1, 0)));
        s.Move(1);
        assert (s.GetPos().Equals(new Pair(-1, -1)));
        s.Move(2);
        assert (s.GetPos().Equals(new Pair(-1, 0)));
        s.Move(3);
        assert (s.GetPos().Equals(new Pair(0, 0)));
    }

}