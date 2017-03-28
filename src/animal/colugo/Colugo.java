package animal.colugo;

import animal.Animal;
import pair.Pair;

/**
 * Kelas untuk merepresentasikan real animal yaitu Colugo.
 *
 * @author Vigor Akbar
 * @version %I%, %G%
 */
public class Colugo extends Animal {
    /**
     * Counter untuk jumlah colugo yang telah dibuat
     * (termasuk yang tidak dapat masuk ke dalam kandang).
     */
    private static int colugo_nb;
    /**
     * Konstruktor untuk menciptakan <code>colugo</code> pada posisi tertentu
     * dengan berat tertentu.
     *
     * @param _weight berat colugo yang diinginkan
     * @param _position posisi colugo yang diinginkan
     */
    public Colugo(double _weight, Pair _position) {
        super("CLG", ++colugo_nb,'<', _weight, 0.4, 'H', _position);
        habitat.add(new Character('L'));
        habitat.add(new Character('A'));
        compatible.add(new String("ZBR"));
        compatible.add(new String("MCQ"));
        compatible.add(new String("HG"));
        compatible.add(new String("PNG"));
        compatible.add(new String("HPP"));
        compatible.add(new String("DRL"));
        compatible.add(new String("CLG"));
        compatible.add(new String("SGL"));
        compatible.add(new String("HMB"));
        compatible.add(new String("CKT"));
        compatible.add(new String("RBN"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
    }
    /**
     * Konstruktor untuk menciptakan <code>colugo</code> pada posisi tertentu.
     *
     * @param _position posisi colugo yang diinginkan
     */
    public Colugo(Pair _position) {
        super("CLG", ++colugo_nb,'<', 0.035, 0.4, 'H', _position);
        habitat.add(new Character('L'));
        habitat.add(new Character('A'));
        compatible.add(new String("ZBR"));
        compatible.add(new String("MCQ"));
        compatible.add(new String("HG"));
        compatible.add(new String("PNG"));
        compatible.add(new String("HPP"));
        compatible.add(new String("DRL"));
        compatible.add(new String("CLG"));
        compatible.add(new String("SGL"));
        compatible.add(new String("HMB"));
        compatible.add(new String("CKT"));
        compatible.add(new String("RBN"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
    }
    /**
     * Mencetak kelakuan colugo ke layar.
     * I.S.: sembarang.
     * F.S.: pada layar tercetak apa yang dilakukan colugo.
     */
    public final void Act() {
        System.out.print(id+"-");
        if (number < 10) {
            System.out.print("0");
        }
        System.out.print(number+": ");
        System.out.println("*glide*");
    }
    /**
     * Mencetak deskripsi dan kelakuan colugo pada layar.
     * I.S.: sembarang.
     * F.S.: pada layar tercetak hasil interaksi
     * dengan colugo (deskripsi dan kelakuan).
     */
    public final void Interact() {
        Description("colugo");
        Act();
    }
}
