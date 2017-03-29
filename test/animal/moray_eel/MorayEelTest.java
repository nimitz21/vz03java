package animal.moray_eel;

import junit.framework.TestCase;
import pair.Pair;

import java.util.HashSet;

/**
 * @author Andika Kusuma
 */
public class MorayEelTest extends TestCase {
    public void testGetId() throws Exception {
        MorayEel m = new MorayEel(new Pair());
        assert (m.GetId().equals("MRE"));
    }

    public void testGetWeight() throws Exception {
        MorayEel m = new MorayEel(new Pair());
        assert (m.GetWeight() == 13);
        m = new MorayEel(12, new Pair());
        assert (m.GetWeight() == 12);
    }

    public void testGetEat() throws Exception {
        MorayEel m = new MorayEel(new Pair());
        assert (m.GetEat() == 0.2);
    }

    public void testGetPos() throws Exception {
        MorayEel m = new MorayEel(new Pair());
        assert (m.GetPos().Equals(new Pair()));
    }

    public void testGetType() throws Exception {
        MorayEel m = new MorayEel(new Pair());
        assert (m.GetType() == 'K');
    }

    public void testGetLegend() throws Exception {
        MorayEel m = new MorayEel(new Pair());
        assert (m.GetLegend() == '8');
    }

    public void testGetHabitat() throws Exception {
        MorayEel m = new MorayEel(new Pair());
        HashSet<Character> habitat = new HashSet<Character>();
        habitat.add(new Character('W'));
        assert (m.GetHabitat().equals(habitat));
    }

    public void testGetCompatible() throws Exception {
        MorayEel m = new MorayEel(new Pair());
        HashSet<String> compatible = new HashSet<String>();
        compatible.add(new String("MRE"));
        compatible.add(new String("DGG"));
        compatible.add(new String("TRL"));
        compatible.add(new String("DLP"));
        compatible.add(new String("WHL"));
        compatible.add(new String("HPP"));
        assert (m.GetCompatible().equals(compatible));
    }

    public void testMove() throws Exception {
        MorayEel m = new MorayEel(new Pair());
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