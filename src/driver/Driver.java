/* File     : Driver.java */
/* Author     : Andika Kusuma */

package driver;

import java.util.Scanner;

import zoo.Zoo;


/**
 * Class Driver untuk menginisiasi <code>Zoo</code>.
 *
 * @author Andika Kusuma
 * @version %I%, %G%
 */

public class Driver {
  /**
   * Constructor
   */
  public Driver() {
    char option;
    Scanner scanner = new Scanner(System.in);
    int width = 33, length = 32;
    Zoo z;
    do {
      System.out.println("Auto generate zoo? (y/n) ");
      option = scanner.next().charAt(0);
    } while (option != 'Y' && option != 'y' && option != 'N' && option != 'n');
    if (option == 'N' || option == 'n') {
      do {
        System.out.println("Input lebar dan panjang zoo: ");
        width = scanner.nextInt();
        length = scanner.nextInt();
      } while (width <= 0 || length <= 0);
      z = new Zoo(width, length);
    } else {
      z = new Zoo();
    }
    do {
      System.out.println("Apa yang ingin anda lakukan?");
      System.out.println("1. Tampilkan zoo");
      System.out.println("2. Tampilkan total konsumsi makanan semua hewan di zoo");
      System.out.println("3. Tour zoo");
      System.out.println("4. Buka/tutup semua sekat");
      System.out.println("5. Tutup zoo");
      option = scanner.next().charAt(0);
      switch (option) {
        case '1':
          System.out.println("Input koordinat pojok kiri atas:");
          int x1, x2, y1, y2;
          do {
            System.out.print("x1(width): ");
            x1 = scanner.nextInt();
          } while (!(x1 >= 0 && x1 < width));
          do {
            System.out.print("y1(length): ");
            y1 = scanner.nextInt();
          } while (!(y1 >= 0 && y1 < length));
          System.out.println("Input koordinat pojok kiri atas:");
          do {
            System.out.print("x2(width): ");
            x2 = scanner.nextInt();
          } while (!(x2 >= x1 && x2 < width));
          do {
            System.out.print("y2(length): ");
            y2 = scanner.nextInt();
          } while (!(y2 >= y1 && y2 < length));
          z.Display(x1, y1, x2, y2);
          break;
        case '2':
          System.out.print("Daging: ");
          System.out.print(z.GetTotalMeat());
          System.out.println(" kg");
          System.out.print("Tumbuhan: ");
          System.out.print(z.GetTotalVegetables());
          System.out.println("kg");
          break;
        case '3':
          z.Tour();
          break;
        case '4':
          z.ToggleAllSekat();
          break;
        default:
      }
      z.MoveAllAnimal();
    } while (option != '5');
  }
}