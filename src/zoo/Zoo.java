package zoo;

import animal.Animal;
import animal.bat.Bat;
import animal.cockatoo.Cockatoo;
import animal.colugo.Colugo;
import animal.crane.Crane;
import animal.dolphin.Dolphin;
import animal.draco_lizard.DracoLizard;
import animal.dugong.Dugong;
import animal.eagle.Eagle;
import animal.elephant.Elephant;
import animal.goose.Goose;
import animal.hippopotamus.Hippopotamus;
import animal.hog.Hog;
import animal.hummingbird.Hummingbird;
import animal.lion.Lion;
import animal.macaque.Macaque;
import animal.moray_eel.MorayEel;
import animal.owl.Owl;
import animal.pelican.Pelican;
import animal.penguin.Penguin;
import animal.robin.Robin;
import animal.shark.Shark;
import animal.sugar_glider.SugarGlider;
import animal.turtle.Turtle;
import animal.whale.Whale;
import animal.wolf.Wolf;
import animal.zebra.Zebra;
import pair.Pair;
import renderable.cell.Cell;
import renderable.cell.facilities.park.Park;
import renderable.cell.facilities.restaurant.Restaurant;
import renderable.cell.facilities.road.Road;
import renderable.cell.habitat.Habitat;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Kelas yang berisi kebun binatang itu sendiri beserta hewan-hewannya
 *
 * @author Reinaldo Ignatius Wijaya
 * @version %I%, %G%
 */
public class Zoo {
    /**
     * dimensi <code>Zoo</code>jumlah baris
     */
    private int width;

    /**
     * dimensi <code>Zoo</code> jumlah kolom
     */
    private int length;

    /**
     * matriks <code>Cell</code> yang dimiliki <code>Zoo</code>
     */
    private Cell[][] cells;

    /**
     * daftar <code>Animal</code> yang ada dalam <code>Zoo</code>
     */
    private ArrayList<Animal> animals;

    /**
     * matriks penanda nomor cage dalam <code>Zoo</code>
     */
    private int[][] cage_map;

    /**
     * jumlah cage yang ada dalam zoo
     */
    private int cage_nb; /**< jumlah cage yang ada dalam zoo*/

    /**
     * CageInit
     * I.S: <code>cage_map</code> tidak terdefenisi
     * F.S: <code>cage_map</code> terdefenisi
     */
    private void CageInit() {
        cage_map = new int[width][length];
        for (int i = 0; i < width; ++i) {
            for (int j = 0; j < length; ++j) {
                cage_map[i][j] = -99;
            }
        }
        int counter = 1;
        Random random = new Random();
        for (int i = 0; i < width; ++i) {
            for (int j = 0; j < length; ++j) {
                if (cage_map[i][j] == -99) {
                    char c = cells[i][j].GetSymbol();
                    if (c != 'W' && c != 'A' && c != 'L') {
                        cage_map[i][j] = 0;
                    } else {
                        int[] array_i = new int[4];
                        int[] array_j = new int[4];
                        for (int k = 0; k < 4; ++k) {
                            array_i[k] = i;
                            array_j[k] = j;
                        }
                        boolean cek = true;
                        cage_map[i][j] = counter;
                        Pair[] moveable = new Pair[12];
                        int ii = 0;
                        int jj = 0;
                        int i_temp = i;
                        int j_temp = j;
                        int count = 0;
                        for (int times = 0; times < 3; times++) {
                            for (int k = 0; k < 4; ++k) {
                                boolean dummy = false;
                                if (k == 0 && i_temp != 0) {
                                    ii = i_temp - 1;
                                    jj = j_temp;
                                    dummy = true;
                                } else if (k == 1 && j_temp != 0) {
                                    ii = i_temp;
                                    jj = j_temp - 1;
                                    dummy = true;
                                } else if (k == 2 && i_temp != width - 1) {
                                    ii = i_temp + 1;
                                    jj = j_temp;
                                    dummy = true;
                                } else if (k == 3 && j_temp != length - 1) {
                                    ii = i_temp;
                                    jj = j_temp + 1;
                                    dummy = true;
                                }
                                if (dummy) {
                                    if (cells[ii][jj].GetSymbol() == c && cage_map[ii][jj] == -99) {
                                        moveable[count] = new Pair(ii, jj);
                                        ++count;
                                    }
                                }
                            }
                            if (count == 0) {
                                cek = false;
                                break;
                            }
                            int move = random.nextInt(count);
                            i_temp = moveable[move].first;
                            j_temp = moveable[move].second;
                            array_i[times] = i_temp;
                            array_j[times] = j_temp;
                            moveable[move] = new Pair(moveable[count - 1].first, moveable[count - 1].second);
                            cage_map[i_temp][j_temp] = counter;
                            --count;
                            if (times == 2) {
                                ++counter;
                            }
                        }
                        if (!cek) {
                            for (int k = 0; k < 4; ++k) {
                                cage_map[array_i[k]][array_j[k]] = -99;
                            }
                        }
                    }
                }
            }
        }
        cage_nb = counter;
        int change = -1;
        while (change != 0) {
            change = 0;
            for (int i = 0; i < width; ++i) {
                for (int j = 0; j < length; ++j) {
                    if (cage_map[i][j] == -99) {
                        Pair[] moveable = new Pair[4];
                        int count = 0;
                        int ii = 0;
                        int jj = 0;
                        for (int k = 0; k < 4; ++k) {
                            boolean dummy = false;
                            if (k == 0 && i != 0) {
                                ii = i - 1;
                                jj = j;
                                dummy = true;
                            } else if (k == 1 && j != 0) {
                                ii = i;
                                jj = j - 1;
                                dummy = true;
                            } else if (k == 2 && i != width - 1) {
                                ii = i + 1;
                                jj = j;
                                dummy = true;
                            } else if (k == 3 && j != length - 1) {
                                ii = i;
                                jj = j + 1;
                                dummy = true;
                            }
                            if (dummy) {
                                if (cells[ii][jj].GetSymbol().equals(cells[i][j].GetSymbol()) && cage_map[ii][jj] != -99) {
                                    moveable[count] = new Pair(ii, jj);
                                    ++count;
                                }
                            }
                        }
                        if (count > 0) {
                            int move = random.nextInt(count);
                            ii = moveable[move].first;
                            jj = moveable[move].second;
                            cage_map[i][j] = cage_map[ii][jj];
                            ++change;
                        }
                    }
                }
            }
        }
    }

