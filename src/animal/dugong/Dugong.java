package animal.dugong;

import animal.Animal;
import pair.Pair;

/**
 * Created by asuspc on 3/28/2017.
 */
public class Dugong extends Animal {
    public Dugong(String _id,
                  int _number,
                  char _legend,
                  double _weight,
                  double _eat,
                  char _type,
                  Pair _position) {
        super("DGG", ++dugong_nb,'9', _weight, food, 'H', _position);
        eat = food;
        habitat.add(new Character('W'));
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
    }
    public Dugong(String _id,
                  int _number,
                  char _legend,
                  double _eat,
                  char _type,
                  Pair _position) {
        super("DGG", ++dugong_nb,'9', 294, food, 'K', _position);
        eat = food;
        habitat.add(new Character('W'));
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
    }
    public final void Act() {
        System.out.print(id+"-");
        if (number < 10) {
            System.out.print("0");
        }
        System.out.print(number+": ");
        System.out.println("*splash*");
    }
    public final void Interact() {
        Description("dugong");
        Act();
    }
    private static int dugong_nb;
    private final double food = 0.4;
}
