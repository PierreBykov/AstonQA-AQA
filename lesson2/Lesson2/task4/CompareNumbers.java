package task4;

/**
 * Метод сравнивает два числа a и b.
 * Если a >= b, выводится сообщение "a >= b".
 * Если a < b, выводится сообщение "a < b".
 */
public class CompareNumbers {
    
    public static void compareNumbers() {
        int a = 10;  // Инициализируем переменную a
        int b = 5;   // Инициализируем переменную b

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void main(String[] args) {
        compareNumbers(); // Вызываем метод
    }
}
