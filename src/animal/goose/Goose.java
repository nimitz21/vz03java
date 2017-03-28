package animal.goose;

import animal.Animal;
import pair.Pair;
import sun.security.krb5.internal.crypto.Des;

/**
 * Kelas untuk merepresentasikan real animal yaitu Goose.
 *
 * @author Vigor Akbar
 * @version %I%, %G%
 */
public class Goose extends Animal {
    /**
     * Counter untuk jumlah Goose yang telah dibuat
     * (termasuk yang tidak dapat masuk ke dalam kandang).
     */
    private static int goose_nb;
    /**
     * Konstruktor untuk menciptakan <code>Goose</code> pada posisi tertentu
     * dengan berat tertentu.
     *
     * @param _weight berat Goose yang diinginkan
     * @param _position posisi Goose yang diinginkan
     */
    public Goose(double _weight, Pair _position) {
        super("GSE", ++goose_nb,'+', _weight, 0.4, 'H', _position);
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
        compatible.add(new String("CLG"));
        compatible.add(new String("SGL"));
    }
    /**
     * Konstruktor untuk menciptakan <code>Goose</code> pada posisi tertentu.
     *
     * @param _position posisi Goose yang diinginkan
     */
    public Goose(Pair _position) {
        super("GSE", ++goose_nb,'+', 4, 0.4, 'H', _position);
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
        compatible.add(new String("CLG"));
        compatible.add(new String("SGL"));
    }
    /**
     * Mencetak kelakuan Goose ke layar.
     * I.S.: sembarang.
     * F.S.: pada layar tercetak apa yang dilakukan Goose.
     */
    public final void Act() {
        System.out.print(id+"-");
        if (number < 10) {
            System.out.print("0");
        }
        System.out.print(number+": ");
        System.out.println("*quack*");
    }
    /**
     * Mencetak deskripsi dan kelakuan Goose pada layar.
     * I.S.: sembarang.
     * F.S.: pada layar tercetak hasil interaksi
     * dengan Goose (deskripsi dan kelakuan).
     */
    public final void Interact() {
        Description("goose");
        Act();
    }
}
