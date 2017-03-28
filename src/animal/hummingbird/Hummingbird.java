package animal.hummingbird;

import animal.Animal;
import pair.Pair;

/**
 * Created by asuspc on 3/28/2017.
 */
public class Hummingbird extends Animal {
    public Hummingbird(Pair _position) {
        super("HMB", ++hummingbird_nb,'%', 0.0002, 0.4, 'H', _position);
        habitat.add(new Character('A'));
        compatible.add(new String("HMB"));
        compatible.add(new String("CKT"));
        compatible.add(new String("RBN"));
        compatible.add(new String("BT"));
        compatible.add(new String("PLC"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
        compatible.add(new String("CLG"));
        compatible.add(new String("SGL"));
    }
    public Hummingbird(double _weight, Pair _position) {
        super("HMB", ++hummingbird_nb,'%', _weight, 0.4, 'H', _position);
        habitat.add(new Character('A'));
        compatible.add(new String("HMB"));
        compatible.add(new String("CKT"));
        compatible.add(new String("RBN"));
        compatible.add(new String("BT"));
        compatible.add(new String("PLC"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
        compatible.add(new String("CLG"));
        compatible.add(new String("SGL"));
    }
    public final void Act() {
        System.out.print(id+"-");
        if (number < 10) {
            System.out.print("0");
        }
        System.out.print(number+": ");
        System.out.println("*hum*");
    }
    public final void Interact() {
        Description("hummingbird");
        Act();
    }
    private static int hummingbird_nb;
}
