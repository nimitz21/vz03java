package animal.penguin;

import animal.Animal;
import pair.Pair;

/**
 * Created by asuspc on 3/28/2017.
 */
public class Penguin extends Animal {
    public Penguin(Pair _position) {
        super("PNG", ++penguin_nb,'(', 22, 0.4, 'K', _position);
        habitat.add(new Character('L'));
        habitat.add(new Character('W'));
        compatible.add(new String("ZBR"));
        compatible.add(new String("ELP"));
        compatible.add(new String("PNG"));
        compatible.add(new String("HPP"));
        compatible.add(new String("DRL"));
        compatible.add(new String("CLG"));
        compatible.add(new String("SGL"));
        compatible.add(new String("DGG"));
        compatible.add(new String("TRL"));
        compatible.add(new String("DLP"));
        compatible.add(new String("WHL"));
        compatible.add(new String("PLC"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
    }
    public Penguin(double _weight, Pair _position) {
        super("PNG", ++penguin_nb,'(', _weight, 0.4, 'K', _position);
        habitat.add(new Character('L'));
        habitat.add(new Character('W'));
        compatible.add(new String("ZBR"));
        compatible.add(new String("ELP"));
        compatible.add(new String("PNG"));
        compatible.add(new String("HPP"));
        compatible.add(new String("DRL"));
        compatible.add(new String("CLG"));
        compatible.add(new String("SGL"));
        compatible.add(new String("DGG"));
        compatible.add(new String("TRL"));
        compatible.add(new String("DLP"));
        compatible.add(new String("WHL"));
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
        System.out.println("*slide*");
    }
    public final void Interact() {
        Description("penguin");
        Act();
    }
    private static int penguin_nb;
}

