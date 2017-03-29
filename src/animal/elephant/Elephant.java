package animal.elephant;

import animal.Animal;
import pair.Pair;

/**
 * Created by asuspc on 3/28/2017.
 *//**
 * Kelas untuk merepresentasikan real animal yaitu Elephant.
 *
 * @author Vigor Akbar
 * @version %I%, %G%
 */
public class Elephant extends Animal {
  /**
   * Counter untuk jumlah Elephant yang telah dibuat
   * (termasuk yang tidak dapat masuk ke dalam kandang).
   */
  private static int elephant_nb;
  /**
   * Konstruktor untuk menciptakan <code>Elephant</code> pada posisi tertentu
   * dengan berat tertentu.
   *
   * @param _weight berat Elephant yang diinginkan
   * @param _position posisi Elephant yang diinginkan
   */
  public Elephant(final double _weight, final Pair _position) {
    super("ELP", ++elephant_nb,'4', _weight, 0.7, 'H', _position);
    habitat.add(new Character('L'));
    compatible.add(new String("WF"));
    compatible.add(new String("ZBR"));
    compatible.add(new String("ELP"));
    compatible.add(new String("MCQ"));
    compatible.add(new String("HG"));
    compatible.add(new String("PNG"));
    compatible.add(new String("HPP"));
  }
  /**
   * Konstruktor untuk menciptakan <code>Elephant</code> pada posisi tertentu.
   *
   * @param _position posisi Elephant yang diinginkan
   */
  public Elephant(final Pair _position) {
    super("ELP", ++elephant_nb,'4', 5000, 0.7, 'H', _position);
    habitat.add(new Character('L'));
    compatible.add(new String("WF"));
    compatible.add(new String("ZBR"));
    compatible.add(new String("ELP"));
    compatible.add(new String("MCQ"));
    compatible.add(new String("HG"));
    compatible.add(new String("PNG"));
    compatible.add(new String("HPP"));
  }
  /**
   * Mencetak kelakuan Elephant ke layar.
   * I.S.: sembarang.
   * F.S.: pada layar tercetak apa yang dilakukan Elephant.
   */
  public final void Act() {
    System.out.print(id + "-");
    if (number < 10) {
      System.out.print("0");
    }
    System.out.print(number + ": ");
    System.out.println("*trumpet*");
  }
  /**
   * Mencetak deskripsi dan kelakuan Elephant pada layar.
   * I.S.: sembarang.
   * F.S.: pada layar tercetak hasil interaksi
   * dengan Elephant (deskripsi dan kelakuan).
   */
  public final void Interact() {
    Description("elephant");
    Act();
  }
  
}
