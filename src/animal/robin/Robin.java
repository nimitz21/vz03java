package animal.robin;

import animal.Animal;
import pair.Pair;

/**
 * Created by asuspc on 3/28/2017.
 */
public class Robin extends Animal {
    public Robin(Pair _position) {
        super("RBN", ++robin_nb,'&', 0.06, 0.4, 'O', _position);
        habitat.add(new Character('A'));
        compatible.add(new String("HMB"));
        compatible.add(new String("CKT"));
        compatible.add(new String("RBN"));
        compatible.add(new String("BT"));
        compatible.add(new String("PLC"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
        compatible.add(new String("CLG"));
        compatible.add(new String("DRL"));
    }
    public Robin(double _weight, Pair _position) {
        super("RBN", ++robin_nb,'&', 0.06, 0.4, 'O', _position);
        habitat.add(new Character('A'));
        compatible.add(new String("HMB"));
        compatible.add(new String("CKT"));
        compatible.add(new String("RBN"));
        compatible.add(new String("BT"));
        compatible.add(new String("PLC"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
        compatible.add(new String("CLG"));
        compatible.add(new String("DRL"));
    }
    public final void Act() {
        System.out.print(id+"-");
        if (number < 10) {
            System.out.print("0");
        }
        System.out.print(number+": ");
        System.out.println("*hoot*");
    }
    public final void Interact() {
        Description("robin");
        Act();
    }
    private static int robin_nb;
}
