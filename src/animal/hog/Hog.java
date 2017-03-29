package animal.hog;

import animal.Animal;
import pair.Pair;

/**
 * Kelas untuk merepresentasikan real animal yaitu Hog.
 *
 * @author Vigor Akbar
 * @version %I%, %G%
 */
public class Hog extends Animal {
  /**
   * Counter untuk jumlah Hog yang telah dibuat
   * (termasuk yang tidak dapat masuk ke dalam kandang).
   */
  private static int hog_nb;
  /**
   * Konstruktor untuk menciptakan <code>Hog</code> pada posisi tertentu
   * dengan berat tertentu.
   *
   * @param _weight berat Hog yang diinginkan
   * @param _position posisi Hog yang diinginkan
   */
  public Hog(final double _weight, final Pair _position) {
    super("HG", ++hog_nb,'6', _weight, 0.2, 'O', _position);
    habitat.add(new Character('L'));
    compatible.add(new String("ZBR"));
    compatible.add(new String("ELP"));
    compatible.add(new String("MCQ"));
    compatible.add(new String("HG"));
    compatible.add(new String("HPP"));
  }
  /**
   * Konstruktor untuk menciptakan <code>Hog</code> pada posisi tertentu.
   *
   * @param _position posisi Hog yang diinginkan
   */
  public Hog(final Pair _position) {
    super("HG", ++hog_nb,'6', 68, 0.2, 'O', _position);
    habitat.add(new Character('L'));
    compatible.add(new String("ZBR"));
    compatible.add(new String("ELP"));
    compatible.add(new String("MCQ"));
    compatible.add(new String("HG"));
    compatible.add(new String("HPP"));
  }
  /**
   * Mencetak kelakuan Hog ke layar.
   * I.S.: sembarang.
   * F.S.: pada layar tercetak apa yang dilakukan Hog.
   */
  public final void Act() {
    System.out.print(id + "-");
    if (number < 10) {
      System.out.print("0");
    }
    System.out.print(number + ": ");
    System.out.println("*grunt*");
  }
  /**
   * Mencetak deskripsi dan kelakuan Hog pada layar.
   * I.S.: sembarang.
   * F.S.: pada layar tercetak hasil interaksi
   * dengan Hog (deskripsi dan kelakuan).
   */
  public final void Interact() {
    Description("hog");
    Act();
  }

}
