/* File  : Cell.java */
package renderable.cell;

import renderable.Renderable;

/**
 * Kelas abstrak untuk mengisi sel-sel dalam matriks pada <code>Zoo</code>.
 *
 * @author Gisela Supardi
 * @version %I%, %G%
 */
public abstract class Cell implements Renderable {
  /**
   * simbol asli untuk sel dengan jenis tertentu.
   */
  protected Character initial_symbol;

  /**
   * simbol yang akan ditampilkan pada layar (dapat dioverwrite animal).
   */
  protected Character symbol;

  /**
   * Konstruktor tanpa parameter.
   * Menciptakan <code>Cell</code> dengan simbol <code>_initial_symbol</code>.
   */
  public Cell() {
    initial_symbol = new Character('-');
    symbol = new Character('-');
  }

  /**
   * Konstruktor dengan parameter.
   * Menciptakan <code>Cell</code> dengan simbol <code>_initial_symbol</code>.
   *
   * @param _initial_symbol simbol yang ingin dijadikan input.
   */
  public Cell(final char _initial_symbol) {
    initial_symbol = new Character(_initial_symbol);
    symbol = new Character(_initial_symbol);
  }

  /**
   * Membalikan nilai <code>initial_symbol</code> yang disimpan <code>Cell</code>.
   *
   * @return initial symbol.
   */
  public final Character GetInitSymbol() {
    return initial_symbol;
  }

  /**
   * Mengembalikan nilai simbol yang disimpan <code>Cell</code>.
   *
   * @return symbol.
   */
  public final Character GetSymbol() {
    return symbol;
  }

  /**
   * Mengubah <code>initial_symbol</code> dengan simbol baru
   * yaitu <code>s</code>.
   * I.S.: <code>initial_symbol</code> sembarang.
   * F.S.: <code>initial_symbol</code> telah terganti dengan <code>s</code>.
   *
   * @param s initial <code>symbol</code> yang baru.
   */
  public void SetInitSymbol(final Character s) {
    initial_symbol = s;
  }

  /**
   * Mengubah <code>symbol</code> dengan simbol baru
   * yaitu <code>s</code>.
   * I.S.: <code>symbol</code> sembarang.
   * F.S.: <code>symbol</code> telah terganti dengan <code>s</code>.
   *
   * @param s <code>symbol</code> yang baru.
   */
  public void SetSymbol(final Character s) {
    symbol = s;
  }

  /**
   * Menampilkan representasi <code>Cell</code> pada layar.
   * I.S.: sembarang.
   * F.S.: pada layar tercetak karakter yang tersimpan sebagai <code>symbol</code>.
   */
  public void Render() {
    System.out.print(symbol);
  }

  /**
   * Memasang atau menghilangkan sekat antar-<code>Cell</code>;
   * tidak diimplementasi pada class ini.
   * I.S.: keadaan <code>sekat</code> sembarang.
   * F.S.: keadaan <code>sekat</code> menjadi kebalikan dari keadaan semula.
   *
   * @param direction arah yang ingin dibuka
   */
  abstract public void ToggleSekat(int direction);

  /**
   * Mengecek apakah ke arah direction terdapat sekat;
   * tidak diimplementasi pada class ini
   *
   * @param direction arah yang ingin dicek
   */
  abstract public boolean GetSekat(int direction);

  /**
   * Interaksi dengan <code>Cell</code>;
   * tidak diimplementasi pada class ini.
   * I.S.: sembarang.
   * F.S.: pada layar tercetak hasil interaksi dengan <code>Cell</code>.
   */
  abstract public void Interact();
}