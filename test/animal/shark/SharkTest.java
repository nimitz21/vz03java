package animal.shark;

import junit.framework.TestCase;
import pair.Pair;

import java.util.HashSet;

/**
 * @author Andika Kusuma
 */
public class SharkTest extends TestCase {
    public void testGetId() throws Exception {
        Shark s = new Shark(new Pair());
        assert (s.GetId().equals("SHK"));
    }

    public void testGetWeight() throws Exception {
        Shark s = new Shark(new Pair());
        assert (s.GetWeight() == 771);
        s = new Shark(750, new Pair());
        assert (s.GetWeight() == 750);
    }

    public void testGetEat() throws Exception {
        Shark s = new Shark(new Pair());
        assert (s.GetEat() == 0.5);
    }

    public void testGetPos() throws Exception {
        Shark s = new Shark(new Pair());
        assert (s.GetPos().Equals(new Pair()));
    }

    public void testGetType() throws Exception {
        Shark s = new Shark(new Pair());
        assert (s.GetType() == 'K');
    }

    public void testGetLegend() throws Exception {
        Shark s = new Shark(new Pair());
        assert (s.GetLegend() == '7');
    }

    public void testGetHabitat() throws Exception {
        Shark s = new Shark(new Pair());
        HashSet<Character> habitat = new HashSet<Character>();
        habitat.add(new Character('W'));
        assert (s.GetHabitat().equals(habitat));
    }

    public void testGetCompatible() throws Exception {
        Shark s = new Shark(new Pair());
        HashSet<String> compatible = new HashSet<String>();
        compatible.add(new String("SHK"));
        compatible.add(new String("WHL"));
        assert (s.GetCompatible().equals(compatible));
    }

    public void testMove() throws Exception {
        Shark s = new Shark(new Pair());
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