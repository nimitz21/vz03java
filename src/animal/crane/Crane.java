package animal.crane;

import animal.Animal;
import pair.Pair;

/**
 * Kelas untuk merepresentasikan real animal yaitu burung bangau.
 *
 * @author Reinaldo Ignatius Wijaya
 * @version %I%, %G%
 */
public class Crane extends Animal {
	/**
	 * Counter untuk jumlah burung bangau yang telah dibuat
	 * (termasuk yang tidak dapat masuk ke dalam kandang).
	 */
	private static int crane_nb;

	/**
	 * Konstruktor untuk menciptakan <code>Crane</code> pada posisi tertentu
	 * dengan berat tertentu.
	 *
	 * @param _weight berat burung bangau yang diinginkan
	 * @param _position posisi burung bangau yang diinginkan
	 */
	public Crane(final double _weight, final Pair _position) {
		super("CRN", ++crane_nb,'$', _weight, 0.3, 'K', _position);
		habitat.add(new Character('W'));
		habitat.add(new Character('A'));
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
		compatible.add(new String("HMB"));
		compatible.add(new String("CKT"));
		compatible.add(new String("RBN"));
		compatible.add(new String("BT"));
		compatible.add(new String("DRL"));
		compatible.add(new String("CLG"));
		compatible.add(new String("SGL"));
	}

	/**
	 * Konstruktor untuk menciptakan <code>Crane</code> pada posisi tertentu.
	 *
	 * @param _position posisi burung bangau yang diinginkan
	 */
	public Crane(final Pair _position) {
		super("CRN", ++crane_nb,'$', 2, 0.3, 'K', _position);
		habitat.add(new Character('W'));
		habitat.add(new Character('A'));
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
		compatible.add(new String("HMB"));
		compatible.add(new String("CKT"));
		compatible.add(new String("RBN"));
		compatible.add(new String("BT"));
		compatible.add(new String("DRL"));
		compatible.add(new String("CLG"));
		compatible.add(new String("SGL"));
	}

	/**
	 * Mencetak kelakuan burung bangau ke layar.
	 * I.S.: sembarang.
	 * F.S.: pada layar tercetak apa yang dilakukan burung bangau.
	 */
	public final void Act() {
		System.out.print(id + "-");
		if (number < 10) {
			System.out.print("0");
		}
		System.out.print(number + ": ");
		System.out.println("*hoot*");
	}

	/**
	 * Mencetak deskripsi dan kelakuan burung bangau pada layar.
	 * I.S.: sembarang.
	 * F.S.: pada layar tercetak hasil interaksi
	 * dengan burung bangau (deskripsi dan kelakuan).
	 */
	public final void Interact() {
		Description("Crane");
		Act();
	}
}

