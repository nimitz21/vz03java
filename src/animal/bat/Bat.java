package animal.bat;
import animal.Animal;
import pair.Pair;

/**
 * Created by asuspc on 3/28/2017.
 */
public class Bat extends Animal {
    public Bat(String _id,
               int _number,
               char _legend,
               double _weight,
               double _eat,
               char _type,
               Pair _position) {
        super("BT", ++bat_nb,'*', _weight, food, 'O', _position);
        eat = food;
        habitat.add(new Character('A'));
        compatible.add(new String("HMB"));
        compatible.add(new String("CKT"));
        compatible.add(new String("RBN"));
        compatible.add(new String("BT"));
        compatible.add(new String("PLC"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
    }
    public Bat(String _id,
               int _number,
               char _legend,
               double _eat,
               char _type,
               Pair _position) {
        super(_id,_number,_legend,_eat,_type,_position);
        super("BT", ++bat_nb,'*', 0.15, food, 'O', _position);
        eat = food;
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
    private final double food = 0.4;
}
