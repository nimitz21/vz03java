package animal.lion;

import animal.Animal;
import pair.Pair;

/**
 * Kelas untuk merepresentasikan real animal yaitu Lion.
 *
 * @author Vigor Akbar
 * @version %I%, %G%
 */
public class Lion extends Animal {
    /**
     * Counter untuk jumlah Lion yang telah dibuat
     * (termasuk yang tidak dapat masuk ke dalam kandang).
     */
    private static int lion_nb;
    /**
     * Konstruktor untuk menciptakan <code>Lion</code> pada posisi tertentu.
     *
     * @param _position posisi Lion yang diinginkan
     */
    public Lion(Pair _position) {
        super("LI", ++lion_nb, '2', 158, 0.5, 'O', _position);
        habitat.add(new Character('L'));
        compatible.add(new String("LI"));
    }
    /**
     * Konstruktor untuk menciptakan <code>Lion</code> pada posisi tertentu
     * dengan berat tertentu.
     *
     * @param _weight berat Lion yang diinginkan
     * @param _position posisi Lion yang diinginkan
     */
    public Lion(double _weight, Pair _position) {
        super("LI", ++lion_nb, '2', _weight, 0.5, 'O', _position);
        habitat.add(new Character('L'));
        compatible.add(new String("LI"));
    }
    /**
     * Mencetak kelakuan Lion ke layar.
     * I.S.: sembarang.
     * F.S.: pada layar tercetak apa yang dilakukan Lion.
     */
    public final void Act() {
        System.out.print(id + "-");
        if (number < 10) {
            System.out.print("0");
        }
        System.out.print(number + ": ");
        System.out.println("*roar*");
    }
    /**
     * Mencetak deskripsi dan kelakuan Lion pada layar.
     * I.S.: sembarang.
     * F.S.: pada layar tercetak hasil interaksi
     * dengan Lion (deskripsi dan kelakuan).
     */
    public final void Interact() {
        Description("lion");
        Act();
    }
}