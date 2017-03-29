package animal.zebra;


import junit.framework.TestCase;
import pair.Pair;

import java.util.HashSet;

/**
 * @author Andika Kusuma
 */
public class ZebraTest extends TestCase {
    public void testGetId() throws Exception {
        Zebra z = new Zebra(new Pair());
        assert(z.GetId().equals("ZBR"));
    }

    public void testGetWeight() throws Exception {
        Zebra z = new Zebra(new Pair());
        assert(z.GetWeight() == 226);
        z = new Zebra(1, new Pair());
        assert(z.GetWeight() == 1);
    }

    public void testGetEat() throws Exception {
        Zebra z = new Zebra(new Pair());
        assert(z.GetEat() == 0.3);
    }

    public void testGetPos() throws Exception {
        Zebra z = new Zebra(new Pair());
        assert(z.GetPos().Equals(new Pair()));
    }

    public void testGetType() throws Exception {
        Zebra z = new Zebra(new Pair());
        assert(z.GetType() == 'H');
    }

    public void testGetLegend() throws Exception {
        Zebra z = new Zebra(new Pair());
        assert(z.GetLegend() == '3');
    }

    public void testGetHabitat() throws Exception {
        Zebra z = new Zebra(new Pair());
        HashSet<Character> habitat = new HashSet<Character>();
        habitat.add(new Character('L'));
        assert(z.GetHabitat().equals(habitat));
    }

    public void testGetCompatible() throws Exception {
        Zebra z = new Zebra(new Pair());
        HashSet<String> compatible = new HashSet<String>();
        compatible.add(new String("ZBR"));
        compatible.add(new String("ELP"));
        compatible.add(new String("MCQ"));
        compatible.add(new String("HG"));
        compatible.add(new String("PNG"));
        compatible.add(new String("HPP"));
        compatible.add(new String("DRL"));
        compatible.add(new String("CLG"));
        compatible.add(new String("SGL"));
        assert(z.GetCompatible().equals(compatible));
    }

    public void testMove() throws Exception {
        Zebra z = new Zebra(new Pair());
        z.Move(0);
        assert(z.GetPos().Equals(new Pair(-1, 0)));
        z.Move(1);
        assert(z.GetPos().Equals(new Pair(-1, -1)));
        z.Move(2);
        assert(z.GetPos().Equals(new Pair(-1, 0)));
        z.Move(3);
        assert(z.GetPos().Equals(new Pair(0, 0)));
    }

}