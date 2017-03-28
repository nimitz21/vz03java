package animal.goose;

import animal.Animal;
import pair.Pair;
import sun.security.krb5.internal.crypto.Des;

/**
 * Created by asuspc on 3/28/2017.
 */
public class Goose extends Animal {
    public Goose(double _weight, Pair _position) {
        super("GSE", ++goose_nb,'+', _weight, 0.4, 'H', _position);
<<<<<<< HEAD
        habitat.add(new Character('W'));
        habitat.add(new Character('A'));
        compatible.add(new String("MRE"));
        compatible.add(new String("DGG"));
        compatible.add(new String("TRL"));
        compatible.add(new String("DLP"));
        compatible.add(new String("WHL"));
        compatible.add(new String("PNG"));
        compatible.add(new String("HPP"));
        compatible.add(new String("PLC"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
        compatible.add(new String("HMB"));
        compatible.add(new String("CKT"));
        compatible.add(new String("RBN"));
        compatible.add(new String("BT"));
        compatible.add(new String("CLG"));
        compatible.add(new String("SGL"));
    }
    public Goose(Pair _position) {
        super("GSE", ++goose_nb,'+', 4, 0.4, 'H', _position);
        habitat.add(new Character('W'));
        habitat.add(new Character('A'));
        compatible.add(new String("MRE"));
        compatible.add(new String("DGG"));
        compatible.add(new String("TRL"));
        compatible.add(new String("DLP"));
        compatible.add(new String("WHL"));
        compatible.add(new String("PNG"));
        compatible.add(new String("HPP"));
        compatible.add(new String("PLC"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
        compatible.add(new String("HMB"));
        compatible.add(new String("CKT"));
        compatible.add(new String("RBN"));
        compatible.add(new String("BT"));
        compatible.add(new String("CLG"));
        compatible.add(new String("SGL"));
=======
        habitat.add('W');
        habitat.add('A');
        compatible.add("MRE");
        compatible.add("DGG");
        compatible.add("TRL");
        compatible.add("DLP");
        compatible.add("WHL");
        compatible.add("PNG");
        compatible.add("HPP");
        compatible.add("PLC");
        compatible.add("GSE");
        compatible.add("CRN");
        compatible.add("HMB");
        compatible.add("CKT");
        compatible.add("RBN");
        compatible.add("BT");
        compatible.add("CLG");
        compatible.add("SGL");
    }
    public Goose(Pair _position) {
        super("GSE", ++goose_nb,'+', 4, 0.4, 'H', _position);
        habitat.add('W');
        habitat.add('A');
        compatible.add("MRE");
        compatible.add("DGG");
        compatible.add("TRL");
        compatible.add("DLP");
        compatible.add("WHL");
        compatible.add("PNG");
        compatible.add("HPP");
        compatible.add("PLC");
        compatible.add("GSE");
        compatible.add("CRN");
        compatible.add("HMB");
        compatible.add("CKT");
        compatible.add("RBN");
        compatible.add("BT");
        compatible.add("CLG");
        compatible.add("SGL");
>>>>>>> 141da59f18c22da035a8ba63889ffaa155bf59b1
    }
    public final void Act() {
        System.out.print(id+"-");
        if (number < 10) {
            System.out.print("0");
        }
        System.out.print(number+": ");
        System.out.println("*quack*");
    }
    public final void Interact() {
        Description("goose");
        Act();
    }
    private static int goose_nb;
}
