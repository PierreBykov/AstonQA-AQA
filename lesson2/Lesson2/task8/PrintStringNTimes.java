/**
 * Класс для печати строки заданное количество раз.
 */
public class PrintStringNTimes {

    /**
     * Печатает строку указанное количество раз.
     * @param text строка для печати
     * @param count количество повторений
     */
    public void printString(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }
}
