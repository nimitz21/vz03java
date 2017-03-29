package animal.lion;

import junit.framework.TestCase;
import pair.Pair;

import java.util.HashSet;

/**
 * @author Andika Kusuma
 */
public class LionTest extends TestCase {
    public void testGetId() throws Exception {
        Lion l = new Lion(new Pair());
        assert (l.GetId().equals("LI"));
    }

    public void testGetWeight() throws Exception {
        Lion l = new Lion(new Pair());
        assert (l.GetWeight() == 158);
        l = new Lion(157, new Pair());
        assert (l.GetWeight() == 157);
    }

    public void testGetEat() throws Exception {
        Lion l = new Lion(new Pair());
        assert (l.GetEat() == 0.5);
    }

    public void testGetPos() throws Exception {
        Lion l = new Lion(new Pair());
        assert (l.GetPos().Equals(new Pair()));
    }

    public void testGetType() throws Exception {
        Lion l = new Lion(new Pair());
        assert (l.GetType() == 'O');
    }

    public void testGetLegend() throws Exception {
        Lion l = new Lion(new Pair());
        assert (l.GetLegend() == '2');
    }

    public void testGetHabitat() throws Exception {
        Lion l = new Lion(new Pair());
        HashSet<Character> habitat = new HashSet<Character>();
        habitat.add(new Character('L'));
        assert (l.GetHabitat().equals(habitat));
    }

    public void testGetCompatible() throws Exception {
        Lion l = new Lion(new Pair());
        HashSet<String> compatible = new HashSet<String>();
        compatible.add(new String("LI"));
        assert (l.GetCompatible().equals(compatible));
    }

    public void testMove() throws Exception {
        Lion l = new Lion(new Pair());
        l.Move(0);
        assert (l.GetPos().Equals(new Pair(-1, 0)));
        l.Move(1);
        assert (l.GetPos().Equals(new Pair(-1, -1)));
        l.Move(2);
        assert (l.GetPos().Equals(new Pair(-1, 0)));
        l.Move(3);
        assert (l.GetPos().Equals(new Pair(0, 0)));
    }

}