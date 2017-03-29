/* File  : Pair.java */
package pair;

/**
 * Kelas yang terdiri dari sepasang <code>integer</code>.
 *
 * @author Reinaldo Ignatius Wijaya
 * @version %I%, %G%
 */
public class Pair {
	/**
	 * Elemen pertama dalam pasangan.
	 */
	public int first;

	/**
	 * Elemen kedua dalam pasangan.
	 */
	public int second;

	/**
	 * Konstruktor tanpa parameter.
	 */
	public Pair() {
		first = 0;
		second = 0;
	}

	/**
	 * Konstruktor dengan parameter.
	 *
	 * @param _first  <code>integer</code> pertama.
	 * @param _second <code>integer</code> kedua.
	 */
	public Pair(final int _first, final int _second) {
		first = _first;
		second = _second;
	}

	/**
	 * Mengecek kesamaan 2 buah <code>Pair</code>.
	 *
	 * @param pair pasangan <code>integer</code> yang akan dicek kesamaannya.
	 * @return <code>true</code> jika kedua <code>Pair</code> sama, <code>false</code> jika tidak.
	 */
	public final boolean Equals(final Pair pair) {
		return first == pair.first && second == pair.second;
	}
}
