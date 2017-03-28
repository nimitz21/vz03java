package animal.shark;

import animal.Animal;
import pair.Pair;

/**
 * Created by asuspc on 3/28/2017.
 */
public class Shark extends Animal {
    public Shark(Pair _position) {
        super("SHK", ++shark_nb,'7', 771, 0.4, 'K', _position);
        habitat.add(new Character('W'));
        compatible.add(new String("SHK"));
        compatible.add(new String("WHL"));
    }
    public Shark(double _weight, Pair _position) {
        super("SHK", ++shark_nb,'7', _weight, 0.4, 'K', _position);
        habitat.add(new Character('W'));
        compatible.add(new String("SHK"));
        compatible.add(new String("WHL"))
    }
    public final void Act() {
        System.out.print(id+"-");
        if (number < 10) {
            System.out.print("0");
        }
        System.out.print(number+": ");
        System.out.println("*cruise*");
    }
    public final void Interact() {
        Description("shark");
        Act();
    }
    private static int shark_nb;
}
