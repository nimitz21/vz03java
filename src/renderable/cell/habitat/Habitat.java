/* File  : Habitat.java */
package renderable.cell.habitat;

import renderable.cell.Cell;

/**
 * Kelas untuk mengisi sel-sel dalam matriks pada <code>Zoo</code>.
 * Kelas ini merupakan kelas untuk menyatakan habitat
 * dalam <code>Zoo</code>, yaitu <code>Cell</code>
 * yang dapat ditinggali <code>Animal</code>.
 *
 * @author Gisela Supardi
 * @version %I%, %G%
 */
public class Habitat extends Cell {
  /**
   * state dari sekat untuk habitat;
   * <code>true</code> untuk terbuka,
   * <code>false</code> untuk tertutup.
   */
  private boolean[] sekat;

  /**
   * Konstruktor untuk menciptakan habitat
   * dengan <code>initial_symbol</code> dan <code>symbol</code>
   * mengikuti parameter <code>s</code>.
   *
   * @param s simbol pembeda habitat yang diinginkan
   */
  public Habitat(char s) {
    int i;
    initial_symbol = new Character(s);
    symbol = new Character(s);
    sekat = new boolean[4];
    for (i = 0; i < 4; ++i) {
      sekat[i] = false;
    }
  }

  /**
   * Memasang atau menghilangkan sekat antar-<code>Cell</code>;
   * I.S.: sembarang.
   * F.S.: sama dengan keadaan semula.
   *
   * @param direction arah yang ingin dibuka
   */
  public void ToggleSekat(int direction) {}

  /**
   * Mengecek apakah ke arah <code>direction</code>
   * terdapat <code>sekat</code>.
   *
   * @param direction arah yang ingin dicek
   * @return sekat dengan arah <code>direction</code>
   */
  public boolean GetSekat(int direction) {
    return sekat[direction];
  }

  /**
   * Dibuat hanya untuk memenuhi inheritance dari <code>Cell</code>.
   * I.S.: sembarang.
   * F.S.: sama dengan keadaan semula.
   */
  public void Interact() {}
}
