package animal.penguin;

import animal.Animal;
import pair.Pair;

/**
 * Kelas untuk merepresentasikan real animal yaitu penguin.
 *
 * @author Gisela Supardi
 * @version %I%, %G%
 */
public class Penguin extends Animal {
    /**
     * Counter untuk jumlah penguin yang telah dibuat
     * (termasuk yang tidak dapat masuk ke dalam kandang).
     */
    private static int penguin_nb;

    /**
     * Konstruktor untuk menciptakan <code>Penguin</code> pada posisi tertentu
     * dengan berat tertentu.
     *
     * @param _weight berat penguin yang diinginkan
     * @param _position posisi penguin yang diinginkan
     */
    public Penguin(final double _weight, final Pair _position) {
        super("PNG", ++penguin_nb,'(', _weight, 0.3, 'K', _position);
        habitat.add(new Character('L'));
        habitat.add(new Character('W'));
        compatible.add(new String("ZBR"));
        compatible.add(new String("ELP"));
        compatible.add(new String("PNG"));
        compatible.add(new String("HPP"));
        compatible.add(new String("DRL"));
        compatible.add(new String("CLG"));
        compatible.add(new String("SGL"));
        compatible.add(new String("TRL"));
        compatible.add(new String("DGG"));
        compatible.add(new String("DLP"));
        compatible.add(new String("WHL"));
        compatible.add(new String("PLC"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
    }

    /**
     * Konstruktor untuk menciptakan <code>Penguin</code> pada posisi tertentu.
     *
     * @param _position posisi penguin yang diinginkan
     */
    public Penguin(final Pair _position) {
        super("PNG", ++penguin_nb,'(', 22, 0.3, 'K', _position);
        habitat.add(new Character('L'));
        habitat.add(new Character('W'));
        compatible.add(new String("ZBR"));
        compatible.add(new String("ELP"));
        compatible.add(new String("PNG"));
        compatible.add(new String("HPP"));
        compatible.add(new String("DRL"));
        compatible.add(new String("CLG"));
        compatible.add(new String("SGL"));
        compatible.add(new String("TRL"));
        compatible.add(new String("DGG"));
        compatible.add(new String("DLP"));
        compatible.add(new String("WHL"));
        compatible.add(new String("PLC"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
    }

    /**
     * Mencetak kelakuan penguin ke layar.
     * I.S.: sembarang.
     * F.S.: pada layar tercetak apa yang dilakukan penguin.
     */
    public final void Act() {
        System.out.print(id + "-");
        if (number < 10) {
            System.out.print("0");
        }
        System.out.print(number + ": ");
        System.out.println("*slide*");
    }
    /**
     * Mencetak deskripsi dan kelakuan penguin pada layar.
     * I.S.: sembarang.
     * F.S.: pada layar tercetak hasil interaksi
     * dengan penguin (deskripsi dan kelakuan).
     */
    public final void Interact() {
        Description("penguin");
        Act();
    }
}

