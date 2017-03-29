package animal.shark;

import animal.Animal;
import pair.Pair;

/**
 * Kelas untuk merepresentasikan real animal yaitu hiu.
 *
 * @author Gisela Supardi
 * @version %I%, %G%
 */
public class Shark extends Animal {
  /**
   * Counter untuk jumlah hiu yang telah dibuat
   * (termasuk yang tidak dapat masuk ke dalam kandang).
   */
  private static int shark_nb;

  /**
   * Konstruktor untuk menciptakan <code>Shark</code> pada posisi tertentu
   * dengan berat tertentu.
   *
   * @param _weight berat hiu yang diinginkan
   * @param _position posisi hiu yang diinginkan
   */
  public Shark(final double _weight, final Pair _position) {
    super("SHK", ++shark_nb,'7', _weight, 0.5, 'K', _position);
    habitat.add(new Character('W'));
    compatible.add(new String("SHK"));
    compatible.add(new String("WHL"));
  }

  /**
   * Konstruktor untuk menciptakan <code>Shark</code> pada posisi tertentu.
   *
   * @param _position posisi hiu yang diinginkan
   */
  public Shark(final Pair _position) {
    super("SHK", ++shark_nb,'7', 771, 0.5, 'K', _position);
    habitat.add(new Character('W'));
    compatible.add(new String("SHK"));
    compatible.add(new String("WHL"));
  }

  /**
   * Mencetak kelakuan hiu ke layar.
   * I.S.: sembarang.
   * F.S.: pada layar tercetak apa yang dilakukan hiu.
   */
  public final void Act() {
    System.out.print(id + "-");
    if (number < 10) {
      System.out.print("0");
    }
    System.out.print(number + ": ");
    System.out.println("*cruise*");
  }
  /**
   * Mencetak deskripsi dan kelakuan hiu pada layar.
   * I.S.: sembarang.
   * F.S.: pada layar tercetak hasil interaksi
   * dengan hiu (deskripsi dan kelakuan).
   */
  public final void Interact() {
    Description("shark");
    Act();
  }
}
