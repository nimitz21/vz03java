package animal.eagle;

import animal.Animal;
import pair.Pair;

/**
 * Created by asuspc on 3/28/2017.
 */
public class Eagle extends Animal {
    public Eagle(double _weight, Pair _position) {
        super("EGL", ++eagle_nb,'#', _weight, 0.4, 'K', _position);
        habitat.add(new Character('A'));
        compatible.add(new String("EGL"));
        compatible.add(new String("OW"));
        compatible.add(new String("PLC"));
    }
    public Eagle(Pair _position) {
        super("EGL", ++eagle_nb,'#', 4, 0.4, 'K', _position);
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
}
