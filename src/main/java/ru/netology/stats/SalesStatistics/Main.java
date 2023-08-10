package ru.netology.stats.SalesStatistics;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();


        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; // Продажи

        System.out.println(service.sum(sales)); // сумму всех продаж
        System.out.println(service.averageSale(sales)); //средня сумма продаж в месяц
        System.out.println(service.maximumAmount(sales)); //номер месяца продажи на максимальную сумму
        System.out.println(service.minimumSales(sales)); //номер месяца продажи на минимальную сумму
        System.out.println(service.numberOfMonthsBelowAverage(sales)); // количество месяцев ниже среднего
        System.out.println(service.numberOfMonthsAboveAverage(sales)); // количество месяцев выше среднего

    }
}
