package animal.draco_lizard;

import animal.Animal;
import pair.Pair;

/**
 * Kelas untuk merepresentasikan real animal yaitu DracoLizard.
 *
 * @author Vigor Akbar
 * @version %I%, %G%
 */
public class DracoLizard extends Animal {
    /**
     * Counter untuk jumlah DracoLizard yang telah dibuat
     * (termasuk yang tidak dapat masuk ke dalam kandang).
     */
    private static int draco_lizard_nb;
    /**
     * Konstruktor untuk menciptakan <code>DracoLizard</code> pada posisi tertentu
     * dengan berat tertentu.
     *
     * @param _weight berat DracoLizard yang diinginkan
     * @param _position posisi DracoLizard yang diinginkan
     */
    public DracoLizard(double _weight, Pair _position) {
        super("DRL", ++draco_lizard_nb,'=', _weight, 0.2, 'K', _position);
        habitat.add(new Character('L'));
        habitat.add(new Character('A'));
        compatible.add(new String("ZBR"));
        compatible.add(new String("MCQ"));
        compatible.add(new String("HG"));
        compatible.add(new String("PNG"));
        compatible.add(new String("DRL"));
        compatible.add(new String("CLG"));
        compatible.add(new String("SGL"));
        compatible.add(new String("OW"));
        compatible.add(new String("RBN"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
    }
    /**
     * Konstruktor untuk menciptakan <code>DracoLizard</code> pada posisi tertentu.
     *
     * @param _position posisi DracoLizard yang diinginkan
     */
    public DracoLizard(Pair _position) {
        super("DRL", ++draco_lizard_nb,'=', 0.2, 0.2, 'K', _position);
        habitat.add(new Character('L'));
        habitat.add(new Character('A'));
        compatible.add(new String("ZBR"));
        compatible.add(new String("MCQ"));
        compatible.add(new String("HG"));
        compatible.add(new String("PNG"));
        compatible.add(new String("DRL"));
        compatible.add(new String("CLG"));
        compatible.add(new String("SGL"));
        compatible.add(new String("OW"));
        compatible.add(new String("RBN"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
    }
    /**
     * Mencetak kelakuan DracoLizard ke layar.
     * I.S.: sembarang.
     * F.S.: pada layar tercetak apa yang dilakukan DracoLizard.
     */
    public final void Act() {
        System.out.print(id+"-");
        if (number < 10) {
            System.out.print("0");
        }
        System.out.print(number+": ");
        System.out.println("*jump*");
    }
    /**
     * Mencetak deskripsi dan kelakuan DracoLizard pada layar.
     * I.S.: sembarang.
     * F.S.: pada layar tercetak hasil interaksi
     * dengan DracoLizard (deskripsi dan kelakuan).
     */
    public final void Interact() {
        Description("draco lizard");
        Act();
    }
}
