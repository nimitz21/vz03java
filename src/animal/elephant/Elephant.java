package animal.elephant;

import animal.Animal;
import pair.Pair;

/**
 * Created by asuspc on 3/28/2017.
 */
public class Elephant extends Animal {
    public Elephant(double _weight, Pair _position) {
        super("ELP", ++elephant_nb,'4', _weight, 0.4, 'H', _position);
        habitat.add(new Character('L'));
        compatible.add(new String("WF"));
        compatible.add(new String("ZBR"));
        compatible.add(new String("ELP"));
        compatible.add(new String("MCQ"));
        compatible.add(new String("HG"));
        compatible.add(new String("PNG"));
        compatible.add(new String("HPP"));
    }

    public Elephant(Pair _position) {
        super("ELP", ++elephant_nb,'4', 5000, 0.4, 'H', _position);
        habitat.add(new Character('L'));
        compatible.add(new String("WF"));
        compatible.add(new String("ZBR"));
        compatible.add(new String("ELP"));
        compatible.add(new String("MCQ"));
        compatible.add(new String("HG"));
        compatible.add(new String("PNG"));
        compatible.add(new String("HPP"));
    }
    public final void Act() {
        System.out.print(id+"-");
        if (number < 10) {
            System.out.print("0");
        }
        System.out.print(number+": ");
        System.out.println("*trumpet*");
    }
    public final void Interact() {
        Description("elephant");
        Act();
    }
    private static int elephant_nb;
}
