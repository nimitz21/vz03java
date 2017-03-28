package animal.moray_eel;

import animal.Animal;
import pair.Pair;

/**
 * Created by asuspc on 3/28/2017.
 */
public class MorayEel extends Animal {
    public MorayEel(Pair _position) {
        super("MRE", ++moray_eel_nb,'8', 13, 0.4, 'K', _position);
        habitat.add(new Character('W'));
        compatible.add(new String("MRE"));
        compatible.add(new String("DGG"));
        compatible.add(new String("TRL"));
        compatible.add(new String("DLP"));
        compatible.add(new String("WHL"));
        compatible.add(new String("HPP"));
    }
    public MorayEel(double _weight, Pair _position) {
        super("MRE", ++moray_eel_nb,'8', _weight, 0.4, 'K', _position);
        habitat.add(new Character('W'));
        compatible.add(new String("MRE"));
        compatible.add(new String("DGG"));
        compatible.add(new String("TRL"));
        compatible.add(new String("DLP"));
        compatible.add(new String("WHL"));
        compatible.add(new String("HPP"));
    }
    public final void Act() {
        System.out.print(id+"-");
        if (number < 10) {
            System.out.print("0");
        }
        System.out.print(number+": ");
        System.out.println("*hide into rocks*");
    }
    public final void Interact() {
        Description("moray eel");
        Act();
    }
    private static int moray_eel_nb;
}
