package animal.dugong;

import animal.Animal;
import pair.Pair;

/**
 * Created by asuspc on 3/28/2017.
 */
public class Dugong extends Animal {
    /**
     * Counter untuk jumlah dolphin yang telah dibuat
     * (termasuk yang tidak dapat masuk ke dalam kandang).
     */
    private static int dugong_nb;
    /**
     * Konstruktor untuk menciptakan <code>Dugong</code> pada posisi tertentu
     * dengan berat tertentu.
     *
     * @param _weight berat Dugong yang diinginkan
     * @param _position posisi Dugong yang diinginkan
     */
    public Dugong(double _weight, Pair _position) {
        super("DGG", ++dugong_nb,'9', _weight, 0.7, 'H', _position);
        habitat.add(new Character('W'));
        compatible.add(new String("MRE"));
        compatible.add(new String("DGG"));
        compatible.add(new String("TRL"));
        compatible.add(new String("DLP"));
        compatible.add(new String("WHL"));
        compatible.add(new String("PNG"));
        compatible.add(new String("HPP"));
        compatible.add(new String("PLC"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
    }
    /**
     * Konstruktor untuk menciptakan <code>Dugong</code> pada posisi tertentu.
     *
     * @param _position posisi Dugong yang diinginkan
     */
    public Dugong(Pair _position) {
        super("DGG", ++dugong_nb,'9', 294, 0.7, 'K', _position);
        habitat.add(new Character('W'));
        compatible.add(new String("MRE"));
        compatible.add(new String("DGG"));
        compatible.add(new String("TRL"));
        compatible.add(new String("DLP"));
        compatible.add(new String("WHL"));
        compatible.add(new String("PNG"));
        compatible.add(new String("HPP"));
        compatible.add(new String("PLC"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
    }
    /**
     * Mencetak kelakuan Dugong ke layar.
     * I.S.: sembarang.
     * F.S.: pada layar tercetak apa yang dilakukan Dugong.
     */
    public final void Act() {
        System.out.print(id+"-");
        if (number < 10) {
            System.out.print("0");
        }
        System.out.print(number+": ");
        System.out.println("*splash*");
    }
    /**
     * Mencetak deskripsi dan kelakuan Dugong pada layar.
     * I.S.: sembarang.
     * F.S.: pada layar tercetak hasil interaksi
     * dengan Dugong (deskripsi dan kelakuan).
     */
    public final void Interact() {
        Description("dugong");
        Act();
    }
}
