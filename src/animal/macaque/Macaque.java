package animal.macaque;

import animal.Animal;
import pair.Pair;

/**
 * Kelas untuk merepresentasikan real animal yaitu Macaque.
 *
 * @author Vigor Akbar
 * @version %I%, %G%
 */
public class Macaque extends Animal {
    /**
     * Counter untuk jumlah Macaque yang telah dibuat
     * (termasuk yang tidak dapat masuk ke dalam kandang).
     */
    private static int macaque_nb;
    /**
     * Konstruktor untuk menciptakan <code>Macaque</code> pada posisi tertentu.
     *
     * @param _position posisi Macaque yang diinginkan
     */
    public Macaque(final Pair _position) {
        /**
         * Konstruktor untuk menciptakan <code>Macaque</code> pada posisi tertentu.
         *
         * @param _position posisi Macaque yang diinginkan
         */super("MCQ", ++macaque_nb,'5', 9, 0.2, 'O', _position);
        habitat.add(new Character('L'));
        compatible.add(new String("ZBR"));
        compatible.add(new String("ELP"));
        compatible.add(new String("MCQ"));
        compatible.add(new String("HG"));
        compatible.add(new String("HPP"));
        compatible.add(new String("DRL"));
        compatible.add(new String("CLG"));
        compatible.add(new String("SGL"));
    }
    /**
     * Konstruktor untuk menciptakan <code>Macaque</code> pada posisi tertentu
     * dengan berat tertentu.
     *
     * @param _weight berat Macaque yang diinginkan
     * @param _position posisi Macaque yang diinginkan
     */
    public Macaque(final double _weight, final Pair _position) {
        super("MCQ", ++macaque_nb,'5', _weight, 0.2, 'O', _position);
        habitat.add(new Character('L'));
        compatible.add(new String("ZBR"));
        compatible.add(new String("ELP"));
        compatible.add(new String("MCQ"));
        compatible.add(new String("HG"));
        compatible.add(new String("HPP"));
        compatible.add(new String("DRL"));
        compatible.add(new String("CLG"));
        compatible.add(new String("SGL"));
    }
    /**
     * Mencetak kelakuan Macaque ke layar.
     * I.S.: sembarang.
     * F.S.: pada layar tercetak apa yang dilakukan Macaque.
     */
    public final void Act() {
        System.out.print(id + "-");
        if (number < 10) {
            System.out.print("0");
        }
        System.out.print(number + ": ");
        System.out.println("*chatter*");
    }
    /**
     * Mencetak deskripsi dan kelakuan Macaque pada layar.
     * I.S.: sembarang.
     * F.S.: pada layar tercetak hasil interaksi
     * dengan Macaque (deskripsi dan kelakuan).
     */
    public final void Interact() {
        Description("macaque");
        Act();
    }

}