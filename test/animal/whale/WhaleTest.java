package animal.whale;

import junit.framework.TestCase;
import pair.Pair;

import java.util.HashSet;

/**
 * @author Andika Kusuma
 */
public class WhaleTest extends TestCase {
    public void testGetId() throws Exception {
        Whale w = new Whale(new Pair());
        assert(w.GetId().equals("WHL"));
    }

    public void testGetWeight() throws Exception {
        Whale w = new Whale(new Pair());
        assert(w.GetWeight() == 40000);
        w = new Whale(42000, new Pair());
        assert(w.GetWeight() == 42000);
    }

    public void testGetEat() throws Exception {
        Whale w = new Whale(new Pair());
        assert(w.GetEat() == 0.3);
    }

    public void testGetPos() throws Exception {
        Whale w = new Whale(new Pair());
        assert(w.GetPos().Equals(new Pair()));
    }

    public void testGetType() throws Exception {
        Whale w = new Whale(new Pair());
        assert(w.GetType() == 'O');
    }

    public void testGetLegend() throws Exception {
        Whale w = new Whale(new Pair());
        assert(w.GetLegend() == '@');
    }

    public void testGetHabitat() throws Exception {
        Whale w = new Whale(new Pair());
        HashSet<Character> habitat = new HashSet<Character>();
        habitat.add(new Character('W'));
        assert(w.GetHabitat().equals(habitat));
    }

    public void testGetCompatible() throws Exception {
        Whale w = new Whale(new Pair());
        HashSet<String> compatible = new HashSet<String>();
        compatible.add(new String("WHL"));
        compatible.add(new String("SHK"));
        compatible.add(new String("MRE"));
        compatible.add(new String("DGG"));
        compatible.add(new String("PNG"));
        compatible.add(new String("HPP"));
        compatible.add(new String("TRL"));
        compatible.add(new String("DLP"));
        compatible.add(new String("PLC"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
        assert(w.GetCompatible().equals(compatible));
    }

    public void testMove() throws Exception {
        Whale w = new Whale(new Pair());
        w.Move(0);
        assert(w.GetPos().Equals(new Pair(-1, 0)));
        w.Move(1);
        assert(w.GetPos().Equals(new Pair(-1, -1)));
        w.Move(2);
        assert(w.GetPos().Equals(new Pair(-1, 0)));
        w.Move(3);
        assert(w.GetPos().Equals(new Pair(0, 0)));
    }

}