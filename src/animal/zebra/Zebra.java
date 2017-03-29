package animal.zebra;

import animal.Animal;
import pair.Pair;

/**
 * Kelas untuk merepresentasikan real animal yaitu zebra.
 *
 * @author Gisela Supardi
 * @version %I%, %G%
 */
public class Zebra extends Animal {
  /**
   * Counter untuk jumlah zebra yang telah dibuat
   * (termasuk yang tidak dapat masuk ke dalam kandang).
   */
  private static int zebra_nb;

  /**
   * Konstruktor untuk menciptakan <code>Zebra</code> pada posisi tertentu
   * dengan berat tertentu.
   *
   * @param _weight berat zebra yang diinginkan
   * @param _position posisi zebra yang diinginkan
   */
  public Zebra(final double _weight, final Pair _position) {
    super("ZBR", ++zebra_nb,'3', _weight, 0.3, 'H', _position);
    habitat.add(new Character('L'));
    compatible.add(new String("ZBR"));
    compatible.add(new String("ELP"));
    compatible.add(new String("MCQ"));
    compatible.add(new String("HG"));
    compatible.add(new String("PNG"));
    compatible.add(new String("HPP"));
    compatible.add(new String("DRL"));
    compatible.add(new String("CLG"));
    compatible.add(new String("SGL"));
  }

  /**
   * Konstruktor untuk menciptakan <code>Zebra</code> pada posisi tertentu.
   *
   * @param _position posisi zebra yang diinginkan
   */
  public Zebra(final Pair _position) {
    super("ZBR", ++zebra_nb,'3', 226, 0.3, 'H', _position);
    habitat.add(new Character('L'));
    compatible.add(new String("ZBR"));
    compatible.add(new String("ELP"));
    compatible.add(new String("MCQ"));
    compatible.add(new String("HG"));
    compatible.add(new String("PNG"));
    compatible.add(new String("HPP"));
    compatible.add(new String("DRL"));
    compatible.add(new String("CLG"));
    compatible.add(new String("SGL"));
  }

  /**
   * Mencetak kelakuan zebra ke layar.
   * I.S.: sembarang.
   * F.S.: pada layar tercetak apa yang dilakukan zebra.
   */
  public final void Act() {
    System.out.print(id + "-");
    if (number < 10) {
      System.out.print("0");
    }
    System.out.print(number + ": ");
    System.out.println("*snort*");
  }

  /**
   * Mencetak deskripsi dan kelakuan zebra pada layar.
   * I.S.: sembarang.
   * F.S.: pada layar tercetak hasil interaksi
   * dengan zebra (deskripsi dan kelakuan).
   */
  public final void Interact() {
    Description("zebra");
    Act();
  }
}

