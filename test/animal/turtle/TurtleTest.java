package animal.turtle;

import junit.framework.TestCase;
import pair.Pair;

import java.util.HashSet;

/**
 * @author Andika Kusuma
 */
public class TurtleTest extends TestCase {
    public void testGetId() throws Exception {
        Turtle t = new Turtle(new Pair());
        assert (t.GetId().equals("TRL"));
    }

    public void testGetWeight() throws Exception {
        Turtle t = new Turtle(new Pair());
        assert (t.GetWeight() == 453);
        t = new Turtle(400, new Pair());
        assert (t.GetWeight() == 400);
    }

    public void testGetEat() throws Exception {
        Turtle t = new Turtle(new Pair());
        assert (t.GetEat() == 0.3);
    }

    public void testGetPos() throws Exception {
        Turtle t = new Turtle(new Pair());
        assert (t.GetPos().Equals(new Pair()));
    }

    public void testGetType() throws Exception {
        Turtle t = new Turtle(new Pair());
        assert (t.GetType() == 'H');
    }

    public void testGetLegend() throws Exception {
        Turtle t = new Turtle(new Pair());
        assert (t.GetLegend() == '0');
    }

    public void testGetHabitat() throws Exception {
        Turtle t = new Turtle(new Pair());
        HashSet<Character> habitat = new HashSet<Character>();
        habitat.add(new Character('W'));
        assert (t.GetHabitat().equals(habitat));
    }

    public void testGetCompatible() throws Exception {
        Turtle t = new Turtle(new Pair());
        HashSet<String> compatible = new HashSet<String>();
        compatible.add(new String("WHL"));
        compatible.add(new String("MRE"));
        compatible.add(new String("DGG"));
        compatible.add(new String("PNG"));
        compatible.add(new String("HPP"));
        compatible.add(new String("TRL"));
        compatible.add(new String("DLP"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
        assert (t.GetCompatible().equals(compatible));
    }

    public void testMove() throws Exception {
        Turtle t = new Turtle(new Pair());
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