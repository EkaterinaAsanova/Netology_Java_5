package ru.netology.services;

public class Main {

    public static void main(String[] args) {

        CalculationSchedule service = new CalculationSchedule();
        service.calculate(100_000, 60_000, 150_000);
    }
}