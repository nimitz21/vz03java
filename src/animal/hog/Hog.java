package animal.hog;

import animal.Animal;
import pair.Pair;

/**
 * Created by asuspc on 3/28/2017.
 */
public class Hog extends Animal {
    public Hog(String _id,
               int _number,
               char _legend,
               double _weight,
               double _eat,
               char _type,
               Pair _position) {
        super("HG", ++hog_nb,'6', _weight, food, 'O', _position);
        eat = food;

    }
    public Hog(String _id,
               int _number,
               char _legend,
               double _eat,
               char _type,
               Pair _position) {
        super("HG", ++hog_nb,'6', 68, food, 'O', _position);
        eat = food;
    }
    public final void Act() {

    }
    public final void Interact() {

    }
    private static int hog_nb;
    private final double food = 0.4;
}
