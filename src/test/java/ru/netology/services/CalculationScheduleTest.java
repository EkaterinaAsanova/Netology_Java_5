package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CalculationScheduleTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/money.csv")
    public void CalculationScheduleVacation(int expected, int income, int expenses, int threshold) {
        CalculationSchedule service = new CalculationSchedule();
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }
}
