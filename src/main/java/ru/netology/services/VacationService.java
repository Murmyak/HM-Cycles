package ru.netology.services;

public class VacationService {

    public int calculateVacationMonths(int income, int expenses, int threshold) {
        int count = 0; // Счетчик месяцев отдыха
        int money = 0; // Количество денег на счету

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // Проверяем, можем ли мы отдохнуть
                count++; // Увеличиваем счетчик месяцев отдыха
                money = (money - expenses) / 3; // Уменьшаем деньги на обязательные расходы

            } else {
                money = money + income; // Увеличиваем деньги на доход
                money = money - expenses; // Уменьшаем деньги на обязательные расходы
            }
        }
        return count; // Возвращаем количество месяцев отдыха
    }
}