    /**
     * NewAnimal
     * I.S: <code>id</code>, <code>weight</code>, dan <code>position</code> terdefenisi
     * F.S: <code>AddAnimal</code> dipanggil dengan parameter <code>Animal</code> yang dialokasi berdasarkan parameter
     * <code>NewAnimal</code>
     *
     * @param id       id hewan yang ingin ditambahkan
     * @param weight   berat badan hewan yang ingin ditambahkan
     * @param position posisi di mana hewan ingin diletakkan
     */
    private void NewAnimal(String id, float weight, Pair position) {
        Animal animal;
        if (id.equals("WF")) {
            if (weight != 0) {
                animal = new Wolf(weight, position);
            } else {
                animal = new Wolf(position);
            }
        } else if (id.equals("LI")) {
            if (weight != 0) {
                animal = new Lion(weight, position);
            } else {
                animal = new Lion(position);
            }
        } else if (id.equals("ZBR")) {
            if (weight != 0) {
                animal = new Zebra(weight, position);
            } else {
                animal = new Zebra(position);
            }
        } else if (id.equals("ELP")) {
            if (weight != 0) {
                animal = new Elephant(weight, position);
            } else {
                animal = new Elephant(position);
            }
        } else if (id.equals("MCQ")) {
            if (weight != 0) {
                animal = new Macaque(weight, position);
            } else {
                animal = new Macaque(position);
            }
        } else if (id.equals("HG")) {
            if (weight != 0) {
                animal = new Hog(weight, position);
            } else {
                animal = new Hog(position);
            }
        } else if (id.equals("EGL")) {
            if (weight != 0) {
                animal = new Eagle(weight, position);
            } else {
                animal = new Eagle(position);
            }
        } else if (id.equals("OW")) {
            if (weight != 0) {
                animal = new Owl(weight, position);
            } else {
                animal = new Owl(position);
            }
        } else if (id.equals("HMB")) {
            if (weight != 0) {
                animal = new Hummingbird(weight, position);
            } else {
                animal = new Hummingbird(position);
            }
        } else if (id.equals("CKT")) {
            if (weight != 0) {
                animal = new Cockatoo(weight, position);
            } else {
                animal = new Cockatoo(position);
            }
        } else if (id.equals("RBN")) {
            if (weight != 0) {
                animal = new Robin(weight, position);
            } else {
                animal = new Robin(position);
            }
        } else if (id.equals("BT")) {
            if (weight != 0) {
                animal = new Bat(weight, position);
            } else {
                animal = new Bat(position);
            }
        } else if (id.equals("SHK")) {
            if (weight != 0) {
                animal = new Shark(weight, position);
            } else {
                animal = new Shark(position);
            }
        } else if (id.equals("MRE")) {
            if (weight != 0) {
                animal = new MorayEel(weight, position);
            } else {
                animal = new MorayEel(position);
            }
        } else if (id.equals("DGG")) {
            if (weight != 0) {
                animal = new Dugong(weight, position);
            } else {
                animal = new Dugong(position);
            }
        } else if (id.equals("TRL")) {
            if (weight != 0) {
                animal = new Turtle(weight, position);
            } else {
                animal = new Turtle(position);
            }
        } else if (id.equals("DLP")) {
            if (weight != 0) {
                animal = new Dolphin(weight, position);
            } else {
                animal = new Dolphin(position);
            }
        } else if (id.equals("WHL")) {
            if (weight != 0) {
                animal = new Whale(weight, position);
            } else {
                animal = new Whale(position);
            }
        } else if (id.equals("PNG")) {
            if (weight != 0) {
                animal = new Penguin(weight, position);
            } else {
                animal = new Penguin(position);
            }
        } else if (id.equals("HPP")) {
            if (weight != 0) {
                animal = new Hippopotamus(weight, position);
            } else {
                animal = new Hippopotamus(position);
            }
        } else if (id.equals("PLC")) {
            if (weight != 0) {
                animal = new Pelican(weight, position);
            } else {
                animal = new Pelican(position);
            }
        } else if (id.equals("GSE")) {
            if (weight != 0) {
                animal = new Goose(weight, position);
            } else {
                animal = new Goose(position);
            }
        } else if (id.equals("CRN")) {
            if (weight != 0) {
                animal = new Crane(weight, position);
            } else {
                animal = new Crane(position);
            }
        } else if (id.equals("DRL")) {
            if (weight != 0) {
                animal = new DracoLizard(weight, position);
            } else {
                animal = new DracoLizard(position);
            }
        } else if (id.equals("CLG")) {
            if (weight != 0) {
                animal = new Colugo(weight, position);
            } else {
                animal = new Colugo(position);
            }
        } else if (id.equals("SGL")) {
            if (weight != 0) {
                animal = new SugarGlider(weight, position);
            } else {
                animal = new SugarGlider(position);
            }
        } else {
            animal = new Wolf(weight, position);
        }
        AddAnimal(animal);
    }

