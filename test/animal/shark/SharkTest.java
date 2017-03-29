package animal.shark;

import junit.framework.TestCase;
import pair.Pair;

import java.util.HashSet;

/**
 * @author Andika Kusuma
 */
public class SharkTest extends TestCase {
    public void testGetId() throws Exception {
        Shark t = new Shark(new Pair());
        assert (t.GetId().equals("SHK"));
    }

    public void testGetWeight() throws Exception {
        Shark t = new Shark(new Pair());
        assert (t.GetWeight() == 771);
        t = new Shark(750, new Pair());
        assert (t.GetWeight() == 750);
    }

    public void testGetEat() throws Exception {
        Shark t = new Shark(new Pair());
        assert (t.GetEat() == 0.5);
    }

    public void testGetPos() throws Exception {
        Shark t = new Shark(new Pair());
        assert (t.GetPos().Equals(new Pair()));
    }

    public void testGetType() throws Exception {
        Shark t = new Shark(new Pair());
        assert (t.GetType() == 'K');
    }

    public void testGetLegend() throws Exception {
        Shark t = new Shark(new Pair());
        assert (t.GetLegend() == '7');
    }

    public void testGetHabitat() throws Exception {
        Shark t = new Shark(new Pair());
        HashSet<Character> habitat = new HashSet<Character>();
        habitat.add(new Character('W'));
        assert (t.GetHabitat().equals(habitat));
    }

    public void testGetCompatible() throws Exception {
        Shark t = new Shark(new Pair());
        HashSet<String> compatible = new HashSet<String>();
        compatible.add(new String("SHK"));
        compatible.add(new String("WHL"));
        assert (t.GetCompatible().equals(compatible));
    }

    public void testMove() throws Exception {
        Shark t = new Shark(new Pair());
        t.Move(0);
        assert (t.GetPos().Equals(new Pair(-1, 0)));
        t.Move(1);
        assert (t.GetPos().Equals(new Pair(-1, -1)));
        t.Move(2);
        assert (t.GetPos().Equals(new Pair(-1, 0)));
        t.Move(3);
        assert (t.GetPos().Equals(new Pair(0, 0)));
    }

}