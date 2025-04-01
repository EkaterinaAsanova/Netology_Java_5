package ru.netology.services;

public class CalculationSchedule {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        int wastes;    //траты 
        for (int month = 1; month <= 12; month++) {
            if (money < threshold) { // можем ли отдыхать?
                System.out.println("Месяц " + month + " Денег " + money +
                        " Придётся работать. Заработал + " + income + " , потратил - "
                        + expenses);

                money = money + (income - expenses);


            } else {

                wastes = (money - expenses) - ((money - expenses) / 3);

                System.out.println("Месяц " + month + " Денег " + money +
                        " Буду отдыхать. Потратил -" + expenses +
                        " затем ещё -" + wastes);
                money = money - (wastes + expenses);
                count++;
            }
        }
        System.out.println("Количество месяцев отдыха: " + count);
        return count;
    }

}
