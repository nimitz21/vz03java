package animal.Cockatoo;

import animal.Animal;
import pair.Pair;

/**
 * Kelas untuk merepresentasikan real animal yaitu Cockatoo.
 *
 * @author Vigor Akbar
 * @version %I%, %G%
 */
public class Cockatoo extends Animal {
    /**
     * Counter untuk jumlah cockatoo yang telah dibuat
     * (termasuk yang tidak dapat masuk ke dalam kandang).
     */
    private static int cockatoo_nb;
    /**
     * Konstruktor untuk menciptakan <code>Cockatoo</code> pada posisi tertentu
     * dengan berat tertentu.
     *
     * @param _weight berat cockatoo yang diinginkan
     * @param _position posisi cockatoo yang diinginkan
     */
    public Cockatoo(double _weight, Pair _position) {
        super("CKT", ++cockatoo_nb,'^', _weight, 0.4,'H', _position);
        habitat.add(new Character('A'));
        compatible.add(new String("HMB"));
        compatible.add(new String("CKT"));
        compatible.add(new String("RBN"));
        compatible.add(new String("BT"));
        compatible.add(new String("PLC"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
        compatible.add(new String("CLG"));
    }
    /**
     * Konstruktor untuk menciptakan <code>Cockatoo</code> pada posisi tertentu.
     *
     * @param _position posisi Cockatoo yang diinginkan
     */
    public Cockatoo(Pair _position) {
        super("CKT", ++cockatoo_nb,'^', 0.09, 0.4, 'H', _position);
        habitat.add(new Character('A'));
        compatible.add(new String("HMB"));
        compatible.add(new String("CKT"));
        compatible.add(new String("RBN"));
        compatible.add(new String("BT"));
        compatible.add(new String("PLC"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
        compatible.add(new String("CLG"));
    }
    /**
     * Mencetak kelakuan Cockatoo ke layar.
     * I.S.: sembarang.
     * F.S.: pada layar tercetak apa yang dilakukan Cockatoo.
     */
    public final void Act() {
        System.out.print(id+"-");
        if (number < 10) {
            System.out.print("0");
        }
        System.out.print(number+": ");
        System.out.println("*talk*");
    }
    /**
     * Mencetak deskripsi dan kelakuan Cockatoo pada layar.
     * I.S.: sembarang.
     * F.S.: pada layar tercetak hasil interaksi
     * dengan Cockatoo (deskripsi dan kelakuan).
     */
    public final void Interact() {
        Description("cockatoo");
        Act();
    }
}

