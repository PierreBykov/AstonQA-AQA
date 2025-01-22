package lesson3;
public class Main {
    public static void main(String[] args) {
        Tasks tasks = new Tasks();

        // 1. PrintThreeWords
        tasks.printThreeWords();

        // 2. CheckSumSign
        tasks.checkSumSign();

        // 3. PrintColor
        tasks.printColor();

        // 4. CompareNumbers
        tasks.compareNumbers();

        // 5. CheckSumInRange
        System.out.println("Сумма в диапазоне 10–20: " + tasks.isSumInRange(10, 5));

        // 6. CheckNumberSign
        tasks.checkNumberSign(-5);

        // 7. IsNegative
        System.out.println("Число отрицательное: " + tasks.isNegative(-3));

        // 8. PrintString
        tasks.printString("Привет, мир!", 3);

        // 9. LeapYearChecker
        System.out.println("Год високосный: " + tasks.isLeapYear(2025));

        // 10. InvertArray
        int[] inverted = tasks.invertArray(new int[]{1, 0, 1, 0, 1});
        System.out.println("Инвертированный массив: " + java.util.Arrays.toString(inverted));

        // 11. FillArray
        int[] filledArray = tasks.fillArray();
        System.out.println("Массив от 1 до 100: " + java.util.Arrays.toString(filledArray));

        // 12. ModifyArray
        int[] modified = tasks.modifyArray(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1});
        System.out.println("Модифицированный массив: " + java.util.Arrays.toString(modified));

        // 13. FillDiagonals
        int[][] diagonals = tasks.fillDiagonals(5);
        System.out.println("Массив с диагоналями:");
        for (int[] row : diagonals) {
            System.out.println(java.util.Arrays.toString(row));
        }

        // 14. CreateArray
        int[] createdArray = tasks.createArray(5, 7);
        System.out.println("Массив с одинаковыми значениями: " + java.util.Arrays.toString(createdArray));
    }
}
