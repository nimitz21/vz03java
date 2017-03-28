package animal.hippopotamus;

import animal.Animal;
import pair.Pair;

/**
 * Created by asuspc on 3/28/2017.
 */
public class Hippopotamus extends Animal {
    public Hippopotamus(String _id,
                        int _number,
                        char _legend,
                        double _weight,
                        double _eat,
                        char _type,
                        Pair _position) {
        super("HPP", ++hippopotamus_nb,')', _weight, food, 'H', _position);
        eat = food;
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
    public Hippopotamus(String _id,
                        int _number,
                        char _legend,
                        double _eat,
                        char _type,
                        Pair _position) {
        super("HPP", ++hippopotamus_nb,')', 1496, food, 'H', _position);
        eat = food;
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
    private final double food = 0.4;
}
