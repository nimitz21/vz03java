package animal.pelican;

import animal.Animal;
import pair.Pair;

/**
 * Created by asuspc on 3/28/2017.
 */
public class Pelican extends Animal {
  public Pelican(Pair _position) {
    super("PLC", ++pelican_nb,'~', 7, 0.4, 'K', _position);
      habitat.add(new Character('W'));
      habitat.add(new Character('A'));
      compatible.add(new String("MRE"));
      compatible.add(new String("DGG"));
      compatible.add(new String("DLP"));
      compatible.add(new String("WHL"));
      compatible.add(new String("PNG"));
      compatible.add(new String("HPP"));
      compatible.add(new String("PLC"));
      compatible.add(new String("GSE"));
      compatible.add(new String("CRN"));
      compatible.add(new String("EGL"));
      compatible.add(new String("OW"));
      compatible.add(new String("HMB"));
      compatible.add(new String("CKT"));
      compatible.add(new String("RBN"));
      compatible.add(new String("BT"));
      compatible.add(new String("CLG"));
      compatible.add(new String("SGL"));
  }
    public Pelican(double _weight, Pair _position) {
        super("PLC", ++pelican_nb,'~', _weight, 0.4, 'K', _position);
        habitat.add(new Character('W'));
        habitat.add(new Character('A'));
        compatible.add(new String("MRE"));
        compatible.add(new String("DGG"));
        compatible.add(new String("DLP"));
        compatible.add(new String("WHL"));
        compatible.add(new String("PNG"));
        compatible.add(new String("HPP"));
        compatible.add(new String("PLC"));
        compatible.add(new String("GSE"));
        compatible.add(new String("CRN"));
        compatible.add(new String("EGL"));
        compatible.add(new String("OW"));
        compatible.add(new String("HMB"));
        compatible.add(new String("CKT"));
        compatible.add(new String("RBN"));
        compatible.add(new String("BT"));
        compatible.add(new String("CLG"));
        compatible.add(new String("SGL"));
    }
    public final void Act() {
        System.out.print(id+"-");
        if (number < 10) {
            System.out.print("0");
        }
        System.out.print(number+": ");
        System.out.println("*hrraa-hrraa*");
    }
    public final void Interact() {
        Description("pelican");
        Act();
    }
    private static int pelican_nb;
}

