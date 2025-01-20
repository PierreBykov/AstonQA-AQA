/**
 * Класс для заполнения массива числами от 1 до 100.
 */
public class FillArray {

    /**
     * Заполняет массив числами от 1 до 100.
     * @return массив длиной 100
     */
    public int[] fillArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }
}
