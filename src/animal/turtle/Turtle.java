package animal.turtle;

import animal.Animal;
import pair.Pair;

/**
 * Kelas untuk merepresentasikan real animal yaitu penyu.
 *
 * @author Gisela Supardi
 * @version %I%, %G%
 */
public class Turtle extends Animal {
    /**
     * Counter untuk jumlah penyu yang telah dibuat
     * (termasuk yang tidak dapat masuk ke dalam kandang).
     */
    private static int turtle_nb;

    /**
     * Konstruktor untuk menciptakan <code>Turtle</code> pada posisi tertentu
     * dengan berat tertentu.
     *
     * @param _weight berat penyu yang diinginkan
     * @param _position posisi penyu yang diinginkan
     */
    public Turtle(double _weight, Pair _position) {
        super("TRL", ++turtle_nb,'0', _weight, 0.3, 'H', _position);
        habitat.add(new Character('W'));
        compatible.add(new String("WHL"));
        compatible.add(new String("MRE"));
        compatible.add(new String("DGG"));
        compatible.add(new String("PNG"));
        compatible.add(new String("HPP"));
        compatible.add(new String("TRL"));
        compatible.add(new String("DLP"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
    }

    /**
     * Konstruktor untuk menciptakan <code>Turtle</code> pada posisi tertentu.
     *
     * @param _position posisi penyu yang diinginkan
     */
    public Turtle(Pair _position) {
        super("TRL", ++turtle_nb,'0', 453, 0.3, 'H', _position);
        habitat.add(new Character('W'));
        compatible.add(new String("WHL"));
        compatible.add(new String("MRE"));
        compatible.add(new String("DGG"));
        compatible.add(new String("PNG"));
        compatible.add(new String("HPP"));
        compatible.add(new String("TRL"));
        compatible.add(new String("DLP"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
    }

    /**
     * Mencetak kelakuan penyu ke layar.
     * I.S.: sembarang.
     * F.S.: pada layar tercetak apa yang dilakukan penyu.
     */
    public final void Act() {
        System.out.print(id+"-");
        if (number < 10) {
            System.out.print("0");
        }
        System.out.print(number+": ");
        System.out.println("*swim*");
    }

    /**
     * Mencetak deskripsi dan kelakuan penyu pada layar.
     * I.S.: sembarang.
     * F.S.: pada layar tercetak hasil interaksi
     * dengan penyu (deskripsi dan kelakuan).
     */
    public final void Interact() {
        Description("turtle");
        Act();
    }
}
