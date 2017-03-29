package animal.hog;

import junit.framework.TestCase;
import pair.Pair;

import java.util.HashSet;

/**
 * @author Andika Kusuma
 */
public class HogTest extends TestCase {
    public void testGetId() throws Exception {
        Hog h = new Hog(new Pair());
        assert (h.GetId().equals("HG"));
    }

    public void testGetWeight() throws Exception {
        Hog h = new Hog(new Pair());
        assert (h.GetWeight() == 68);
        h = new Hog(67, new Pair());
        assert (h.GetWeight() == 67);
    }

    public void testGetEat() throws Exception {
        Hog h = new Hog(new Pair());
        assert (h.GetEat() == 0.2);
    }

    public void testGetPos() throws Exception {
        Hog h = new Hog(new Pair());
        assert (h.GetPos().Equals(new Pair()));
    }

    public void testGetType() throws Exception {
        Hog h = new Hog(new Pair());
        assert (h.GetType() == 'O');
    }

    public void testGetLegend() throws Exception {
        Hog h = new Hog(new Pair());
        assert (h.GetLegend() == '6');
    }

    public void testGetHabitat() throws Exception {
        Hog h = new Hog(new Pair());
        HashSet<Character> habitat = new HashSet<Character>();
        habitat.add(new Character('L'));
        assert (h.GetHabitat().equals(habitat));
    }

    public void testGetCompatible() throws Exception {
        Hog h = new Hog(new Pair());
        HashSet<String> compatible = new HashSet<String>();
        compatible.add(new String("ZBR"));
        compatible.add(new String("ELP"));
        compatible.add(new String("MCQ"));
        compatible.add(new String("HG"));
        compatible.add(new String("HPP"));
        assert (h.GetCompatible().equals(compatible));
    }

    public void testMove() throws Exception {
        Hog h = new Hog(new Pair());
        h.Move(0);
        assert (h.GetPos().Equals(new Pair(-1, 0)));
        h.Move(1);
        assert (h.GetPos().Equals(new Pair(-1, -1)));
        h.Move(2);
        assert (h.GetPos().Equals(new Pair(-1, 0)));
        h.Move(3);
        assert (h.GetPos().Equals(new Pair(0, 0)));
    }

}