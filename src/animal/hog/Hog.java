package animal.hog;

import animal.Animal;
import pair.Pair;

/**
 * Created by asuspc on 3/28/2017.
 */
public class Hog extends Animal {
    public Hog(double _weight, Pair _position) {
        super("HG", ++hog_nb,'6', _weight, 0.4, 'O', _position);
        habitat.add(new Character('L'));
        compatible.add(new String("ZBR"));
        compatible.add(new String("ELP"));
        compatible.add(new String("MCQ"));
        compatible.add(new String("HG"));
        compatible.add(new String("HPP"));
    }
    public Hog(Pair _position) {
        super("HG", ++hog_nb,'6', 68, 0.4, 'O', _position);
        habitat.add(new Character('L'));
        compatible.add(new String("ZBR"));
        compatible.add(new String("ELP"));
        compatible.add(new String("MCQ"));
        compatible.add(new String("HG"));
        compatible.add(new String("HPP"));
    }
    public final void Act() {
        System.out.print(id+"-");
        if (number < 10) {
            System.out.print("0");
        }
        System.out.print(number+": ");
        System.out.println("*grunt*");
    }
    public final void Interact() {
        Description("hog");
        Act();
    }
    private static int hog_nb;
}
