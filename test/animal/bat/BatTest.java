package animal.bat;

import junit.framework.TestCase;
import pair.Pair;

import java.util.HashSet;

/**
 * Created by ASUS INDONESIA on 3/28/2017.
 */
public class BatTest extends TestCase {
  public void testGetId() throws Exception {
		Bat b = new Bat(new Pair());
		assert(b.GetId().equals("BT"));
  }

  public void testGetNumber() throws Exception {
	  Bat b = new Bat(new Pair());
	  assert(b.GetNumber() == 2);
  }

  public void testGetWeight() throws Exception {
	  Bat b = new Bat(new Pair());
	  assert(b.GetWeight() == 0.15);
	  b = new Bat(1, new Pair());
	  assert(b.GetWeight() == 1);
  }

  public void testGetEat() throws Exception {
	  Bat b = new Bat(new Pair());
	  assert(b.GetEat() == 0.4);
  }

  public void testGetPos() throws Exception {
	  Bat b = new Bat(new Pair());
	  assert(b.GetPos().equals(new Pair()));
  }

  public void testGetType() throws Exception {
	  Bat b = new Bat(new Pair());
	  assert(b.GetType() == 'O');
  }

  public void testGetLegend() throws Exception {
	  Bat b = new Bat(new Pair());
	  assert(b.GetLegend() == '*');
  }

  public void testGetHabitat() throws Exception {
	  Bat b = new Bat(new Pair());
	  HashSet<Character> habitat = new HashSet<Character>();
	  habitat.add(new Character('A'));
	  assert(b.GetHabitat().equals(habitat));
  }

  public void testGetCompatible() throws Exception {
	  Bat b = new Bat(new Pair());
	  HashSet<String> compatible = new HashSet<String>();
	  compatible.add(new String("HMB"));
	  compatible.add(new String("CKT"));
	  compatible.add(new String("RBN"));
	  compatible.add(new String("BT"));
	  compatible.add(new String("PLC"));
	  compatible.add(new String("GSE"));
	  compatible.add(new String("CRN"));
	  assert(b.GetCompatible().equals(compatible));
  }

  public void testMove() throws Exception {
	  Bat b = new Bat(new Pair());
	  b.Move(0);
	  assert(b.GetPos().equals(new Pair(-1, 0)));
	  b.Move(1);
	  assert(b.GetPos().equals(new Pair(-1, -1)));
	  b.Move(2);
	  assert(b.GetPos().equals(new Pair(-1, 0)));
	  b.Move(3);
	  assert(b.GetPos().equals(new Pair(0, 0)));
  }

}