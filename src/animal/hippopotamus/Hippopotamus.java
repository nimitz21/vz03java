package animal.hippopotamus;

import animal.Animal;
import pair.Pair;

/**
 * Created by asuspc on 3/28/2017.
 */
public class Hippopotamus extends Animal {
    public Hippopotamus(double _weight, Pair _position) {
        super("HPP", ++hippopotamus_nb,')', _weight, 0.4, 'H', _position);
        habitat.add('L');
        habitat.add('W');
        compatible.add("WF");
        compatible.add("ZBR");
        compatible.add("ELP");
        compatible.add("MCQ");
        compatible.add("HG");
        compatible.add("PNG");
        compatible.add("HPP");
        compatible.add("CLG");
        compatible.add("MRE");
        compatible.add("DGG");
        compatible.add("TRL");
        compatible.add("DLP");
        compatible.add("WHL");
        compatible.add("PLC");
        compatible.add("GSE");
        compatible.add("CRN");
    }
    public Hippopotamus(Pair _position) {
        super("HPP", ++hippopotamus_nb,')', 1496, 0.4, 'H', _position);
        habitat.add('L');
        habitat.add('W');
        compatible.add("WF");
        compatible.add("ZBR");
        compatible.add("ELP");
        compatible.add("MCQ");
        compatible.add("HG");
        compatible.add("PNG");
        compatible.add("HPP");
        compatible.add("CLG");
        compatible.add("MRE");
        compatible.add("DGG");
        compatible.add("TRL");
        compatible.add("DLP");
        compatible.add("WHL");
        compatible.add("PLC");
        compatible.add("GSE");
        compatible.add("CRN");
    }
    public final void Act() {
        System.out.print(id+"-");
        if (number < 10) {
            System.out.print("0");
        }
        System.out.print(number+": ");
        System.out.println("*grunt*");
    }
    public final void Interact() {
        Description("hippopotamus");
        Act();
    }
    private static int hippopotamus_nb;
}
