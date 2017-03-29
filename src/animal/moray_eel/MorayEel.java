package animal.moray_eel;

import animal.Animal;
import pair.Pair;

/**
 * Kelas untuk merepresentasikan real animal yaitu MorayEel.
 *
 * @author Vigor Akbar
 * @version %I%, %G%
 */
public class MorayEel extends Animal {
    /**
     * Counter untuk jumlah MorayEel yang telah dibuat
     * (termasuk yang tidak dapat masuk ke dalam kandang).
     */
    private static int moray_eel_nb;
    /**
     * Konstruktor untuk menciptakan <code>MorayEel</code> pada posisi tertentu.
     *
     * @param _position posisi MorayEel yang diinginkan
     */
    public MorayEel(final Pair _position) {
        super("MRE", ++moray_eel_nb,'8', 13, 0.2, 'K', _position);
        habitat.add(new Character('W'));
        compatible.add(new String("MRE"));
        compatible.add(new String("DGG"));
        compatible.add(new String("TRL"));
        compatible.add(new String("DLP"));
        compatible.add(new String("WHL"));
        compatible.add(new String("HPP"));
    }
    /**
     * Konstruktor untuk menciptakan <code>MorayEel</code> pada posisi tertentu
     * dengan berat tertentu.
     *
     * @param _weight berat MorayEel yang diinginkan
     * @param _position posisi MorayEel yang diinginkan
     */
    public MorayEel(final double _weight, final Pair _position) {
        super("MRE", ++moray_eel_nb,'8', _weight, 0.2, 'K', _position);
        habitat.add(new Character('W'));
        compatible.add(new String("MRE"));
        compatible.add(new String("DGG"));
        compatible.add(new String("TRL"));
        compatible.add(new String("DLP"));
        compatible.add(new String("WHL"));
        compatible.add(new String("HPP"));
    }
    /**
     * Mencetak kelakuan MorayEel ke layar.
     * I.S.: sembarang.
     * F.S.: pada layar tercetak apa yang dilakukan MorayEel.
     */
    public final void Act() {
        System.out.print(id + "-");
        if (number < 10) {
            System.out.print("0");
        }
        System.out.print(number + ": ");
        System.out.println("*hide into rocks*");
    }
    /**
     * Mencetak deskripsi dan kelakuan MorayEel pada layar.
     * I.S.: sembarang.
     * F.S.: pada layar tercetak hasil interaksi
     * dengan MorayEel (deskripsi dan kelakuan).
     */
    public final void Interact() {
        Description("moray eel");
        Act();
    }
}
