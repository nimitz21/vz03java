package animal;
import pair.Pair;
import java.util.HashSet;

/**
 * Kelas yang bertanggung jawab atas terbentuknya
 * hewan-hewan di dalam <code>Zoo</code>.
 * Di dalam kelas ini memiliki 26 turunan yang merupakan jenis hewan berbeda
 * yang mungkin akan dihidupkan dalam <code>Zoo</code>.
 *
 * @author Vigor Akbar
 * @version %I%, %G%
 */
public abstract class Animal {
	/**
	 * Identitas dari hewan.
	 * Setiap jenis hewan memiliki <code>id</code> yang unik.
	 */
	protected String id;

	/**
	 * Identitas dari instansi hewan untuk membedakan
	 * dengan instansi lain pada jenis yang sama.
	 * Setiap instansi hewan memiliki nomor yang unik
	 * dari hewan lain yang sejenis.
	 */
	protected int number;

	/**
	 * Legenda hewan, yaitu simbol yang ditampilkan
	 * pada peta.
	 */
	protected char legend;

	/**
	 * Berat badan hewan.
	 */
	protected double weight;

	/**
	 * Persentase makanan yang dikonsumsi hewan
	 * terhadap berat badan hewan tersebut.
	 */
	protected double eat;

	/**
	 * Jenis hewan berdasarkan makanan yang dikonsumsinya:
	 * K untuk karnnivor, H untuk herbivor, O untuk omnivor).
	 */
	protected char type;

	/**
	 * Pasangan <code>integer</code> yang merepresentasikan
	 * posisi dari hewan.
	 */
	protected Pair position;

	/**
	 * Daftar hewan yang dapat digabungkan dengan
	 * hewan ini.
	 */
	protected HashSet<String> compatible;

	/**
	 * Daftar habitat yang dapat ditinggali oleh
	 * hewan: A untuk udara, W untuk air, L untuk darat.
	 */
	protected HashSet<Character> habitat;

	/**
	 * Konstruktor.
	 * Menciptakan hewan.
	 */
  public Animal(final String _id,
                final int _number,
                final char _legend,
                final double _weight,
                final double _eat,
                final char _type,
                final Pair _position) {
    id = new String(_id.toString());
    number = _number;
    legend = _legend;
    weight = _weight;
    eat = _eat;
    type = _type;
    position = new Pair(_position.first, _position.second);
    habitat = new HashSet<Character>();
    compatible = new HashSet<String>();
  }

	/**
	 * Mengembalikan identitas jenis hewan tersebut.
	 *
	 * @return id
	 */
  public final String GetId() {
    return id;
  }

	/**
	 * Mengembalikan identitas nomor hewan tersebut.
	 *
	 * @return number
	 */
  public final int GetNumber() {
    return number;
  }

	/**
	 * Mengembalikan berat badan hewan tersebut.
	 *
	 * @return weight
	 */
  public final double GetWeight() {
    return weight;
  }

	/**
	 * Mengembalikan persentase makanan hewan tersebut.
	 *
	 * @return eat
	 */
  public final double GetEat() {
    return eat;
  }

	/**
	 * Mengembalikan posisi hewan tersebut.
	 *
	 * @return position
	 */
  public final Pair GetPos() {
    return position;
  }

	/**
	 * Mengembalikan tipe hewan tersebut berdasarkan
	 * jenis makanannya.
	 *
	 * @return type
	 */
  public final char GetType() {
    return type;
  }

	/**
	 * Mengembalikan legenda hewan tersebut.
	 *
	 * @return legend
	 */
  public final char GetLegend() {
    return legend;
  }

	/**
	 * Mengembalikan daftar habitat yang dapat
	 * ditinggali hewan tersebut.
	 *
	 * @return habitat
	 */
  public final HashSet<Character> GetHabitat() {
    return habitat;
  }

	/**
	 * Mengembalikan daftar hewan yang aman diletakkan
	 * pada kandang yang sama dengan hewan tersebut.
	 *
	 * @return compatible
	 */
  public final HashSet<String> GetCompatible() {
    return compatible;
  }

	/**
	 * Mengubah berat badan hewan menjadi <code>_weight</code>.
	 * I.S.: <code>weight</code> sembarang.
	 * F.S.: <code>weight</code> telah terganti dengan <code>_weight</code>.
	 *
	 * @param _weight berat badan baru hewan
	 */
	public void SetWeight(final double _weight) {
		weight = _weight;
	}

	/**
	 * Mengubah posisi hewan menjadi <code>_position</code>.
	 * I.S.: <code>position</code> sembarang.
	 * F.S.: <code>position</code> telah terganti dengan <code>_position</code>.
	 *
	 * @param _position berat badan baru hewan
	 */
	public void SetPos(final Pair _position) {
		position.first = _position.first;
		position.second = _position.second;
	}

	/**
	 * Mencetak kelakuan hewan tersebut ke layar.
	 * I.S.: sembarang.
	 * F.S.: pada layar tercetak apa yang dilakukan hewan.
	 * Diimplementasi di kelas turunan
	 */
  abstract public void Act();

	/**
	 * Mencetak deskripsi dan kelakuan hewan pada layar.
	 * I.S.: sembarang.
	 * F.S.: pada layar tercetak hasil interaksi
	 * dengan hewan (deskripsi dan kelakuan).
	 * Diimplementasi di kelas turunan
	 */
  abstract public void Interact();

	/**
	 * Mencetak deskripsi hewan tersebut ke layar.
	 * I.S.: sembarang.
	 * F.S.: pada layar tercetak deskripsi mengenai hewan tersebut.
	 */
  public final void Description(final String a) {
      System.out.print("This is a(n) " + a + " called " + id + "-");
      if (number < 10) {
          System.out.print("0");
      }
      System.out.print(number + ". It weights " + weight + " kilograms. It eats ");
      System.out.print((eat * weight) + " kilograms of ");
      if (type == 'K') {
          System.out.print("meats");
      } else if (type == 'O') {
          System.out.print("meats and vegetables");
      } else {
          System.out.print("vegetables");
      }
      System.out.println();
  }

	/**
	 * Menggerakkan hewan dengan arah sesuai <code>direction</code>.
	 * I.S.: <code>direction</code> haruslah merupakan arah yang dapat dikunjungi hewan.
	 * F.S.: hewan telah bergerak sesuai <code>direction</code>.
	 *
	 * @param direction arah yang ingin dituju (0 ke atas, 1 ke kiri, 2 ke kanan, 3 ke bawah)
	 */
  public void Move(final int direction) {
	  switch (direction) {
		  case 0:
			  (position.first)--;
			  break;
		  case 1:
			  (position.second)--;
			  break;
		  case 2:
			  (position.second)++;
			  break;
		  case 3:
			  (position.first)++;
			  break;
	  }
  }
}
