package task3;

/**
 * Метод выводит цвет в зависимости от значения переменной value.
 * Если value <= 0, выводится "Красный".
 * Если 0 < value <= 100, выводится "Желтый".
 * Если value > 100, выводится "Зеленый".
 */
public class PrintColor {
    
    public static void printColor() {
        int value = 50; // Инициализируем переменную value

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void main(String[] args) {
        printColor(); // Вызываем метод
    }
}
