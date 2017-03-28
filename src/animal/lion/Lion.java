package animal.lion;

import animal.Animal;
import pair.Pair;

/**
 * Created by asuspc on 3/28/2017.
 */
public class Lion extends Animal {
    public Lion(Pair _position) {
        super("LI", ++lion_nb,'2', 158, 0.4, 'K', _position);
        habitat.add(new Character('L'));
        compatible.add(new String("LI"));
    }
    public Lion(double _weight, Pair _position) {
        super("LI", ++lion_nb,'2', _weight, 0.4, 'K', _position);
        habitat.add(new Character('L'));
        compatible.add(new String("LI"));
    }
    public final void Act() {
        System.out.print(id+"-");
        if (number < 10) {
            System.out.print("0");
        }
        System.out.print(number+": ");
        System.out.println("*roar*");
    }
    public final void Interact() {
        Description("lion");
        Act();
    }
    private static int lion_nb;
}
