package animal.macaque;

import animal.Animal;
import pair.Pair;

/**
 * Created by asuspc on 3/28/2017.
 */
public class Macaque extends Animal {
    public Macaque(Pair _position) {
        super("MCQ", ++macaque_nb,'5', 9, 0.4, 'O', _position);
        habitat.add(new Character('L'));
        compatible.add(new String("ZBR"));
        compatible.add(new String("ELP"));
        compatible.add(new String("MCQ"));
        compatible.add(new String("HG"));
        compatible.add(new String("HPP"));
        compatible.add(new String("DRL"));
        compatible.add(new String("CLG"));
        compatible.add(new String("SGL"));
    }
    public Macaque(double _weight, Pair _position) {
        super("MCQ", ++macaque_nb,'5', _weight, 0.4, 'O', _position);
        habitat.add(new Character('L'));
        compatible.add(new String("ZBR"));
        compatible.add(new String("ELP"));
        compatible.add(new String("MCQ"));
        compatible.add(new String("HG"));
        compatible.add(new String("HPP"));
        compatible.add(new String("DRL"));
        compatible.add(new String("CLG"));
        compatible.add(new String("SGL"));
    }
    public final void Act() {
        System.out.print(id+"-");
        if (number < 10) {
            System.out.print("0");
        }
        System.out.print(number+": ");
        System.out.println("*chatter*");
    }
    public final void Interact() {
        Description("macaque");
        Act();
    }
    private static int macaque_nb;
}