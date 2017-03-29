package animal.dolphin;

import animal.Animal;
import pair.Pair;

/**
 * Kelas untuk merepresentasikan real animal yaitu dolphin.
 *
 * @author Vigor Akbar
 * @version %I%, %G%
 */
public class Dolphin extends Animal {
  /**
   * Counter untuk jumlah dolphin yang telah dibuat
   * (termasuk yang tidak dapat masuk ke dalam kandang).
   */
  private static int dolphin_nb;
  /**
   * Konstruktor untuk menciptakan <code>dolphin</code> pada posisi tertentu
   * dengan berat tertentu.
   *
   * @param _weight berat dolphin yang diinginkan
   * @param _position posisi dolphin yang diinginkan
   */
  public Dolphin(final double _weight, final Pair _position) {
    super("DLP", ++dolphin_nb,'!', _weight, 0.2, 'K', _position);
    habitat.add(new Character('W'));
    compatible.add(new String("MRE"));
    compatible.add(new String("DGG"));
    compatible.add(new String("TRL"));
    compatible.add(new String("DLP"));
    compatible.add(new String("WHL"));
    compatible.add(new String("PNG"));
    compatible.add(new String("HPP"));
    compatible.add(new String("PLC"));
    compatible.add(new String("GSE"));
    compatible.add(new String("CRN"));
  }
  /**
   * Konstruktor untuk menciptakan <code>dolphin</code> pada posisi tertentu.
   *
   * @param _position posisi dolphin yang diinginkan
   */
  public Dolphin(final Pair _position) {
    super("DLP", ++dolphin_nb,'!', 226, 0.2, 'K', _position);
    habitat.add(new Character('W'));
    compatible.add(new String("MRE"));
    compatible.add(new String("DGG"));
    compatible.add(new String("TRL"));
    compatible.add(new String("DLP"));
    compatible.add(new String("WHL"));
    compatible.add(new String("PNG"));
    compatible.add(new String("HPP"));
    compatible.add(new String("PLC"));
    compatible.add(new String("GSE"));
    compatible.add(new String("CRN"));
  }
  /**
   * Mencetak kelakuan dolphin ke layar.
   * I.S.: sembarang.
   * F.S.: pada layar tercetak apa yang dilakukan dolphin.
   */
  public final void Act() {
    System.out.print(id + "-");
    if (number < 10) {
      System.out.print("0");
    }
    System.out.print(number + ": ");
    System.out.println("*click*");
  }
  /**
   * Mencetak deskripsi dan kelakuan dolphin pada layar.
   * I.S.: sembarang.
   * F.S.: pada layar tercetak hasil interaksi
   * dengan dolphin (deskripsi dan kelakuan).
   */
  public final void Interact() {
    Description("dolphin");
    Act();
  }
}
