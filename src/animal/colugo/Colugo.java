package animal.colugo;

import animal.Animal;
import pair.Pair;

/**
 * Created by asuspc on 3/28/2017.
 */
public class Colugo extends Animal {
    public Colugo(double _weight, Pair _position) {
        super("CLG", ++colugo_nb,'<', _weight, 0.4, 'H', _position);
        habitat.add(new Character('L'));
        habitat.add(new Character('A'));
        compatible.add(new String("ZBR"));
        compatible.add(new String("MCQ"));
        compatible.add(new String("HG"));
        compatible.add(new String("PNG"));
        compatible.add(new String("HPP"));
        compatible.add(new String("DRL"));
        compatible.add(new String("CLG"));
        compatible.add(new String("SGL"));
        compatible.add(new String("HMB"));
        compatible.add(new String("CKT"));
        compatible.add(new String("RBN"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
    }
<<<<<<< HEAD
    public Colugo(Pair _position) {
=======
    public Colugo(String _id,
                  int _number,
                  char _legend,
                  double _eat,
                  char _type,
                  Pair _position) {
>>>>>>> 141da59f18c22da035a8ba63889ffaa155bf59b1
        super("CLG", ++colugo_nb,'<', 0.035, 0.4, 'H', _position);
        habitat.add(new Character('L'));
        habitat.add(new Character('A'));
        compatible.add(new String("ZBR"));
        compatible.add(new String("MCQ"));
        compatible.add(new String("HG"));
        compatible.add(new String("PNG"));
        compatible.add(new String("HPP"));
        compatible.add(new String("DRL"));
        compatible.add(new String("CLG"));
        compatible.add(new String("SGL"));
        compatible.add(new String("HMB"));
        compatible.add(new String("CKT"));
        compatible.add(new String("RBN"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
    }
    public final void Act() {
        System.out.print(id+"-");
        if (number < 10) {
            System.out.print("0");
        }
        System.out.print(number+": ");
        System.out.println("*glide*");
    }
    public final void Interact() {
        Description("colugo");
        Act();
    }
    private static int colugo_nb;
}
