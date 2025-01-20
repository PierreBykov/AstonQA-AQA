package task5;

/**
 * Метод проверяет, что сумма двух чисел a и b лежит в пределах от 10 до 20 (включительно).
 * Если сумма в пределах диапазона, возвращается true, иначе - false.
 *
 * @param a первое число
 * @param b второе число
 * @return true, если сумма в пределах от 10 до 20, иначе false
 */
public class CheckSumInRange {
    
    public static boolean checkSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20; // Проверка, что сумма в пределах от 10 до 20
    }

    public static void main(String[] args) {
        System.out.println(checkSumInRange(5, 6)); // Выводит true, так как 5 + 6 = 11
        System.out.println(checkSumInRange(5, 15)); // Выводит false, так как 5 + 15 = 20
    }
}
