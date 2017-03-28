package animal.dolphin;

import animal.Animal;
import pair.Pair;

/**
 * Created by asuspc on 3/28/2017.
 */
public class Dolphin extends Animal {
    public Dolphin(double _weight, Pair _position) {
        super("DLP", ++dolphin_nb,'!', _weight, 0.4, 'K', _position);
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
    public Dolphin(Pair _position) {
        super("DLP", ++dolphin_nb,'!', 226, 0.4, 'K', _position);
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
        System.out.println("*click*");
    }
    public final void Interact() {
        Description("dolphin");
        Act();
    }
    private static int dolphin_nb;
}