    /**
     * NewCell
     * I.S: <code>c</code>, <code>i</code>, dan <code>j</code> terdefenisi
     * F.S: <code>Cell</code> dialokasi berdasarkan <code>c</code>
     *
     * @param c tipe <code>Cell</code> yang akan dialokasi
     * @param i posisi <code>Cell</code> pada <code>width</code>
     * @param j posisi <Code>Cell</Code> pada <code>length</code>
     */
    private void NewCell(char c, int i, int j) {
        switch (c) {
            case 'W':
                cells[i][j] = new Habitat('W');
                break;
            case 'A':
                cells[i][j] = new Habitat('A');
                break;
            case 'L':
                cells[i][j] = new Habitat('L');
                break;
            case 'X':
                cells[i][j] = new Road('X');
                break;
            case 'N':
                cells[i][j] = new Road('N');
                break;
            case 'r':
                cells[i][j] = new Road('r');
                break;
            case 'R':
                cells[i][j] = new Restaurant();
                break;
            case 'P':
                cells[i][j] = new Park();
                break;
        }
    }

    /**
     * Constructor tanpa parameter
     * Mengenerate kebun binatang dari file eksternal
     */
    public Zoo() {
        width = 33;
        length = 32;
        cells = new Cell[width][length];
        int i = 0;
        try {
            Scanner scanner = new Scanner(new FileInputStream("asset/map.txt"));
            StringBuffer line = new StringBuffer(length + 1);
            while (scanner.hasNext()) {
                line.delete(0, line.length());
                line.append(scanner.nextLine());
                for (int j = 0; j < length; ++j) {
                    NewCell(line.charAt(j), i, j);
                }
                ++i;
            }
            CageInit();
            animals = new ArrayList<Animal>();
            scanner = new Scanner(new FileInputStream("asset/animals.txt"));
            while (scanner.hasNext()) {
                line.delete(0, line.length());
                line.append(scanner.nextLine());
                StringBuffer id = new StringBuffer();
                int px = 0;
                int py = 0;
                int j = 0;
                int weight = 0;
                int decimal_weight = 0;
                while (line.charAt((j)) != '|') {
                    id.append(line.charAt((j)));
                    ++j;
                }
                ++j;
                while (line.charAt(j) != '|') {
                    px = 10 * px + line.charAt(j) - '0';
                    ++j;
                }
                ++j;
                while (j < line.length() && line.charAt(j) != '|') {
                    py = 10 * py + line.charAt(j) - '0';
                    ++j;
                }
                if (j < line.length()) {
                    if (line.charAt(j) == '|') {
                        ++j;
                        while (j < line.length()) {
                            if (line.charAt(j) != '.') {
                                weight = 10 * weight + line.charAt(j) - '0';
                            }
                            ++j;
                        }
                        if (j < line.length()) {
                            if (line.charAt(j) == '.') {
                                int multiplier = 1;
                                while (j < line.length()) {
                                    multiplier *= 0.1;
                                    decimal_weight += multiplier * (line.charAt(j) - '0');
                                    ++j;
                                }
                            }
                        }
                        weight += decimal_weight;
                    }
                }
                Pair position = new Pair(py, px);
                NewAnimal(id.toString(), weight, position);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Constructor dengan parameter
     * Mengenerate kebun binatang dengan input dari user
     *
     * @param _width  lebar kebun binatang
     * @param _length panjang kebun binatang
     */
    public Zoo(int _width, int _length) {
        width = _width;
        length = _length;
        cells = new Cell[width][length];
        Scanner scanner = new Scanner(System.in);
        StringBuffer line = new StringBuffer(length + 1);
        for (int i = 0; i < width; ++i) {
            line.delete(0, line.length());
            line.append(scanner.nextLine());
            for (int j = 0; j < length; ++j) {
                NewCell(line.charAt(j), i, j);
            }
        }
        CageInit();
        animals = new ArrayList<Animal>();
        char option;
        do {
            System.out.println("Ingin menambah hewan lagi? (y/n)");
            option = scanner.next().charAt(0);
            if (option == 'Y' || option == 'y') {
                StringBuffer id = new StringBuffer();
                char def_weight;
                int px;
                int py;
                float weight = 0;
                System.out.print("Input id hewan: ");
                id.append(scanner.nextLine());
                id.append(scanner.nextLine());
                System.out.print("Input posisi x: (kolom ke-)");
                px = scanner.nextInt();
                System.out.print("Input posisi y: (baris ke-)");
                py = scanner.nextInt();
                System.out.print("Apakah ingin menggunakan berat default? (y/n)");
                def_weight = scanner.next().charAt(0);
                if (def_weight == 'N' || def_weight == 'n') {
                    do {
                        System.out.print("Input berat : (> 0)");
                        weight = scanner.nextFloat();
                    } while (weight <= 0);
                }
                Pair position = new Pair(py, px);
                NewAnimal(id.toString(), weight, position);
            }
        } while (option == 'Y' || option == 'y');
    }

    /**
     * Display
     * I.S: <code>cells</code> terdefenisi
     * F.S: <code>cells</code> tercetak di layar
     */
    public void Display(int x1, int y1, int x2, int y2) {
        for (int i = x1; i <= x2; ++i) {
            for (int j = y1; j <= y2; ++j) {
                System.out.print(cells[i][j].GetSymbol());
            }
            System.out.println();
        }
    }

    /**
     * FindAnimal
     * Mengembalikan iterator hewan yang berada di pos
     *
     * @param pos posisi Animal yang akan dicari di list
     * @return int untuk indeks arraylist animals
     */
    public int FindAnimal(Pair pos) {
        int i = 0;
        while (i < animals.size()) {
            if (!animals.get(i).GetPos().Equals(pos)) {
                ++i;
            } else {
                break;
            }
        }
        return i;
    }

    /**
     * AddAnimal
     * I.S: animal terdefenisi
     * F.S: animal ditambahkan ke kebun binatang jika memenuhi syarat
     *
     * @param animal hewan yang akan ditambahkan
     */
    public void AddAnimal(Animal animal) {
        int posx = animal.GetPos().first;
        int posy = animal.GetPos().second;
        if (posx >= 0 && posx < width && posy >= 0 && posy < length) {
            int cage = cage_map[posx][posy];
            // cek if habitat dlu
            Set<String> compability = animal.GetCompatible();
            Pair pos;
            pos = new Pair(posx, posy);
            if (FindAnimal(pos) == animals.size()) {
                if (animal.GetHabitat().contains(cells[posx][posy].GetSymbol())) {
                    boolean compatible = true;
                    // cek apakah ada hewan yang tidak kompatible dengan hewan animal
                    int count = 0; // count animal yang ada di cage yang sama
                    for (int i = 0; i < animals.size(); i++) {
                        if (cage == cage_map[animals.get(i).GetPos().first][animals.get(i).GetPos().second]) {
                            count++;
                            if (compability.contains(animal.GetId())) {
                                compatible = false;
                            }
                        }
                    }
                    int max = 0;
                    for (int i = 0; i < width; i++) {
                        for (int j = 0; j < length; j++) {
                            if (cage_map[i][j] == cage) {
                                max++;
                            }
                        }
                    }
                    if (0.3 * max >= (count + 1) && compatible) { // masih muat cagenya
                        animals.add(animal);
                        cells[posx][posy].SetSymbol(animal.GetLegend());
                    }
                }
            }
        }
    }

    /**
     * DelAnimal dengan id
     * I.S: sembarang
     * F.S: <code>Animal</code> dengan id=_id dan number=_number dihapus jika ada
     *
     * @param _id     id jenis hewan
     * @param _number nomor pada jenis hewan tersebut
     */
    public void DelAnimal(String _id, int _number) {
        int i = 0;
        while (animals.get(i).GetId().equals(_id) && animals.get(i).GetNumber() != _number && i < animals.size() - 1) {
            ++i;
        }
        if (animals.get(i).GetId().equals(_id) && animals.get(i).GetNumber() == _number) {
            animals.remove(i);
        }
        int posx = animals.get(i).GetPos().first;
        int posy = animals.get(i).GetPos().second;
        cells[posx][posy].SetSymbol(cells[posx][posy].GetInitSymbol());
    }


    /**
     * DelAnimal dengan posisi
     * I.S: sembarang
     * F.S: <code>Animal</code> pada posisi x y
     *
     * @param x posisi pada width
     * @param y posisi pada length
     */
    public void DelAnimal(int x, int y) {
        Pair pos;
        pos = new Pair(x, y);
        if (FindAnimal(pos) != animals.size()) {
            int idx = FindAnimal(pos);
            DelAnimal(animals.get(idx).GetId(), animals.get(idx).GetNumber());
        }
    }

    /**
     * GetTotalMeat
     * Mengeluarkan total daging yang diperlukan di <code>Zoo</code> dalam kilogram
     *
     * @return float Total daging yang dibutuhkan <code>Zoo</code>
     */
    public float GetTotalMeat() {
        float sum = 0;
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).GetType() == 'K') {
                sum += animals.get(i).GetWeight() * animals.get(i).GetEat();
            } else if (animals.get(i).GetType() == 'O') {
                sum += 0.5 * animals.get(i).GetWeight() * animals.get(i).GetEat();
            }
        }
        return sum;
    }

