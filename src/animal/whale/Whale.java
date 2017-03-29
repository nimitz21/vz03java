package animal.whale;

import animal.Animal;
import pair.Pair;

/**
 * Kelas untuk merepresentasikan real animal yaitu paus.
 *
 * @author Gisela Supardi
 * @version %I%, %G%
 */
public class Whale extends Animal {
    /**
     * Counter untuk jumlah paus yang telah dibuat
     * (termasuk yang tidak dapat masuk ke dalam kandang).
     */
    private static int whale_nb;

    /**
     * Konstruktor untuk menciptakan <code>Whale</code> pada posisi tertentu
     * dengan berat tertentu.
     *
     * @param _weight berat paus yang diinginkan
     * @param _position posisi paus yang diinginkan
     */
    public Whale(final double _weight, final Pair _position) {
        super("WHL", ++whale_nb,'@', _weight, 0.3, 'O', _position);
        habitat.add(new Character('W'));
        compatible.add(new String("WHL"));
        compatible.add(new String("SHK"));
        compatible.add(new String("MRE"));
        compatible.add(new String("DGG"));
        compatible.add(new String("PNG"));
        compatible.add(new String("HPP"));
        compatible.add(new String("TRL"));
        compatible.add(new String("DLP"));
        compatible.add(new String("PLC"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
    }

    /**
     * Konstruktor untuk menciptakan <code>Whale</code> pada posisi tertentu.
     *
     * @param _position posisi paus yang diinginkan
     */
    public Whale(final Pair _position) {
        super("WHL", ++whale_nb,'@', 40000, 0.3, 'O', _position);
        habitat.add(new Character('W'));
        compatible.add(new String("WHL"));
        compatible.add(new String("SHK"));
        compatible.add(new String("MRE"));
        compatible.add(new String("DGG"));
        compatible.add(new String("PNG"));
        compatible.add(new String("HPP"));
        compatible.add(new String("TRL"));
        compatible.add(new String("DLP"));
        compatible.add(new String("PLC"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
    }

    /**
     * Mencetak kelakuan paus ke layar.
     * I.S.: sembarang.
     * F.S.: pada layar tercetak apa yang dilakukan paus.
     */
    public final void Act() {
        System.out.print(id + "-");
        if (number < 10) {
            System.out.print("0");
        }
        System.out.print(number + ": ");
        System.out.println("*sing*");
    }

    /**
     * Mencetak deskripsi dan kelakuan paus pada layar.
     * I.S.: sembarang.
     * F.S.: pada layar tercetak hasil interaksi
     * dengan paus (deskripsi dan kelakuan).
     */
    public final void Interact() {
        Description("whale");
        Act();
    }
}
