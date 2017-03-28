package animal.eagle;

import animal.Animal;
import pair.Pair;

/**
 * Created by asuspc on 3/28/2017.
 */
public class Eagle extends Animal {
    public Eagle(String _id,
                 int _number,
                 char _legend,
                 double _weight,
                 double _eat,
                 char _type,
                 Pair _position) {
        super("EGL", ++eagle_nb,'#', _weight, food, 'K', _position);
        eat = food;
        habitat.add(new Character('A'));
        compatible.add(new String("EGL"));
        compatible.add(new String("OW"));
        compatible.add(new String("PLC"));
    }
    public Eagle(String _id,
                 int _number,
                 char _legend,
                 double _eat,
                 char _type,
                 Pair _position) {
        super("EGL", ++eagle_nb,'#', 4, food, 'K', _position);
        eat = food;
        habitat.add(new Character('A'));
        compatible.add(new String("EGL"));
        compatible.add(new String("OW"));
        compatible.add(new String("PLC"));
    }
    public final void Act() {
        System.out.print(id+"-");
        if (number < 10) {
            System.out.print("0");
        }
        System.out.print(number+": ");
        System.out.println("*scream*");
    }
    public final void Interact() {
        Description("eagle");
        Act();
    }
    private static int eagle_nb;
    private final double food = 0.4;
}
