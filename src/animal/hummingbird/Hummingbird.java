package animal.hummingbird;

import animal.Animal;
import pair.Pair;


/**
 * Kelas untuk merepresentasikan real animal yaitu Hummingbird.
 *
 * @author Vigor Akbar
 * @version %I%, %G%
 */
public class Hummingbird extends Animal {
    /**
     * Counter untuk jumlah Hummingbird yang telah dibuat
     * (termasuk yang tidak dapat masuk ke dalam kandang).
     */
    private static int hummingbird_nb;
    /**
     * Konstruktor untuk menciptakan <code>Hummingbird</code> pada posisi tertentu.
     *
     * @param _position posisi Hummingbird yang diinginkan
     */
    public Hummingbird(Pair _position) {
        super("HMB", ++hummingbird_nb,'%', 0.0002, 0.3, 'H', _position);
        habitat.add(new Character('A'));
        compatible.add(new String("HMB"));
        compatible.add(new String("CKT"));
        compatible.add(new String("RBN"));
        compatible.add(new String("BT"));
        compatible.add(new String("PLC"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
        compatible.add(new String("CLG"));
        compatible.add(new String("SGL"));
    }
    /**
     * Konstruktor untuk menciptakan <code>Hummingbird</code> pada posisi tertentu
     * dengan berat tertentu.
     *
     * @param _weight berat Hummingbird yang diinginkan
     * @param _position posisi Hummingbird yang diinginkan
     */
    
    public Hummingbird(double _weight, Pair _position) {
        super("HMB", ++hummingbird_nb,'%', _weight, 0.3, 'H', _position);
        habitat.add(new Character('A'));
        compatible.add(new String("HMB"));
        compatible.add(new String("CKT"));
        compatible.add(new String("RBN"));
        compatible.add(new String("BT"));
        compatible.add(new String("PLC"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
        compatible.add(new String("CLG"));
        compatible.add(new String("SGL"));
    }
    /**
     * Mencetak kelakuan Hummingbird ke layar.
     * I.S.: sembarang.
     * F.S.: pada layar tercetak apa yang dilakukan Hummingbird.
     */
    public final void Act() {
        System.out.print(id+"-");
        if (number < 10) {
            System.out.print("0");
        }
        System.out.print(number+": ");
        System.out.println("*hum*");
    }
    /**
     * Mencetak deskripsi dan kelakuan Hummingbird pada layar.
     * I.S.: sembarang.
     * F.S.: pada layar tercetak hasil interaksi
     * dengan Hummingbird (deskripsi dan kelakuan).
     */
    public final void Interact() {
        Description("hummingbird");
        Act();
    }

}
