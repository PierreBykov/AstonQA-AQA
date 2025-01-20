/**
 * Класс для заполнения диагоналей квадратного массива.
 */
public class DiagonalArray {

    /**
     * Заполняет диагональные элементы массива единицами.
     * @param size размер массива
     * @return двумерный массив
     */
    public int[][] fillDiagonals(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            array[i][i] = 1; // Основная диагональ
        }
        return array;
    }
}
