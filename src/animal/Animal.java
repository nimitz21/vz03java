package animal;
import pair.Pair;
import java.util.HashSet;

/**
 * Created by ASUS INDONESIA on 3/28/2017.
 */
public class Animal {
    public Animal() {

    }
    public Animal(String _id,
                  int _number,
                  char _legend,
                  double _weight,
                  double _eat,
                  char _type,
                  Pair _position) {

    }
    public final String GetID() {
        return "";
    }
    public final int GetNumber() {
        return 0;
    }
    public final double GetWeight() {
        return 0;
    }
    public final double GetEat() {
        return 0;
    }
    public final Pair GetPos() {
        return new Pair();
    }
    public final char GetType() {
        return '';
    }
    public final char GetLegend() {
        return '';
    }
    public final HashSet<Character> GetHabitat() {
        return new HashSet<Character>();
    }
    public void SetWeight(double _weight) {

    }
    public void SetPos(Pair _position) {

    }
    public final HashSet<String> GetCompatible() {
        return new HashSet<String>();
    }
    public final void Act() {

    }
    public final void Interact() {

    }
    public final void Description(String a) {

    }
    public void Move(int direction) {

    }

    protected String id;
    protected int number;
    protected char legend;
    protected double weight;
    protected double eat;
    protected char type;
    protected Pair position;
    protected HashSet<String> compatible;
    protected HashSet<char> habitat;
}
