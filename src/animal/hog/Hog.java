package animal.hog;

import animal.Animal;
import pair.Pair;

/**
 * Created by asuspc on 3/28/2017.
 */
public class Hog extends Animal {
    public Hog(double _weight, Pair _position) {
        super("HG", ++hog_nb,'6', _weight, 0.4, 'O', _position);

    }
    public Hog(Pair _position) {
        super("HG", ++hog_nb,'6', 68, 0.4, 'O', _position);
    }
    public final void Act() {

    }
    public final void Interact() {

    }
    private static int hog_nb;
}
