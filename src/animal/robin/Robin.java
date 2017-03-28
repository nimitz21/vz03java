package animal.robin;

import animal.Animal;
import pair.Pair;

/**
 * Kelas untuk merepresentasikan real animal yaitu burung robin.
 *
 * @author Gisela Supardi
 * @version %I%, %G%
 */
public class Robin extends Animal {
    /**
     * Counter untuk jumlah burung robin yang telah dibuat
     * (termasuk yang tidak dapat masuk ke dalam kandang).
     */
    private static int robin_nb;

    /**
     * Konstruktor untuk menciptakan <code>Robin</code> pada posisi tertentu
     * dengan berat tertentu.
     *
     * @param _weight berat burung robin yang diinginkan
     * @param _position posisi burung robin yang diinginkan
     */
    public Robin(double _weight, Pair _position) {
        super("RBN", ++robin_nb,'&', _weight, 0.3, 'O', _position);
        habitat.add(new Character('A'));
        compatible.add(new String("HMB"));
        compatible.add(new String("CKT"));
        compatible.add(new String("RBN"));
        compatible.add(new String("BT"));
        compatible.add(new String("PLC"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
        compatible.add(new String("DRL"));
        compatible.add(new String("CLG"));
    }

    /**
     * Konstruktor untuk menciptakan <code>Robin</code> pada posisi tertentu.
     *
     * @param _position posisi burung robin yang diinginkan
     */
    public Robin(Pair _position) {
        super("RBN", ++robin_nb,'&', 0.06, 0.3, 'O', _position);
        habitat.add(new Character('A'));
        compatible.add(new String("HMB"));
        compatible.add(new String("CKT"));
        compatible.add(new String("RBN"));
        compatible.add(new String("BT"));
        compatible.add(new String("PLC"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
        compatible.add(new String("DRL"));
        compatible.add(new String("CLG"));
    }

    /**
     * Mencetak kelakuan burung robin ke layar.
     * I.S.: sembarang.
     * F.S.: pada layar tercetak apa yang dilakukan burung robin.
     */
    public final void Act() {
        System.out.print(id+"-");
        if (number < 10) {
            System.out.print("0");
        }
        System.out.print(number+": ");
        System.out.println("*chirp*");
    }

    /**
     * Mencetak deskripsi dan kelakuan burung robin pada layar.
     * I.S.: sembarang.
     * F.S.: pada layar tercetak hasil interaksi
     * dengan burung robin (deskripsi dan kelakuan).
     */
    public final void Interact() {
        Description("robin");
        Act();
    }
}
