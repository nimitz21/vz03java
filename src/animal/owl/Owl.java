package animal.owl;

import animal.Animal;
import pair.Pair;

/**
 * Kelas untuk merepresentasikan real animal yaitu burung hantu.
 *
 * @author Gisela Supardi
 * @version %I%, %G%
 */
public class Owl extends Animal {
    /**
     * Counter untuk jumlah burung hantu yang telah dibuat
     * (termasuk yang tidak dapat masuk ke dalam kandang).
     */
    private static int owl_nb;

    /**
     * Konstruktor untuk menciptakan <code>Owl</code> pada posisi tertentu
     * dengan berat tertentu.
     *
     * @param _weight berat burung hantu yang diinginkan
     * @param _position posisi burung hantu yang diinginkan
     */
    public Owl(final double _weight, final Pair _position) {
        super("OW", ++owl_nb,'$', _weight, 0.3, 'K', _position);
        habitat.add(new Character('A'));
        compatible.add(new String("EGL"));
        compatible.add(new String("OW"));
        compatible.add(new String("PLC"));
        compatible.add(new String("DRL"));
    }

    /**
     * Konstruktor untuk menciptakan <code>Owl</code> pada posisi tertentu.
     *
     * @param _position posisi burung hantu yang diinginkan
     */
    public Owl(final Pair _position) {
        super("OW", ++owl_nb,'$', 2, 0.3, 'K', _position);
        habitat.add(new Character('A'));
        compatible.add(new String("EGL"));
        compatible.add(new String("OW"));
        compatible.add(new String("PLC"));
        compatible.add(new String("DRL"));
    }

    /**
     * Mencetak kelakuan burung hantu ke layar.
     * I.S.: sembarang.
     * F.S.: pada layar tercetak apa yang dilakukan burung hantu.
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
     * Mencetak deskripsi dan kelakuan burung hantu pada layar.
     * I.S.: sembarang.
     * F.S.: pada layar tercetak hasil interaksi
     * dengan burung hantu (deskripsi dan kelakuan).
     */
    public final void Interact() {
        Description("owl");
        Act();
    }
}

