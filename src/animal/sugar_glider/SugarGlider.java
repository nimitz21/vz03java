package animal.sugar_glider;

import animal.Animal;
import pair.Pair;

/**
 * Kelas untuk merepresentasikan real animal yaitu sugar glider.
 *
 * @author Gisela Supardi
 * @version %I%, %G%
 */
public class SugarGlider extends Animal {
    /**
     * Counter untuk jumlah sugar glider yang telah dibuat
     * (termasuk yang tidak dapat masuk ke dalam kandang).
     */
    private static int sugar_glider_nb;

    /**
     * Konstruktor untuk menciptakan <code>SugarGlider</code> pada posisi tertentu
     * dengan berat tertentu.
     *
     * @param _weight berat sugar glider yang diinginkan
     * @param _position posisi sugar glider yang diinginkan
     */
    public SugarGlider(final double _weight, final Pair _position) {
        super("SGL", ++sugar_glider_nb,'>', _weight, 0.4, 'O', _position);
        habitat.add(new Character('L'));
        habitat.add(new Character('A'));
        compatible.add(new String("ZBR"));
        compatible.add(new String("HMB"));
        compatible.add(new String("MCQ"));
        compatible.add(new String("HG"));
        compatible.add(new String("PNG"));
        compatible.add(new String("GSE"));
        compatible.add(new String("DRL"));
        compatible.add(new String("CLG"));
        compatible.add(new String("SGL"));
        compatible.add(new String("CRN"));
    }

    /**
     * Konstruktor untuk menciptakan <code>SugarGlider</code> pada posisi tertentu.
     *
     * @param _position posisi sugar glider yang diinginkan
     */
    public SugarGlider(final Pair _position) {
        super("SGL", ++sugar_glider_nb,'>', 0.12, 0.4, 'O', _position);
        habitat.add(new Character('L'));
        habitat.add(new Character('A'));
        compatible.add(new String("ZBR"));
        compatible.add(new String("HMB"));
        compatible.add(new String("MCQ"));
        compatible.add(new String("HG"));
        compatible.add(new String("PNG"));
        compatible.add(new String("GSE"));
        compatible.add(new String("DRL"));
        compatible.add(new String("CLG"));
        compatible.add(new String("SGL"));
        compatible.add(new String("CRN"));
    }

    /**
     * Mencetak kelakuan sugar glider ke layar.
     * I.S.: sembarang.
     * F.S.: pada layar tercetak apa yang dilakukan sugar glider.
     */
    public final void Act() {
        System.out.print(id + "-");
        if (number < 10) {
            System.out.print("0");
        }
        System.out.print(number + ": ");
        System.out.println("*crab*");
    }

    /**
     * Mencetak deskripsi dan kelakuan sugar glider pada layar.
     * I.S.: sembarang.
     * F.S.: pada layar tercetak hasil interaksi
     * dengan sugar glider (deskripsi dan kelakuan).
     */
    public final void Interact() {
        Description("sugar glider");
        Act();
    }
}

