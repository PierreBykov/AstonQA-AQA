package task2;

/**
 * Метод вычисляет сумму двух чисел a и b.
 * Если сумма больше или равна 0, выводится сообщение "Сумма положительная".
 * Если сумма меньше 0, выводится сообщение "Сумма отрицательная".
 */
public class CheckSumSign {
    
    public static void checkSumSign() {
        int a = 5;  // Инициализируем переменную a
        int b = -3; // Инициализируем переменную b
        int sum = a + b; // Вычисляем сумму

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void main(String[] args) {
        checkSumSign(); // Вызываем метод
    }
}
