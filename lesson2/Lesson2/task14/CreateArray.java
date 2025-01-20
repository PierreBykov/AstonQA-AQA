/**
 * Класс для создания массива с заданной длиной и значением.
 */
public class CreateArray {

    /**
     * Создает массив заданной длины, заполненный заданным значением.
     * @param len длина массива
     * @param initialValue значение для заполнения
     * @return созданный массив
     */
    public int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}
