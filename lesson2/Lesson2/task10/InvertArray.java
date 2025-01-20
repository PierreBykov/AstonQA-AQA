/**
 * Класс для инвертирования элементов массива.
 */
public class InvertArray {

    /**
     * Инвертирует элементы массива.
     * @param array исходный массив
     * @return инвертированный массив
     */
    public int[] invertArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
        return array;
    }
}
