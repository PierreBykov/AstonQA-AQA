/**
 * Класс для модификации массива.
 */
public class ModifyArray {

    /**
     * Умножает элементы массива меньше 6 на 2.
     * @param array исходный массив
     * @return модифицированный массив
     */
    public int[] modifyArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        return array;
    }
}
