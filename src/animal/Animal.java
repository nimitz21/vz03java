package animal;
import pair.Pair;
import java.util.HashSet;

/**
 * Created by ASUS INDONESIA on 3/28/2017.
 */
public abstract class Animal {
	protected String id;
	protected int number;
	protected char legend;
	protected double weight;
	protected double eat;
	protected char type;
	protected Pair position;
	protected HashSet<String> compatible;
	protected HashSet<Character> habitat;

  public Animal(String _id,
                int _number,
                char _legend,
                double _weight,
                double _eat,
                char _type,
                Pair _position) {
    id = _id;
    number = _number;
    legend = _legend;
    weight = _weight;
    eat = _eat;
    type = _type;
    position.first = _position.first;
    position.second = _position.second;
  }
  public final String GetId() {
        return id;
    }
  public final int GetNumber() {
        return number;
    }
  public final double GetWeight() {
        return weight;
    }
  public final double GetEat() {
        return eat;
    }
  public final Pair GetPos() {
        return position;
    }
  public final char GetType() {
        return type;
    }
  public final char GetLegend() {
        return legend;
    }
  public final HashSet<Character> GetHabitat() {
        return habitat;
    }
  public void SetWeight(double _weight) {
    weight = _weight;
  }
  public void SetPos(Pair _position) {
    position.first = _position.first;
    position.second = _position.second;
  }
  public final HashSet<String> GetCompatible() {
        return compatible;
    }
  abstract public void Act();
  abstract public void Interact();
  public final void Description(String a) {
      System.out.print("This is a(n) "+a+" called "+id+"-");
      if(number < 10) {
          System.out.print("0");
      }
      System.out.print(number+". It weights "+weight+" kilograms. It eats ");
      System.out.print((eat*weight)+" kilograms of ");
      if (type == 'K') {
          System.out.print("meats");
      } else if (type == 'O') {
          System.out.print("meats and vegetables");
      } else {
          System.out.print("vegetables");
      }
      System.out.println();
  }
  public void Move(int direction) {
	  switch (direction) {
		  case 0:
			  (position.first)--;
			  break;
		  case 1:
			  (position.second)--;
			  break;
		  case 2:
			  (position.second)++;
			  break;
		  case 3:
			  (position.first)++;
			  break;
	  }
  }
}
