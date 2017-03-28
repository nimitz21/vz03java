package animal.hippopotamus;

import animal.Animal;
import pair.Pair;

/**
 * Kelas untuk merepresentasikan real animal yaitu Hippopotamus.
 *
 * @author Vigor Akbar
 * @version %I%, %G%
 */
public class Hippopotamus extends Animal {
    /**
     * Counter untuk jumlah Hippopotamus yang telah dibuat
     * (termasuk yang tidak dapat masuk ke dalam kandang).
     */
    private static int hippopotamus_nb;
    /**
     * Konstruktor untuk menciptakan <code>Hippopotamus</code> pada posisi tertentu
     * dengan berat tertentu.
     *
     * @param _weight berat Hippopotamus yang diinginkan
     * @param _position posisi Hippopotamus yang diinginkan
     */
    public Hippopotamus(double _weight, Pair _position) {
        super("HPP", ++hippopotamus_nb,')', _weight, 0.4, 'H', _position);
        habitat.add(new Character('L'));
        habitat.add(new Character('W'));
        compatible.add(new String("WF"));
        compatible.add(new String("ZBR"));
        compatible.add(new String("ELP"));
        compatible.add(new String("MCQ"));
        compatible.add(new String("HG"));
        compatible.add(new String("PNG"));
        compatible.add(new String("HPP"));
        compatible.add(new String("CLG"));
        compatible.add(new String("MRE"));
        compatible.add(new String("DGG"));
        compatible.add(new String("TRL"));
        compatible.add(new String("DLP"));
        compatible.add(new String("WHL"));
        compatible.add(new String("PLC"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
    }
    /**
     * Konstruktor untuk menciptakan <code>Hippopotamus</code> pada posisi tertentu.
     *
     * @param _position posisi Hippopotamus yang diinginkan
     */
    public Hippopotamus(Pair _position) {
        super("HPP", ++hippopotamus_nb,')', 1496, 0.4, 'H', _position);
        habitat.add(new Character('L'));
        habitat.add(new Character('W'));
        compatible.add(new String("WF"));
        compatible.add(new String("ZBR"));
        compatible.add(new String("ELP"));
        compatible.add(new String("MCQ"));
        compatible.add(new String("HG"));
        compatible.add(new String("PNG"));
        compatible.add(new String("HPP"));
        compatible.add(new String("CLG"));
        compatible.add(new String("MRE"));
        compatible.add(new String("DGG"));
        compatible.add(new String("TRL"));
        compatible.add(new String("DLP"));
        compatible.add(new String("WHL"));
        compatible.add(new String("PLC"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
    }
    /**
     * Mencetak kelakuan Hippopotamus ke layar.
     * I.S.: sembarang.
     * F.S.: pada layar tercetak apa yang dilakukan Hippopotamus.
     */
    public final void Act() {
        System.out.print(id+"-");
        if (number < 10) {
            System.out.print("0");
        }
        System.out.print(number+": ");
        System.out.println("*grunt*");
    }
    /**
     * Mencetak deskripsi dan kelakuan Hippopotamus pada layar.
     * I.S.: sembarang.
     * F.S.: pada layar tercetak hasil interaksi
     * dengan Hippopotamus (deskripsi dan kelakuan).
     */
    public final void Interact() {
        Description("hippopotamus");
        Act();
    }
}
