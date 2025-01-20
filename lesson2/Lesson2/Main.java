public class Main {
    public static void main(String[] args) {
        // 1. PrintThreeWords
        PrintThreeWords task1 = new PrintThreeWords();
        task1.printThreeWords();

        // 2. CheckSumSign
        CheckSumSign task2 = new CheckSumSign();
        task2.checkSumSign();

        // 3. PrintColor
        PrintColor task3 = new PrintColor();
        task3.printColor();

        // 4. CompareNumbers
        CompareNumbers task4 = new CompareNumbers();
        task4.compareNumbers();

        // 5. CheckSumInRange
        CheckSumInRange task5 = new CheckSumInRange();
        boolean isInRange = task5.isSumInRange(10, 5);
        System.out.println("Сумма в пределах от 10 до 20 включительно: " + isInRange);

        // 6. CheckNumberSign
        CheckNumberSign task6 = new CheckNumberSign();
        task6.checkNumberSign(-5);

        // 7. IsNegativeNumber
        IsNegativeNumber task7 = new IsNegativeNumber();
        boolean isNegative = task7.isNegative(-3);
        System.out.println("Число отрицательное: " + isNegative);

        // 8. PrintStringNTimes
        PrintStringNTimes task8 = new PrintStringNTimes();
        task8.printString("Привет, мир!", 3);

        // 9. LeapYearChecker
        LeapYearChecker task9 = new LeapYearChecker();
        boolean isLeapYear = task9.isLeapYear(2024);
        System.out.println("Год високосный: " + isLeapYear);

        // 10. InvertArray
        InvertArray task10 = new InvertArray();
        int[] array10 = {1, 0, 1, 0, 1};
        int[] invertedArray = task10.invertArray(array10);
        System.out.print("Инвертированный массив: ");
        for (int value : invertedArray) {
            System.out.print(value + " ");
        }
        System.out.println();

        // 11. FillArray
        FillArray task11 = new FillArray();
        int[] array11 = task11.fillArray();
        System.out.print("Заполненный массив: ");
        for (int value : array11) {
            System.out.print(value + " ");
        }
        System.out.println();

        // 12. ModifyArray
        ModifyArray task12 = new ModifyArray();
        int[] array12 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] modifiedArray = task12.modifyArray(array12);
        System.out.print("Модифицированный массив: ");
        for (int value : modifiedArray) {
            System.out.print(value + " ");
        }
        System.out.println();

        // 13. DiagonalArray
        DiagonalArray task13 = new DiagonalArray();
        int[][] array13 = task13.fillDiagonals(5);
        System.out.println("Массив с заполненными диагоналями:");
        for (int[] row : array13) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        // 14. CreateArray
        CreateArray task14 = new CreateArray();
        int[] array14 = task14.createArray(5, 7);
        System.out.print("Массив с одинаковыми значениями: ");
        for (int value : array14) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
