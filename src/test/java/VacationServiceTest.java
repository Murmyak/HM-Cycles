import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.VacationService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VacationServiceTest {

    private final VacationService vacationService = new VacationService();

    @Test
    public void shouldCalculateForFirstExample() {
        int income = 10000; // Доход
        int expenses = 3000; // Обязательные расходы
        int threshold = 20000; // Порог
        int expectedVacationMonths = 3; // Ожидаемое количество месяцев отдыха
        int actualVacationMonths = vacationService.calculateVacationMonths(income, expenses, threshold);
        assertEquals(expectedVacationMonths, actualVacationMonths);
    }

    @Test
    public void shouldCalculateForSecondExample() {
        int income = 100000; // Доход
        int expenses = 60000; // Обязательные расходы
        int threshold = 150000; // Порог
        int expectedVacationMonths = 2; // Ожидаемое количество месяцев отдыха
        int actualVacationMonths = vacationService.calculateVacationMonths(income, expenses, threshold);
        assertEquals(expectedVacationMonths, actualVacationMonths);
    }
}