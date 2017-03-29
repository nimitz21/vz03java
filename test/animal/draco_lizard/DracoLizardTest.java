package animal.draco_lizard;

import junit.framework.TestCase;
import pair.Pair;

import java.util.HashSet;

/**
 * @author Andika Kusuma
 */
public class DracoLizardTest extends TestCase {
    public void testGetId() throws Exception {
        DracoLizard d = new DracoLizard(new Pair());
        assert (d.GetId().equals("DRL"));
    }

    public void testGetWeight() throws Exception {
        DracoLizard d = new DracoLizard(new Pair());
        assert (d.GetWeight() == 0.2);
        d = new DracoLizard(0.1, new Pair());
        assert (d.GetWeight() == 0.1);
    }

    public void testGetEat() throws Exception {
        DracoLizard d = new DracoLizard(new Pair());
        assert (d.GetEat() == 0.2);
    }

    public void testGetPos() throws Exception {
        DracoLizard d = new DracoLizard(new Pair());
        assert (d.GetPos().Equals(new Pair()));
    }

    public void testGetType() throws Exception {
        DracoLizard d = new DracoLizard(new Pair());
        assert (d.GetType() == 'K');
    }

    public void testGetLegend() throws Exception {
        DracoLizard d = new DracoLizard(new Pair());
        assert (d.GetLegend() == '=');
    }

    public void testGetHabitat() throws Exception {
        DracoLizard d = new DracoLizard(new Pair());
        HashSet<Character> habitat = new HashSet<Character>();
        habitat.add(new Character('A'));
        habitat.add(new Character('L'));
        assert (d.GetHabitat().equals(habitat));
    }

    public void testGetCompatible() throws Exception {
        DracoLizard d = new DracoLizard(new Pair());
        HashSet<String> compatible = new HashSet<String>();
        compatible.add(new String("ZBR"));
        compatible.add(new String("MCQ"));
        compatible.add(new String("HG"));
        compatible.add(new String("PNG"));
        compatible.add(new String("DRL"));
        compatible.add(new String("CLG"));
        compatible.add(new String("SGL"));
        compatible.add(new String("OW"));
        compatible.add(new String("RBN"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
        assert (d.GetCompatible().equals(compatible));
    }

    public void testMove() throws Exception {
        DracoLizard d = new DracoLizard(new Pair());
        d.Move(0);
        assert (d.GetPos().Equals(new Pair(-1, 0)));
        d.Move(1);
        assert (d.GetPos().Equals(new Pair(-1, -1)));
        d.Move(2);
        assert (d.GetPos().Equals(new Pair(-1, 0)));
        d.Move(3);
        assert (d.GetPos().Equals(new Pair(0, 0)));
    }

}