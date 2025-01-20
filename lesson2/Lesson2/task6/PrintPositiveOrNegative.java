package task6;

/**
 * Метод проверяет, положительное ли переданное число.
 * Ноль считается положительным числом.
 * 
 * @param number целое число, которое проверяется на положительность
 */
public class PrintPositiveOrNegative {
    
    public static void printPositiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static void main(String[] args) {
        printPositiveOrNegative(10);  // Положительное
        printPositiveOrNegative(-5);  // Отрицательное
        printPositiveOrNegative(0);   // Положительное
    }
}
