/**
 * Класс для проверки, является ли год високосным.
 */
public class LeapYearChecker {

    /**
     * Проверяет, является ли год високосным.
     * @param year год для проверки
     * @return true, если год високосный, иначе false
     */
    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
