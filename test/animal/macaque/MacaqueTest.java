package animal.macaque;

import junit.framework.TestCase;
import pair.Pair;

import java.util.HashSet;

/**
 * @author Andika Kusuma
 */
public class MacaqueTest extends TestCase {
    public void testGetId() throws Exception {
        Macaque m = new Macaque(new Pair());
        assert (m.GetId().equals("MCQ"));
    }

    public void testGetWeight() throws Exception {
        Macaque m = new Macaque(new Pair());
        assert (m.GetWeight() == 9);
        m = new Macaque(8, new Pair());
        assert (m.GetWeight() == 8);
    }

    public void testGetEat() throws Exception {
        Macaque m = new Macaque(new Pair());
        assert (m.GetEat() == 0.2);
    }

    public void testGetPos() throws Exception {
        Macaque m = new Macaque(new Pair());
        assert (m.GetPos().Equals(new Pair()));
    }

    public void testGetType() throws Exception {
        Macaque m = new Macaque(new Pair());
        assert (m.GetType() == 'O');
    }

    public void testGetLegend() throws Exception {
        Macaque m = new Macaque(new Pair());
        assert (m.GetLegend() == '5');
    }

    public void testGetHabitat() throws Exception {
        Macaque m = new Macaque(new Pair());
        HashSet<Character> habitat = new HashSet<Character>();
        habitat.add(new Character('L'));
        assert (m.GetHabitat().equals(habitat));
    }

    public void testGetCompatible() throws Exception {
        Macaque m = new Macaque(new Pair());
        HashSet<String> compatible = new HashSet<String>();
        compatible.add(new String("ZBR"));
        compatible.add(new String("ELP"));
        compatible.add(new String("MCQ"));
        compatible.add(new String("HG"));
        compatible.add(new String("HPP"));
        compatible.add(new String("DRL"));
        compatible.add(new String("CLG"));
        compatible.add(new String("SGL"));
        assert (m.GetCompatible().equals(compatible));
    }

    public void testMove() throws Exception {
        Macaque m = new Macaque(new Pair());
        m.Move(0);
        assert (m.GetPos().Equals(new Pair(-1, 0)));
        m.Move(1);
        assert (m.GetPos().Equals(new Pair(-1, -1)));
        m.Move(2);
        assert (m.GetPos().Equals(new Pair(-1, 0)));
        m.Move(3);
        assert (m.GetPos().Equals(new Pair(0, 0)));
    }

}