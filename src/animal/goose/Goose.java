package animal.goose;

import animal.Animal;
import pair.Pair;
import sun.security.krb5.internal.crypto.Des;

/**
 * Created by asuspc on 3/28/2017.
 */
public class Goose extends Animal {
    public Goose(String _id,
                 int _number,
                 char _legend,
                 double _weight,
                 double _eat,
                 char _type,
                 Pair _position) {
        super("GSE", ++goose_nb,'+', _weight, food, 'H', _position);
        eat = food;
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
    public Goose(String _id,
                 int _number,
                 char _legend,
                 double _eat,
                 char _type,
                 Pair _position) {
        super("GSE", ++goose_nb,'+', 4, food, 'H', _position);
        eat = food;
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
    private final double food = 0.4;
}
