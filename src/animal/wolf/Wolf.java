package animal.wolf;

import animal.Animal;
import pair.Pair;

/**
 * Wolf untuk merepresentasikan real animal yaitu serigala.
 *
 * @author Gisela Supardi
 * @version %I%, %G%
 */
public class Wolf extends Animal {
  /**
   * Counter untuk jumlah serigala yang telah dibuat
   * (termasuk yang tidak dapat masuk ke dalam kandang).
   */
  private static int wolf_nb;

  /**
   * Konstruktor untuk menciptakan <code>Wolf</code> pada posisi tertentu
   * dengan berat tertentu.
   *
   * @param _weight berat serigala yang diinginkan
   * @param _position posisi serigala yang diinginkan
   */
  public Wolf(final double _weight, final Pair _position) {
    super("WF", ++wolf_nb,'1', _weight, 0.2, 'K', _position);
    habitat.add(new Character('L'));
    compatible.add(new String("WF"));
    compatible.add(new String("ELP"));
    compatible.add(new String("HPP"));
  }

  /**
   * Konstruktor untuk menciptakan <code>Wolf</code> pada posisi tertentu.
   *
   * @param _position posisi serigala yang diinginkan
   */
  public Wolf(final Pair _position) {
    super("WF", ++wolf_nb,'1', 45, 0.2, 'K', _position);
    habitat.add(new Character('L'));
    compatible.add(new String("WF"));
    compatible.add(new String("ELP"));
    compatible.add(new String("HPP"));
  }

  /**
   * Mencetak kelakuan serigala ke layar.
   * I.S.: sembarang.
   * F.S.: pada layar tercetak apa yang dilakukan serigala.
   */
  public final void Act() {
    System.out.print(id + "-");
    if (number < 10) {
      System.out.print("0");
    }
    System.out.print(number +": ");
    System.out.println("*howl*");
  }

  /**
   * Mencetak deskripsi dan kelakuan serigala pada layar.
   * I.S.: sembarang.
   * F.S.: pada layar tercetak hasil interaksi
   * dengan serigala (deskripsi dan kelakuan).
   */
  public final void Interact() {
    Description("wolf");
    Act();
  }
}

