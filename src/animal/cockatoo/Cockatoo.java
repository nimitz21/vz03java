package animal.Cockatoo;

import animal.Animal;
import pair.Pair;

/**
 * Created by asuspc on 3/28/2017.
 */
public class Cockatoo extends Animal {
    public Cockatoo(double _weight, Pair _position) {
        super("CKT", ++cockatoo_nb,'^', _weight, 0.4,'H', _position);
        habitat.add(new Character('A'));
        compatible.add(new String("HMB"));
        compatible.add(new String("CKT"));
        compatible.add(new String("RBN"));
        compatible.add(new String("BT"));
        compatible.add(new String("PLC"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
        compatible.add(new String("CLG"));
    }
    public Cockatoo(Pair _position) {
        super("CKT", ++cockatoo_nb,'^', 0.09, 0.4, 'H', _position);
        habitat.add(new Character('A'));
        compatible.add(new String("HMB"));
        compatible.add(new String("CKT"));
        compatible.add(new String("RBN"));
        compatible.add(new String("BT"));
        compatible.add(new String("PLC"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
        compatible.add(new String("CLG"));
    }
    public final void Act() {
        System.out.print(id+"-");
        if (number < 10) {
            System.out.print("0");
        }
        System.out.print(number+": ");
        System.out.println("*talk*");
    }
    public final void Interact() {
        Description("cockatoo");
        Act();
    }
    private static int cockatoo_nb;
}

