/* File  : Restaurant.java */
package renderable.cell.facilities.restaurant;

import renderable.cell.facilities.Facility;

/**
 * Kelas turunan dari kelas <code>Facility</code> 
 * berupa restoran di <code>Zoo</code>.
 *
 * @author Gisela Supardi
 * @version %I%, %G%
 */
public class Restaurant extends Facility {
  /**
   * jenis makanan yang dijual di restoran.
   */
  private String food;

  /**
   * penanda restoran buka atau tutup.
   * <code>true</code> untuk buka, false untuk tutup.
   */
  private boolean open;

  /**
   * Konstruktor untuk menciptakan restaurant.
   * dengan food string kosong dan keadaan restaurant yang tutup.
   */
  public Restaurant() {
    initial_symbol = new Character('R');
    symbol = new Character('R');
    food = "";
    open = false;
  }

  /**
   * Konstruktor untuk menciptakan restaurant.
   * dengan food f dan keadaan restaurant sesuai o.
   *
   * @param f makanan yang dijual oleh restaurant
   * @param o <code>true</code> jika buka, <code>false</code> jika tutup
   */
  public Restaurant(final String f, final boolean o) {
    initial_symbol = new Character('R');
    symbol = new Character('R');
    food = f;
    open = o;
  }

  /**
   * Mengembalikan makanan yang dijual di restoran.
   *
   * @return food
   */
  public final String GetFood() {
    return food;
  }

  /**
   * Mengembalikan status buka restoran.
   *
   * @return open
   */
  public final boolean GetOpen() {
    return open;
  }

  /**
   * Mengubah jenis makanan yang dijual restoran menjadi jenis yang di-input.
   * I.S.: <code>food</code> sembarang.
   * F.S.: <code>food</code> telah terganti dengan <code>f</code>.
   *
   * @param f jenis makanan yang akan dijual
   */
  public void SetFood(final String f) {
    food = f;
  }

  /**
   * Mengubah status buka restoran menjadi kebalikan dari initial state.
   * I.S.: keadaan <code>open</code> sembarang.
   * F.S.: keadaan <code>open</code> menjadi kebalikan dari keadaan semula.
   */
  public void ToggleOpen() {
    open = !open;
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
   * Memunculkan dialog tentang makanan apa yang dijual
   * di restoran tersebut jika restoran buka,
   * jika tidak akan diberi pesan bahwa restoran tutup.
   * I.S.: sembarang.
   * F.S.: pada layar tercetak hasil interaksi
   * dengan <code>Restaurant</code>, yaitu jika restoran buka, makanan
   * apa yang dijual atau pemberitahuan jika restoran tutup.
   */

  public final void Interact() {
    if (open) {
      System.out.println("This restaurant sells " + food + ".");
    } else {
      System.out.println("This restaurant is closed.");
    }
  }
}