package task7;

/**
 * Метод проверяет, является ли число отрицательным.
 * Ноль считается положительным числом.
 *
 * @param number целое число, которое проверяется на отрицательность
 * @return true, если число отрицательное, иначе false
 */
public class IsNegative {
    
    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void main(String[] args) {
        System.out.println(isNegative(-1)); // true
        System.out.println(isNegative(5));  // false
        System.out.println(isNegative(0));  // false
    }
}
