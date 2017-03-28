package zoo;

import java.util.ArrayList;
import java.util.Random;

/**
 * \brief Class Zoo
 * \details Kelas Zoo yang berisi kebun binatang itu sendiri beserta hewan-hewannya
 */
public class Zoo {
		private int width;
		/**
		 * < dimensi zoo; jumlah baris
		 */
		private int length;
		/**
		 * < dimensi zoo; jumlah kolom
		 */
		private Cell[][] cells;
		/**
		 * < matriks Cell yang dimiliki zoo
		 */
		private ArrayList<Animal> animals;
		/**
		 * < daftar Animals yang ada dalam zoo
		 */
		private int[][] cage_map;
		/**
		 * < matriks penanda nomor cage dalam zoo
		 */
		private int cage_nb; /**< jumlah cage yang ada dalam zoo*/

		/**
		 * \brief initCage
		 * \details Mengenerate cage dari matrix cell
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
							int[] array_i = new int [4];
							int[] array_j = new int [4];
							for (int k = 0; k < 4; ++k) {
								array_i[k] = i;
								array_j[k] = j;
							}
							boolean cek = true;
							cage_map[i][j] = counter;
							Pair[] moveable = new Pair [12];
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
								moveable[move] = new Pair (moveable[count-1].first, moveable[count-1].second);
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
							Pair[] moveable = new Pair [4];
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
									dummy= true;
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
}
