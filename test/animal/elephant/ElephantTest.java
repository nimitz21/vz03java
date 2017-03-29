package animal.elephant;

import junit.framework.TestCase;
import pair.Pair;

import java.util.HashSet;

/**
 * @author Andika Kusuma
 */
public class ElephantTest extends TestCase {
    public void testGetId() throws Exception {
        Elephant e = new Elephant(new Pair());
        assert (e.GetId().equals("ELP"));
    }

    public void testGetWeight() throws Exception {
        Elephant e = new Elephant(new Pair());
        assert (e.GetWeight() == 5000);
        e = new Elephant(5400, new Pair());
        assert (e.GetWeight() == 5400);
    }

    public void testGetEat() throws Exception {
        Elephant e = new Elephant(new Pair());
        assert (e.GetEat() == 0.7);
    }

    public void testGetPos() throws Exception {
        Elephant e = new Elephant(new Pair());
        assert (e.GetPos().Equals(new Pair()));
    }

    public void testGetType() throws Exception {
        Elephant e = new Elephant(new Pair());
        assert (e.GetType() == 'H');
    }

    public void testGetLegend() throws Exception {
        Elephant e = new Elephant(new Pair());
        assert (e.GetLegend() == '4');
    }

    public void testGetHabitat() throws Exception {
        Elephant e = new Elephant(new Pair());
        HashSet<Character> habitat = new HashSet<Character>();
        habitat.add(new Character('L'));
        assert (e.GetHabitat().equals(habitat));
    }

    public void testGetCompatible() throws Exception {
        Elephant e = new Elephant(new Pair());
        HashSet<String> compatible = new HashSet<String>();
        compatible.add(new String("WF"));
        compatible.add(new String("ZBR"));
        compatible.add(new String("ELP"));
        compatible.add(new String("MCQ"));
        compatible.add(new String("HG"));
        compatible.add(new String("PNG"));
        compatible.add(new String("HPP"));
        assert (e.GetCompatible().equals(compatible));
    }

    public void testMove() throws Exception {
        Elephant e = new Elephant(new Pair());
        e.Move(0);
        assert (e.GetPos().Equals(new Pair(-1, 0)));
        e.Move(1);
        assert (e.GetPos().Equals(new Pair(-1, -1)));
        e.Move(2);
        assert (e.GetPos().Equals(new Pair(-1, 0)));
        e.Move(3);
        assert (e.GetPos().Equals(new Pair(0, 0)));
    }

}