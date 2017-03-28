package animal.bat;
import animal.Animal;
import pair.Pair;

/**
 * Created by asuspc on 3/28/2017.
 */
public class Bat extends Animal {
    public Bat(double _weight, Pair _position) {
        super("BT", ++bat_nb,'*', _weight, 0.4, '0', _position);
        habitat.add(new Character('A'));
        compatible.add(new String("HMB"));
        compatible.add(new String("CKT"));
        compatible.add(new String("RBN"));
        compatible.add(new String("BT"));
        compatible.add(new String("PLC"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
    }
    public Bat(Pair _position) {
        super("BT", ++bat_nb,'*', 0.15, 0.4, 'O', _position);
        habitat.add(new Character('A'));
        compatible.add(new String("HMB"));
        compatible.add(new String("CKT"));
        compatible.add(new String("RBN"));
        compatible.add(new String("BT"));
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
        System.out.println("*screech*");
    }
    public final void Interact() {
        Description("bat");
        Act();
    }
    private static int bat_nb;
}
