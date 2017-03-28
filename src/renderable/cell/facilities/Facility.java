/* File  : Facility.java */
package renderable.cell.facilities;

import renderable.cell.Cell;

/**
 * Kelas untuk mengisi sel-sel dalam matriks pada <code>Zoo</code>.
 * Kelas ini merupakan kelas abstrak untuk menyatakan fasilitas
 * dalam <code>Zoo</code>.
 *
 * @author Gisela Supardi
 * @version %I%, %G%
 */
public abstract class Facility extends Cell {
  /**
   * Konstruktor untuk menciptakan <code>Facility</code>.
   */
  public Facility() {}

  /**
   * Interaksi dengan <code>Facility</code>; tidak diimplementasi pada class ini.
   * I.S.: sembarang.
   * F.S.: pada layar tercetak hasil interaksi dengan <code>Facility</code>.
   */
  abstract public void Interact();
}
