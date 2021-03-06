/* File  : Park.java */
package renderable.cell.facilities.park;

import renderable.cell.facilities.Facility;

/**
 * Kelas turunan dari kelas <code>Facility</code>
 * berupa taman di <code>Zoo</code>.
 *
 * @author Gisela Supardi
 * @version %I%, %G%
 */
public class Park extends Facility {
  /**
   *  tanaman yang ditanam di taman.
   */
  private String plant;

  /**
   * Konstruktor untuk menciptakan <code>Park</code> yang berisi plant string kosong.
   */
  public Park() {
    initial_symbol = new Character('P');
    symbol = new Character('P');
    plant = "";
  }

  /**
   * Konstruktor untuk mencipatakan <code>Park</code> yang berisi plant p.
   *
   * @param p tanaman yang ditanam di <code>Park</code>
   */
  public Park(final String p) {
    initial_symbol = new Character('P');
    symbol = new Character('P');
    plant = p;
  }

  /**
   * Mengembalikan nama tanaman yang tertanam pada taman.
   *
   * @return plant
   */
  public final String GetPlant() {
    return plant;
  }

  /**
   * Mengubah nama tanaman yang tertanam pada taman dengan p.
   * I.S.: <code>plant</code> sembarang.
   * F.S.: <code>plant</code> telah terganti dengan <code>p</code>.
   *
   * @param p tanaman yang ingin ditanam
   */
  public void SetPlant(final String p) {
    plant = p;
  }

  /**
   * Dibuat hanya untuk memenuhi inheritance dari <code>Cell</code>.
   * I.S.: sembarang.
   * F.S.: sama dengan keadaan semula.
   *
   * @param direction arah yang ingin dibuka
   */
  public void ToggleSekat(final int direction) { }

  /**
   * Dibuat hanya untuk memenuhi inheritance dari <code>Cell</code>.
   *
   * @param direction arah yang ingin dicek
   * @return false
   */
  public final boolean GetSekat(final int direction) {
    return false;
  }

  /**
   * Menunjukkan tanaman apa yang ditanam di taman tersebut.
   * I.S.: sembarang.
   * F.S.: pada layar tercetak hasil interaksi
   * dengan <code>Park</code>, yaitu tanaman apa yang ditanam di sana.
   */
  public final void Interact() {
    System.out.print("This Park has ");
    if (!"".equals(plant)) {
      System.out.print(plant);
    } else {
      System.out.print("nothing");
    }
    System.out.println(" planted on it.");
  }
}