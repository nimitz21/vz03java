/* File  : Road.java */
package renderable.cell.facilities.road;

import renderable.cell.facilities.Facility;

/**
 * Kelas turunan dari kelas <code>Facility</code>
 * berupa jalan di <code>Zoo</code>.
 *
 * @author Gisela Supardi
 * @version %I%, %G%
 */
public class Road extends Facility {
  /**
   * Konstruktor untuk menciptakan <code>Road</code>.
   */
  public Road(char r) {
    initial_symbol = new Character(r);
    symbol = new Character(r);
  }

  /**
   * Memasang atau menghilangkan sekat antar-<code>Cell</code>;
   * dibuat hanya untuk memenuhi inheritance dari <code>Cell</code>.
   * I.S.: sembarang.
   * F.S.: sama dengan keadaan semula.
   *
   * @param direction arah yang ingin dibuka
   */
  public void ToggleSekat(int direction) {}

  /**
   * Mengecek apakah ke arah direction terdapat sekat;
   * dibuat hanya untuk memenuhi inheritance dari <code>Cell</code>.
   *
   * @param direction arah yang ingin dicek
   * @return false
   */
  public boolean GetSekat(int direction) {
    return false;
  }

  /**
   * Dibuat hanya untuk memenuhi inheritance dari <code>Cell</code>.
   * I.S.: sembarang.
   * F.S.: sama dengan keadaan semula.
   */
  public void Interact() {}
}
