package animal.sugar_glider;

import junit.framework.TestCase;
import pair.Pair;

import java.util.HashSet;

/**
 * @author Andika Kusuma
 */
public class SugarGliderTest extends TestCase {
    public void testGetId() throws Exception {
        SugarGlider t = new SugarGlider(new Pair());
        assert(t.GetId().equals("SGL"));
    }

    public void testGetWeight() throws Exception {
        SugarGlider t = new SugarGlider(new Pair());
        assert(t.GetWeight() == 0.12);
        t = new SugarGlider(0.15, new Pair());
        assert(t.GetWeight() == 0.15);
    }

    public void testGetEat() throws Exception {
        SugarGlider t = new SugarGlider(new Pair());
        assert(t.GetEat() == 0.4);
    }

    public void testGetPos() throws Exception {
        SugarGlider t = new SugarGlider(new Pair());
        assert(t.GetPos().Equals(new Pair()));
    }

    public void testGetType() throws Exception {
        SugarGlider t = new SugarGlider(new Pair());
        assert(t.GetType() == 'O');
    }

    public void testGetLegend() throws Exception {
        SugarGlider t = new SugarGlider(new Pair());
        assert(t.GetLegend() == '>');
    }

    public void testGetHabitat() throws Exception {
        SugarGlider t = new SugarGlider(new Pair());
        HashSet<Character> habitat = new HashSet<Character>();
        habitat.add(new Character('L'));
        habitat.add(new Character('A'));
        assert(t.GetHabitat().equals(habitat));
    }

    public void testGetCompatible() throws Exception {
        SugarGlider t = new SugarGlider(new Pair());
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
        assert(t.GetCompatible().equals(compatible));
    }

    public void testMove() throws Exception {
        SugarGlider t = new SugarGlider(new Pair());
        t.Move(0);
        assert(t.GetPos().Equals(new Pair(-1, 0)));
        t.Move(1);
        assert(t.GetPos().Equals(new Pair(-1, -1)));
        t.Move(2);
        assert(t.GetPos().Equals(new Pair(-1, 0)));
        t.Move(3);
        assert(t.GetPos().Equals(new Pair(0, 0)));
    }

}