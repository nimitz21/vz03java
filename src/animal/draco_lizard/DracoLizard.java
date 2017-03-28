package animal.draco_lizard;

import animal.Animal;
import pair.Pair;

/**
 * Created by asuspc on 3/28/2017.
 */
public class DracoLizard extends Animal {
    public DracoLizard(double _weight, Pair _position) {
        super("DRL", ++draco_lizard_nb,'=', _weight, 0.4, 'K', _position);
        habitat.add(new Character('L'));
        habitat.add(new Character('A'));
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
    }
    public DracoLizard(Pair _position) {
        super("DRL", ++draco_lizard_nb,'=', 0.2, 0.4, 'K', _position);
        habitat.add(new Character('L'));
        habitat.add(new Character('A'));
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
    }
    public final void Act() {
        System.out.print(id+"-");
        if (number < 10) {
            System.out.print("0");
        }
        System.out.print(number+": ");
        System.out.println("*jump*");
    }
    public final void Interact() {
        Description("draco lizard");
        Act();
    }
    private static int draco_lizard_nb;
}