    /**
     * GetTotalVegetables
     * Mengeluarkan total sayur yang diperlukan di <code>Zoo</code> dalam kilogram
     *
     * @return float Total sayur yang dibutuhkan <code>Zoo</code>
     */
    public float GetTotalVegetables() {
        float sum = 0;
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).GetType() == 'H') {
                sum += animals.get(i).GetWeight() * animals.get(i).GetEat();
            } else if (animals.get(i).GetType() == 'O') {
                sum += 0.5 * animals.get(i).GetWeight() * animals.get(i).GetEat();
            }
        }
        return sum;
    }

    /**
     * MoveAnimal dengan posisi
     * I.S: <code>cells</code> dan <code>cage_map</code> terdefenisi
     * F.S: <code>Animals</code> dengan <code>id</code>=<code>_id</code> dan
     * <code>number</code>=<code>_number</code> digerakkan ke arah <code>direction</code> jika ada
     *
     * @param pos       posisi hewan
     * @param direction 0 untuk ke atas, 1 untuk ke kiri, 2 untuk ke kanan, 3 untuk ke bawah
     */
    public void MoveAnimal(Pair pos, int direction) {
        int idx = FindAnimal(pos);
        if (idx != animals.size()) {
            if (cells[pos.first][pos.second].GetSekat(direction)) {
                boolean valid = false;
                int i = pos.first, j = pos.second;
                switch (direction) {
                    case 0:
                        if (i - 1 >= 0) {
                            valid = true;
                            --i;
                        }
                        break;
                    case 1:
                        if (j - 1 >= 0) {
                            valid = true;
                            --j;
                        }
                        break;
                    case 2:
                        if (j + 1 < length) {
                            valid = true;
                            ++j;
                        }
                        break;
                    case 3:
                        if (i + 1 < width) {
                            valid = true;
                            ++i;
                        }
                        break;
                }
                if (valid) {
                    Pair finalPos;
                    finalPos = new Pair(i, j);
                    if (FindAnimal(finalPos) == animals.size()) {
                        cells[animals.get(idx).GetPos().first][animals.get(idx).GetPos().second].
                                SetSymbol((cells[pos.first][pos.second].GetInitSymbol()).charValue());
                        animals.get(idx).Move(direction);
                        cells[animals.get(idx).GetPos().first][animals.get(idx).GetPos().second].
                                SetSymbol((animals.get(idx).GetLegend()));
                    }
                }
            }
        }
    }

    /**
     * MoveAnimal dengan id
     * I.S: <code>cells</code> dan <code>cage_map</code> terdefenisi
     * F.S: <code>Animal</code> dengan <code>id</code>=<code>_id</code> dan <code>number</code>=<code>_number</code>
     * digerakkan ke arah sesuai <code>direction</code> sebanyak 1 langkah jika memungkinkan (tidak melewati
     * <code>sekat</code>)
     *
     * @param _id       jenis hewan
     * @param _number   no number pada jenis hewan
     * @param direction 0 untuk ke atas, 1 untuk ke kiri, 2 untuk ke kanan, 3 untuk ke bawah
     */
    public void MoveAnimal(String _id, int _number, int direction) {
        int i = 0;
        while (!animals.get(i).GetId().equals(_id) && animals.get(i).GetNumber() != _number && i < animals.size() - 1) {
            ++i;
        }
        if (animals.get(i).GetId().equals(_id) && animals.get(i).GetNumber() == _number) {
            MoveAnimal(animals.get(i).GetPos(), direction);
        }
    }

    /**
     * MoveAllAnimal
     * I.S: <code>cells</code> dan <code>cage_map</code> terdefenisi
     * F.S: Semua hewan bergerak secara acak jika memungkinkan
     */
    public void MoveAllAnimal() {
        Random random = new Random();
        for (int i = 0; i < animals.size(); i++) {
            MoveAnimal(animals.get(i).GetPos(), random.nextInt(4));
        }
    }

    /**
     * ToggleSekat
     * I.S: <code>cells</code> dan <code>cage_map</code> terdefenisi
     * F.S: <code>Sekat</code> pada posisi i,j ke arah direction dibuka/ditutup jika memungkinkan (tidak membuka ke luar
     * cage)
     *
     * @param i         posisi pada width
     * @param j         posisi pada length
     * @param direction 0 untuk ke atas, 1 untuk ke kiri, 2 untuk ke kanan, 3 untuk ke bawah
     */
    public void ToggleSekat(int i, int j, int direction) {
        if (i >= 0 && i < width && j >= 0 && j < length) {
            char c = cells[i][j].GetInitSymbol();
            if (c == 'W' || c == 'L' || c == 'A') {
                switch (direction) {
                    case 0:
                        if (i - 1 >= 0) {
                            if (cage_map[i - 1][j] == cage_map[i][j]) {
                                cells[i][j].ToggleSekat(0);
                                cells[i - 1][j].ToggleSekat(3);
                            }
                        }
                        break;
                    case 1:
                        if (j - 1 >= 0) {
                            if (cage_map[i][j - 1] == cage_map[i][j]) {
                                cells[i][j].ToggleSekat(1);
                                cells[i][j - 1].ToggleSekat(2);
                            }
                        }
                        break;
                    case 2:
                        if (j + 1 < length) {
                            if (cage_map[i][j + 1] == cage_map[i][j]) {
                                cells[i][j].ToggleSekat(2);
                                cells[i][j + 1].ToggleSekat(1);
                            }
                        }
                        break;
                    case 3:
                        if (i + 1 < width) {
                            if (cage_map[i + 1][j] == cage_map[i][j]) {
                                cells[i][j].ToggleSekat(3);
                                cells[i + 1][j].ToggleSekat(0);
                            }
                        }
                        break;
                }
            }
        }
    }

    /**
     * ToggleAllSekat
     * I.S: <code>cells</code> terdefenisi
     * F.S: Semua <Code>Sekat</Code> terbuka/tertutup jika memungkinkan
     */
    public void ToggleAllSekat() {
        for (int i = 0; i < width; ++i) {
            for (int j = 0; j < length; ++j) {
                for (int k = 0; k < 2; ++k) {
                    ToggleSekat(i, j, k);
                }
            }
        }
    }

    /**
     * Tour
     * I.S: <code>cage_map</code> terdefenisi
     * F.S: Melakukan tour pada kebun binatang
     * Jalur tour akan dipilih secara acak
     * Settiap <code>Cell</code> yang ada di samping road yang dilalui akan diinteract.
     * Suatu <code>Cell</code> adalah bagian dari suatu cage, maka semua binatang pada cage tersebut akan diinteract
     */
    public void Tour() {
        Set<Pair> entrance;
        entrance = new HashSet<Pair>();
        boolean vis[][];
        vis = new boolean[width][length];
        for (int i = 0; i < width; ++i) {
            for (int j = 0; j < length; ++j) {
                if (cells[i][j].GetSymbol() == 'N') {
                    Pair pairInput = new Pair(i, j);
                    entrance.add(pairInput);
                }
                vis[i][j] = false;
            }
        }
        Random random = new Random();
        int selection = random.nextInt(entrance.size());
        Stack<Pair> dstack = new Stack<Pair>();
        ArrayList<Integer> route = new ArrayList<Integer>();
        List<Pair> listEntrance = new ArrayList<Pair>(entrance);
        int posi = listEntrance.get(selection).first, posj = listEntrance.get(selection).second;
        dstack.push(listEntrance.get(selection));
        boolean found = false;
        while (!found) {
            int i = dstack.peek().first, j = dstack.peek().second;
            vis[i][j] = true;
            if (cells[i][j].GetSymbol() == 'X') {
                found = true;
                route.remove((Integer) 4);
            } else {
                char c;
                HashSet<Integer> choice;
                choice = new HashSet<Integer>();
                if (i - 1 >= 0) {
                    c = cells[i - 1][j].GetSymbol();
                    if (c == 'r' || c == 'X') {
                        if (!vis[i - 1][j]) {
                            choice.add(new Integer(0));
                        }
                    }
                }
                if (j - 1 >= 0) {
                    c = cells[i][j - 1].GetSymbol();
                    if (c == 'r' || c == 'X') {
                        if (!vis[i][j - 1]) {
                            choice.add(new Integer(1));
                        }
                    }
                }
                if (j + 1 < length) {
                    c = cells[i][j + 1].GetSymbol();
                    if (c == 'r' || c == 'X') {
                        if (!vis[i][j + 1]) {
                            choice.add(new Integer(2));
                        }
                    }
                }
                if (i + 1 < width) {
                    c = cells[i + 1][j].GetSymbol();
                    if (c == 'r' || c == 'X') {
                        if (!vis[i + 1][j]) {
                            choice.add(new Integer(3));
                        }
                    }
                }
                if (choice.size() > 0) {
                    selection = random.nextInt(choice.size());
                    ArrayList<Integer> listChoice = new ArrayList<Integer>(choice);
                    route.add(listChoice.get(selection));
                    switch (listChoice.get(selection)) {
                        case 0:
                            dstack.push(new Pair(i - 1, j));
                            break;
                        case 1:
                            dstack.push(new Pair(i, j - 1));
                            break;
                        case 2:
                            dstack.push(new Pair(i, j + 1));
                            break;
                        case 3:
                            dstack.push(new Pair(i + 1, j));
                            break;
                    }
                } else {
                    dstack.pop();
                    route.remove(route.size() - 1);
                }
            }
        }
        boolean VisCage[] = new boolean[cage_nb + 1];
        for (int i = 0; i <= cage_nb; ++i) {
            VisCage[i] = false;
        }
        while (!route.isEmpty()) {
            if (posi - 1 >= 0) {
                char c = cells[posi - 1][posj].GetInitSymbol();
                if (c == 'P' || c == 'R') {
                    cells[posi - 1][posj].Interact();
                } else if (c == 'W' || c == 'L' || c == 'A') {
                    if (!VisCage[cage_map[posi - 1][posj]]) {
                        InteractCage(new Pair(posi - 1, posj), cage_map[posi - 1][posj]);
                        VisCage[cage_map[posi - 1][posj]] = true;
                    }
                }
            }
            if (posj - 1 >= 0) {
                char c = cells[posi][posj - 1].GetInitSymbol();
                if (c == 'P' || c == 'R') {
                    cells[posi][posj - 1].Interact();
                } else if (c == 'W' || c == 'L' || c == 'A') {
                    if (!VisCage[cage_map[posi][posj - 1]]) {
                        InteractCage(new Pair(posi, posj - 1), cage_map[posi][posj - 1]);
                        VisCage[cage_map[posi][posj - 1]] = true;
                    }
                }
            }
            if (posj + 1 < length) {
                char c = cells[posi][posj + 1].GetInitSymbol();
                if (c == 'P' || c == 'R') {
                    cells[posi][posj + 1].Interact();
                } else if (c == 'W' || c == 'L' || c == 'A') {
                    if (!VisCage[cage_map[posi][posj + 1]]) {
                        InteractCage(new Pair(posi, posj + 1), cage_map[posi][posj + 1]);
                        VisCage[cage_map[posi][posj + 1]] = true;
                    }
                }
            }
            if (posi + 1 < width) {
                char c = cells[posi + 1][posj].GetInitSymbol();
                if (c == 'P' || c == 'R') {
                    cells[posi + 1][posj].Interact();
                } else if (c == 'W' || c == 'L' || c == 'A') {
                    if (!VisCage[cage_map[posi + 1][posj]]) {
                        InteractCage(new Pair(posi + 1, posj), cage_map[posi + 1][posj]);
                        VisCage[cage_map[posi + 1][posj]] = true;
                    }
                }
            }
            switch (route.get(0)) {
                case 0:
                    --posi;
                    break;
                case 1:
                    --posj;
                    break;
                case 2:
                    ++posj;
                    break;
                case 3:
                    ++posi;
                    break;
            }
            route.remove(0);
        }
    }

    /**
     * InteractCage
     * I.S: <code>cage_map</code> terdefenisi
     * F.S: Melakukan interaksi dengan semua hewan yang ada di cage yang sama. Cage memiliki posisi
     * <code>pos</code> dan nomor <code>cage_number</code>
     *
     * @param pos         posisi cage
     * @param cage_number nomor cage
     */
    public void InteractCage(Pair pos, int cage_number) {
        boolean Vis[][];
        Vis = new boolean[width][length];
        for (int i = 0; i < width; ++i) {
            for (int j = 0; j < length; ++j) {
                Vis[i][j] = false;
            }
        }
        Queue<Pair> bqueue;
        bqueue = new LinkedList<Pair>();
        bqueue.add(pos);
        Vis[pos.first][pos.second] = true;
        while (bqueue.peek() != null) {
            int i = bqueue.element().first, j = bqueue.element().second;
            bqueue.remove();
            Pair pair = new Pair(i, j);
            if (FindAnimal(pair) != animals.size()) {
                animals.get(FindAnimal(pair)).Interact();
            }
            if (i - 1 >= 0) {
                if (cage_map[i - 1][j] == cage_number) {
                    if (!Vis[i - 1][j]) {
                        Pair pairInput;
                        pairInput = new Pair((i - 1), j);
                        bqueue.add(pairInput);
                        Vis[i - 1][j] = true;
                    }
                }
            }
            if (j - 1 >= 0) {
                if (cage_map[i][j - 1] == cage_number) {
                    if (!Vis[i][j - 1]) {
                        Pair pairInput;
                        pairInput = new Pair(i, (j - 1));
                        bqueue.add(pairInput);
                        Vis[i][j - 1] = true;
                    }
                }
            }
            if (j + 1 < length) {
                if (cage_map[i][j + 1] == cage_number) {
                    if (!Vis[i][j + 1]) {
                        Pair pairInput;
                        pairInput = new Pair(i, (j + 1));
                        bqueue.add(pairInput);
                        Vis[i][j + 1] = true;
                    }
                }
            }
            if (i + 1 < width) {
                if (cage_map[i + 1][j] == cage_number) {
                    if (!Vis[i + 1][j]) {
                        Pair pairInput;
                        pairInput = new Pair((i + 1), j);
                        bqueue.add(pairInput);
                        Vis[i + 1][j] = true;
                    }
                }
            }
        }
    }
}