package animal.bat;
import animal.Animal;
import pair.Pair;

/**
 * Kelas untuk merepresentasikan real animal yaitu bat.
 *
 * @author Vigor Akbar
 * @version %I%, %G%
 */
public class Bat extends Animal {
  /**
   * Counter untuk jumlah zebra yang telah dibuat
   * (termasuk yang tidak dapat masuk ke dalam kandang).
   */
  private static int bat_nb;
  /**
   * Konstruktor untuk menciptakan <code>Bat</code> pada posisi tertentu
   * dengan berat tertentu.
   *
   * @param _weight berat bat yang diinginkan
   * @param _position posisi bat yang diinginkan
   */
  public Bat(final double _weight, final Pair _position) {
    super("BT", ++bat_nb,'*', _weight, 0.4, 'O', _position);
    habitat.add(new Character('A'));
    compatible.add(new String("HMB"));
    compatible.add(new String("CKT"));
    compatible.add(new String("RBN"));
    compatible.add(new String("BT"));
    compatible.add(new String("PLC"));
    compatible.add(new String("GSE"));
    compatible.add(new String("CRN"));
  }
  /**
   * Konstruktor untuk menciptakan <code>Bat</code> pada posisi tertentu.
   *
   * @param _position posisi bat yang diinginkan
   */
  public Bat(final Pair _position) {
    super("BT", ++bat_nb,'*', 0.15, 0.4, 'O', _position);
    habitat.add(new Character('A'));
    compatible.add(new String("HMB"));
    compatible.add(new String("CKT"));
    compatible.add(new String("RBN"));
    compatible.add(new String("BT"));
    compatible.add(new String("PLC"));
    compatible.add(new String("GSE"));
    compatible.add(new String("CRN"));
  }
  /**
   * Mencetak kelakuan bat ke layar.
   * I.S.: sembarang.
   * F.S.: pada layar tercetak apa yang dilakukan bat.
   */
  public final void Act() {
    System.out.print(id + "-");
    if (number < 10) {
      System.out.print("0");
    }
    System.out.print(number + ": ");
    System.out.println("*screech*");
  }
  /**
   * Mencetak deskripsi dan kelakuan bat pada layar.
   * I.S.: sembarang.
   * F.S.: pada layar tercetak hasil interaksi
   * dengan bat (deskripsi dan kelakuan).
   */
  public final void Interact() {
    Description("bat");
    Act();
  }
}
