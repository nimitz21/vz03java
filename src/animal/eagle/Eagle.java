package animal.eagle;

import animal.Animal;
import pair.Pair;

/**
 * Kelas untuk merepresentasikan real animal yaitu Eagle.
 *
 * @author Vigor Akbar
 * @version %I%, %G%
 */
public class Eagle extends Animal {
    /**
     * Counter untuk jumlah Eagle yang telah dibuat
     * (termasuk yang tidak dapat masuk ke dalam kandang).
     */
    private static int eagle_nb;
    /**
     * Konstruktor untuk menciptakan <code>Eagle</code> pada posisi tertentu
     * dengan berat tertentu.
     *
     * @param _weight berat Eagle yang diinginkan
     * @param _position posisi Eagle yang diinginkan
     */
    public Eagle(final double _weight, final Pair _position) {
        super("EGL", ++eagle_nb,'#', _weight, 0.4, 'K', _position);
        habitat.add(new Character('A'));
        compatible.add(new String("EGL"));
        compatible.add(new String("OW"));
        compatible.add(new String("PLC"));
    }
    /**
     * Konstruktor untuk menciptakan <code>Eagle</code> pada posisi tertentu.
     *
     * @param _position posisi Eagle yang diinginkan
     */
    public Eagle(final Pair _position) {
        super("EGL", ++eagle_nb,'#', 4, 0.4, 'K', _position);
        habitat.add(new Character('A'));
        compatible.add(new String("EGL"));
        compatible.add(new String("OW"));
        compatible.add(new String("PLC"));
    }
    /**
     * Mencetak kelakuan Eagle ke layar.
     * I.S.: sembarang.
     * F.S.: pada layar tercetak apa yang dilakukan Eagle.
     */
    public final void Act() {
        System.out.print(id + "-");
        if (number < 10) {
            System.out.print("0");
        }
        System.out.print(number + ": ");
        System.out.println("*scream*");
    }
    /**
     * Mencetak deskripsi dan kelakuan Eagle pada layar.
     * I.S.: sembarang.
     * F.S.: pada layar tercetak hasil interaksi
     * dengan Eagle (deskripsi dan kelakuan).
     */
    public final void Interact() {
        Description("eagle");
        Act();
    }
}
