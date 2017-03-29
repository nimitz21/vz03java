package animal.pelican;

import animal.Animal;
import pair.Pair;

/**
 * Kelas untuk merepresentasikan real animal yaitu burung pelikan.
 *
 * @author Gisela Supardi
 * @version %I%, %G%
 */
public class Pelican extends Animal {
    /**
     * Counter untuk jumlah burung pelikan yang telah dibuat
     * (termasuk yang tidak dapat masuk ke dalam kandang).
     */
    private static int pelican_nb;

    /**
     * Konstruktor untuk menciptakan <code>Pelican</code> pada posisi tertentu
     * dengan berat tertentu.
     *
     * @param _weight berat burung pelikan yang diinginkan
     * @param _position posisi burung pelikan yang diinginkan
     */
    public Pelican(final double _weight, final Pair _position) {
        super("PLC", ++pelican_nb,'`', _weight, 0.3, 'K', _position);
        habitat.add(new Character('A'));
        habitat.add(new Character('W'));
        compatible.add(new String("WHL"));
        compatible.add(new String("MRE"));
        compatible.add(new String("DGG"));
        compatible.add(new String("PNG"));
        compatible.add(new String("HPP"));
        compatible.add(new String("TRL"));
        compatible.add(new String("DLP"));
        compatible.add(new String("PLC"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
        compatible.add(new String("HMB"));
        compatible.add(new String("CKT"));
        compatible.add(new String("RBN"));
        compatible.add(new String("BT"));
        compatible.add(new String("CLG"));
        compatible.add(new String("EGL"));
        compatible.add(new String("SGL"));
        compatible.add(new String("CLG"));
    }

    /**
     * Konstruktor untuk menciptakan <code>Pelican</code> pada posisi tertentu.
     *
     * @param _position posisi burung pelikan yang diinginkan
     */
    public Pelican(final Pair _position) {
        super("PLC", ++pelican_nb,'`', 7, 0.3, 'K', _position);
        habitat.add(new Character('A'));
        habitat.add(new Character('W'));
        compatible.add(new String("WHL"));
        compatible.add(new String("MRE"));
        compatible.add(new String("DGG"));
        compatible.add(new String("PNG"));
        compatible.add(new String("HPP"));
        compatible.add(new String("TRL"));
        compatible.add(new String("DLP"));
        compatible.add(new String("PLC"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
        compatible.add(new String("HMB"));
        compatible.add(new String("CKT"));
        compatible.add(new String("RBN"));
        compatible.add(new String("BT"));
        compatible.add(new String("CLG"));
        compatible.add(new String("EGL"));
        compatible.add(new String("SGL"));
        compatible.add(new String("CLG"));
    }

    /**
     * Mencetak kelakuan burung pelikan ke layar.
     * I.S.: sembarang.
     * F.S.: pada layar tercetak apa yang dilakukan burung pelikan.
     */
    public final void Act() {
        System.out.print(id + "-");
        if (number < 10) {
            System.out.print("0");
        }
        System.out.print(number + ": ");
        System.out.println("“hrraa-hrraa”");
    }

    /**
     * Mencetak deskripsi dan kelakuan burung pelikan pada layar.
     * I.S.: sembarang.
     * F.S.: pada layar tercetak hasil interaksi
     * dengan burung pelikan (deskripsi dan kelakuan).
     */
    public final void Interact() {
        Description("pelican");
        Act();
    }
}

